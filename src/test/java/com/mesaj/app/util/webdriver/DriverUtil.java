package com.mesaj.app.util.webdriver;

public class DriverUtil {

    private static String OS = System.getProperty("os.name").toLowerCase();
    private static String driverPath = "/src/test/resources/webdriver/%s/%s";

    public static String getPathDriverByOS() {

        String userDirectory = System.getProperty("user.dir");

        if (isWindows()) {
            return userDirectory + String.format(driverPath, "windows", "chromedriver.exe");
        } else if (isMac()) {
            return userDirectory + String.format(driverPath, "mac", "chromedriver");
        } else if (isUnix()) {
            return userDirectory + String.format(driverPath, "linux", "chromedriver");
        }

        throw new IllegalArgumentException("OS not supported");
    }

    private static boolean isWindows() {
        return (OS.indexOf("win") >= 0);
    }

    public static boolean isMac() {
        return (OS.indexOf("mac") >= 0);
    }

    public static boolean isUnix() {
        return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0);
    }
}
