package com.mesaj.app.util.webdriver.path;

import com.mesaj.app.util.webdriver.Browser;

import java.util.HashMap;
import java.util.Map;

public class GetCompleteDriverPath {

    private static String OS = System.getProperty("os.name").toLowerCase();
    private static Map<Browser, String> driverPaths = new HashMap<Browser, String>();

    public static String byBrowser(Browser browser) {

        String actualOS = getActualOS();

        if (actualOS.equals("win")) {
            driverPaths = GetDriverExecutable.windowsDrivers;
        }

        if (actualOS.equals("mac")) {
            driverPaths = GetDriverExecutable.macDrivers;
        }

        if (driverPaths.size() > 0 && driverPaths.containsKey(browser))
            return driverPaths.get(browser);

        throw new IllegalArgumentException("There is not driver for browser " + browser);

    }

    private static String getActualOS() {
        if (OS.indexOf("win") >= 0) return "win";
        if (OS.indexOf("mac") >= 0) return "mac";
        if (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0) return "unix";

        throw new IllegalArgumentException("Operating system not recognized " + OS);
    }
}
