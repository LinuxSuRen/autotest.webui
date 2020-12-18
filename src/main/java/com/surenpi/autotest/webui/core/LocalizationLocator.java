package com.surenpi.autotest.webui.core;

import java.util.Locale;

/**
 * @author linuxsuren
 * Same selements locators depends on localization. For example, the name of a button might be
 * different with multiple languages
 * @see LocalizationLocatorAware
 */
public interface LocalizationLocator {
    /** Represents the language setting of a browser */
    String getLang();
}
