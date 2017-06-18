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

package com.surenpi.autotest.webui.ui;

import com.surenpi.autotest.webui.action.CheckAble;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 复选框组，代表一组HTML中的复选框
 * @author suren
 * @date Jul 16, 2016 9:11:49 PM
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CheckBoxGroup extends AbstractElement
{
	@Autowired
	private CheckAble checkAble;
	
	/** 待选择的文本 */
	private String targetText;
	private String value;
	
	/**
	 * 根据待选择文本来选择
	 * @deprecated 推荐使用selectByValue()方法代替
	 * @return
	 */
	public boolean selectByText()
	{
		return selectByText(targetText);
	}
	
	/**
	 * 根据文本选择
	 * @deprecated 推荐使用selectByValue(String value)方法代替
	 * @param text
	 * @return
	 */
	public boolean selectByText(String text)
	{
		checkAble.checkByText(this, text);
		
		return true;
	}
	
	/**
	 * @deprecated 推荐使用selectByValues(String ...values)方法代替
	 * @see #selectByText(String)
	 * @param texts
	 * @return
	 */
	public int selectByTextArray(String ...texts)
	{
		int count = 0;
		if(texts == null)
		{
			return count;
		}
		
		for(String text : texts)
		{
			if(selectByText(text))
			{
				count++;
			}
		}
		
		return count;
	}
	
	/**
	 * 根据预备好的值来选择
	 */
	public void selectByValue()
	{
		selectByValue(this.value);
	}
	
	/**
	 * 根据给定的值来选择
	 * @param value
	 */
	public void selectByValue(String value)
	{
		checkAble.checkByValue(this, value);
	}
	
	/**
	 * 根据给定的值列表来选择
	 * @param values
	 */
	public void selectByValues(String ...values)
	{
		if(values == null)
		{
			return;
		}
		
		for(String valueItem : values)
		{
			selectByValue(valueItem);
		}
	}

	@Override
	public boolean isEnabled()
	{
		return false;
	}

	@Override
	public boolean isHidden()
	{
		return false;
	}

	/**
	 * @return 待选择的文本
	 */
	public String getTargetText()
	{
		return targetText;
	}

	/**
	 * 设置待选择的文本
	 * @param targetText
	 */
	public void setTargetText(String targetText)
	{
		this.targetText = targetText;
	}

	/**
	 * 获取给复选框设置的值
	 * @return
	 */
	public String getValue()
	{
		return value;
	}

	/**
	 * 只要复选框的值
	 * @param value
	 */
	public void setValue(String value)
	{
		this.value = value;
	}

}
