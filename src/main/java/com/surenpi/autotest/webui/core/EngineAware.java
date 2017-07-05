package com.surenpi.autotest.webui.core;

/**
 * 引擎感知接口
 * @author suren
 */
public interface EngineAware
{
    /**
     * 通过该接口能获取原始的api
     * @param util
     */
    void setEngine(WebUIEngine webUIEngine);
}
