package com.mesaj.app.util.webdriver.path;

public class GetDriverFolder {

    private static String driverPath = "/src/test/resources/webdriver/%s";

    public static String byOS(String os) {

        if (os.equals("mac")) {
            return getGenericPath(os);
        }

        if (os.equals("windows")) {
            return getGenericPath(os);
        }

        if (os.equals("linux")) {
            return getGenericPath(os);
        }

        throw new IllegalArgumentException("Invalid OS: " + os);
    }

    private static String getGenericPath(String os) {
        return String.format("%s%s", System.getProperty("user.dir"),
                String.format(driverPath, os));
    }
}
