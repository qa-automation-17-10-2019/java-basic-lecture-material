package com.basic.hillel.lecture10;

/**
 * Created by alpa on 11/21/19
 */
public class SearchSite {

    private String url;

    public SearchSite(String url) {
        this.url = url;
    }

    public void search(String query) {
        System.out.println(String.format("%s -> Start search at %s for %s...",
                this.getClass().getSimpleName(), url, query));
    }
}
