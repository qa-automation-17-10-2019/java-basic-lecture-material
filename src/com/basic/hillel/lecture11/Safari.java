package com.basic.hillel.lecture11;

/**
 * Created by alpa on 11/24/19
 */
public class Safari implements IBrowser {

    @Override
    public String navigateToUrl(String url) {
        System.out.println("Open url: " + url);
        return "Open by Safari";
    }

    @Override
    public String moveForward() {
        System.out.println("Move forward");
        return "Move forward by Safari";
    }

    @Override
    public String moveBack() {
        System.out.println("Move back");
        return "Move back by Safari";
    }

    @Override
    public void refresh() {
        System.out.println("Refresh by Safari");
    }
}
