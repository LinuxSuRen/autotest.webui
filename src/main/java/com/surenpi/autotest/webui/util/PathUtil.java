/*
 *
 *  * Copyright 2002-2007 the original author or authors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

/**
 * http://surenpi.com
 */
package com.surenpi.autotest.webui.util;

import org.apache.commons.io.IOUtils;

import java.io.*;

/**
 * 用于获取全局的文件根目录的工具类
 * @author suren
 * @date 2016年12月27日 上午8:12:18
 */
public class PathUtil
{
	/**
	 * @return 用于保存框架缓存数据的根目录，如果不存在会自动创建
	 */
	public static File getRootDir()
	{
		String rootDir = System.getProperty("user.home", ".");
		File rootFile = new File(rootDir, ".autotest");
		if(!rootFile.isDirectory())
		{
			rootFile.mkdirs();
		}
		
		return rootFile;
	}
	
	/**
	 * 如果存在，则跳过，不复制
	 * @param input
	 * @param fileName
	 * @return
	 */
	public static File copyFileToRoot(InputStream input, String fileName)
	{
		File rootFile = PathUtil.getRootDir();
		File targetFile = new File(rootFile, fileName);
		if(!targetFile.isFile())
		{
			copyFileToRoot(input, targetFile);
		}
		
		return targetFile;
	}
	
	/**
	 * 把目标文件拷贝到框架的缓存根目录中
	 * @param input 需要调用者自行调用该输入流的close方法
	 * @param targetFile
	 * @return
	 */
	public static boolean copyFileToRoot(InputStream input, File targetFile)
	{
		try(OutputStream output = new FileOutputStream(targetFile))
		{
			IOUtils.copy(input, output);
			
			return true;
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		return false;
	}
}
