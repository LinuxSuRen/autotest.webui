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

package com.surenpi.autotest.webui.ui.multi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.surenpi.autotest.webui.action.MultiValueEditor;
import com.surenpi.autotest.webui.core.ElementFilter;
import com.surenpi.autotest.webui.core.ElementFilterable;
import com.surenpi.autotest.webui.ui.AbstractElement;

/**
 * @author suren
 * @since 2017年8月11日 下午4:55:03
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Texts extends AbstractElement implements ElementFilterable<Texts>
{
    private ElementFilter filter;
    
    @Autowired
    private MultiValueEditor multiValueEditor;

    @Override
    public Texts setFilter(ElementFilter filter)
    {
        this.filter = filter;
        return this;
    }

    public Texts fillValue(String value)
    {
        multiValueEditor.setFilter(filter);
        multiValueEditor.setValue(this, value);
        
        return this;
    }

    public Texts fillValue()
    {
        multiValueEditor.setFilter(filter);
//        multiValueEditor.setValue(this, getValue());
        
        return this;
    }

    @Override
    public boolean isEnabled()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isHidden()
    {
        // TODO Auto-generated method stub
        return false;
    }

}
