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

package com.surenpi.autotest.webui.core;

/**
 * 定位方法枚举
 * @author suren
 * @date 2017年6月7日 下午7:00:15
 */
public enum LocatorType
{
	BY_ID("byId"),
	/** 根据标签属性name */
	BY_NAME("byName"),
	BY_XPATH("byXpath"),
	/** 根据标签名称 */
	BY_TAGNAME("byTagName"),
	BY_CSS("byCss"),
	BY_LINK_TEXT("byLinkText"),
	BY_PARTIAL_LINK_TEXT("byPartialLinkText"),
	
	/** 根据iframe框架序号，从0开始 */
	BY_FRAME_INDEX("byIFrameIndex"),
	/** 根据iframe框架名称 */
	BY_FRAME_NAME("byIFrame");
	
	private String name;
	
	LocatorType(String name)
	{
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
}
