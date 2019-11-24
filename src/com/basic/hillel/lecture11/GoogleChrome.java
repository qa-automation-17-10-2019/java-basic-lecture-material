package com.basic.hillel.lecture11;

/**
 * Created by alpa on 11/24/19
 */
public class GoogleChrome extends Browser {

    @Override
    public String navigateToUrl(String url) {
        System.out.println("Open url: " + url);
        return "Open by Chrome";
    }

    @Override
    public String moveForward() {
        System.out.println("Move forward");
        return "Move forward by Chrome";
    }

    @Override
    public String moveBack() {
        System.out.println("Move back");
        return "Move back by Chrome";
    }

    @Override
    public void refresh() {
        System.out.println("Refresh by Chrome");
    }

    @Override
    public void download() {
        System.out.println("Download by Chrome");
    }
}
