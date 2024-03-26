package com.everestworks.everengine;

import org.lwjgl.Version;

public class Launcher {
    public static void main(String[] args) {
        System.out.println(Version.getVersion());

        WindowManager windowManager = new WindowManager("EverEngine", 0, 0, false);
        windowManager.init();


        while(!windowManager.windowShouldClose()) {
            windowManager.update();
        }

        windowManager.cleanup();
    }
}