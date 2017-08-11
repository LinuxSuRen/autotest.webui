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

import com.surenpi.autotest.webui.core.ElementFilter;
import com.surenpi.autotest.webui.core.ElementFilterable;
import com.surenpi.autotest.webui.ui.Text;

/**
 * @author suren
 * @since 2017年8月11日 下午4:55:03
 */
public class Texts extends Text implements ElementFilterable
{
    private ElementFilter filter;

    @Override
    public void setFilter(ElementFilter filter)
    {
        this.filter = filter;
    }

    @Override
    public Text fillValue(String value)
    {
//        filter.filter(lis);
        
        return super.fillValue(value);
    }

    @Override
    public Text fillValue()
    {
        // TODO Auto-generated method stub
        return super.fillValue();
    }

}
