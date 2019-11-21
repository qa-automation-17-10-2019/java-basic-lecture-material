package com.basic.hillel.lecture10;

/**
 * Created by alpa on 11/21/19
 */
public class GoogleSearchSite extends SearchSite {

    private static final String GOOGLE_URL = "https://www.google.com/";

    public GoogleSearchSite() {
        super(GOOGLE_URL);
    }

    public void showHints() {
        System.out.println(String.format("%s -> Maybe you search for Java Virtual Machine", this.getClass().getSimpleName()));
        System.out.println(String.format("%s -> Maybe you search for JDK", this.getClass().getSimpleName()));
        System.out.println(String.format("%s -> Maybe you search for JRE", this.getClass().getSimpleName()));
    }

}
