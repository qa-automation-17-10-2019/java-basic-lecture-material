package com.basic.hillel.lecture11;

/**
 * Created by alpa on 11/24/19
 */
public class InterfaceMain {

    public static void main(String[] args) {
        GoogleChrome googleChrome = new GoogleChrome();
        FireFox fireFox = new FireFox();
        Safari safari = new Safari();

        User testUser = new User("Bob", googleChrome);

        testUser.searchInfo("sdfsdfsdf");
        testUser.refresh();
        testUser.downloadFile();

    }

}
