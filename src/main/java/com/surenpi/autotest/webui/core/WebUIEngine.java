/*
 * Copyright 2002-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.surenpi.autotest.webui.core;

/**
 * webui自动化测试驱动接口
 * @author suren
 * @date 2017年7月5日 上午10:26:35
 */
public interface WebUIEngine
{
	/**
	 * 获取Page页面子类
	 * @param page
	 * @return
	 */
	<T> T getPage(Class<T> page);
	
	/**
	 * 获取模块类
	 * @param module
	 * @return
	 */
	<T> T getModule(Class<T> module);
	
	<T> T getForm(Class<T> form);
	
	/**
	 * 打开浏览器地址
	 * @param url
	 */
	void open(String url);
	
	/**
	 * 原始的驱动类
	 * @return
	 */
	<T> T getDriver();
}
