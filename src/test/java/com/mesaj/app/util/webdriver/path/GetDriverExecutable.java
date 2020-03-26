package com.mesaj.app.util.webdriver.path;

import com.mesaj.app.util.webdriver.Browser;

import java.util.HashMap;
import java.util.Map;

public class GetDriverExecutable {

    public static Map<Browser, String> macDrivers =
            new HashMap<Browser, String>();

    public static Map<Browser, String> windowsDrivers =
            new HashMap<Browser, String>();

    static {
        macDrivers.put(Browser.chrome, GetDriverFolder.byOS("mac") + "/chromedriver");
        macDrivers.put(Browser.firefox, GetDriverFolder.byOS("mac") + "/geckodriver");
    }

    static {
        windowsDrivers.put(Browser.chrome, GetDriverFolder.byOS("windows") + "/chromedriver.exe");
        windowsDrivers.put(Browser.firefox, GetDriverFolder.byOS("windows") + "/geckodriver.exe");
    }
}
