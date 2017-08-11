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
 * 元素过滤接口，方法中返回true的话，就会被排除掉
 * @author suren
 * @since 2017年8月11日 下午4:00:07
 */
public interface ElementFilter
{
    /**
     * @param tagName 标签名称
     * @param attrName 属性名称
     * @param attrValue 属性值
     * @param text 标签文本
     * @return
     */
    boolean filter(String tagName, String attrName, String attrValue, String text);
}
