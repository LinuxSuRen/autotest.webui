package com.surenpi.autotest.webui;

public interface PageConditions {
    void urlToBe(String url);
    void urlNotToBe(String url);
    void urlContains(String url);
    void urlNotContains(String url);
    void urlMatches(String url);
    void urlNotMatches(String url);
}
