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

import com.surenpi.autotest.webui.action.AdvanceValueEditor;
import com.surenpi.autotest.webui.action.ClickAble;
import com.surenpi.autotest.webui.action.ValueEditor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 文本框封装
 * 
 * @author suren
 * @since jdk1.6 2016年6月29日
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Text extends AbstractElement
{
	private String	value;
	private String callback;

	@Autowired
	private ValueEditor valueEditor;
	@Autowired
	private AdvanceValueEditor advanceValueEditor;
	@Autowired
	private ClickAble clickAble;

	public Text()
	{
	}

	public Text(String value)
	{
		this.value = value;
	}
	
	/**
	 * 使用给定数据来填充
	 * @param value
	 * @return
	 */
	public Text fillValue(String value)
	{
		setValue(value);
		
		return fillValue();
	}

	/**
	 * 自动填充数据，不用关心数据来源
	 */
	public Text fillValue()
	{
		String val4Fill = value;
		
		valueEditor.setValue(this, val4Fill);
		
		return this;
	}
	
	public Text appendValue()
	{
		String val4Fill = value;
		
		advanceValueEditor.appendValue(this, val4Fill);
		
		return this;
	}
	
	public Text fillNotBlankValue()
	{
		String val4Fill = value;
		
		advanceValueEditor.fillNotBlankValue(this, val4Fill);
		
		return this;
	}

	/**
	 * @return 预备的数据
	 */
	public String getValue()
	{
		return value;
	}

	/**
	 * 预备数据
	 * @param value
	 */
	public Text setValue(String value)
	{
		this.value = value;
		return this;
	}
	
	/**
	 * 执行点击操作
	 */
	public Text click()
	{
		getClickAble().click(this);
		return this;
	}
	
	/**
	 * 执行回车操作
	 * @return
	 */
	public Text performEnter()
	{
		valueEditor.submit(this);
		
		return this;
	}

	@Override
	public boolean isEnabled()
	{
		return valueEditor.isEnabled(this);
	}

	@Override
	public boolean isHidden()
	{
		return valueEditor.isHidden(this);
	}

	/**
	 * @return 可填入值的行为接口
	 */
	public ValueEditor getValueEditor()
	{
		return valueEditor;
	}

	/**
	 * 设置用于填入值的行为
	 * @param valueEditor
	 */
	public void setValueEditor(ValueEditor valueEditor)
	{
		this.valueEditor = valueEditor;
	}

	/**
	 * @return 可点击的行为接口
	 */
	public ClickAble getClickAble()
	{
		return clickAble;
	}

	/**
	 * 设置可点击的行为
	 * @param clickAble
	 */
	public void setClickAble(ClickAble clickAble)
	{
		this.clickAble = clickAble;
	}

	public String getCallback()
	{
		return callback;
	}

	public void setCallback(String callback)
	{
		this.callback = callback;
	}
}
