package com.basic.hillel.lecture10;

/**
 * Created by alpa on 11/21/19
 */
public class YahooSearchSite extends SearchSite {

    private static final String YAHOO_URL = "https://search.yahoo.com/";

    public YahooSearchSite() {
        super(YAHOO_URL);
    }

    @Override
    public void search(String query) {
        autorize();
        System.out.println(String.format("%s -> search for %s ", this.getClass().getSimpleName(), query));
    }

    private void autorize() {
        System.out.println(String.format("%s -> Login to Yahoo", this.getClass().getSimpleName()));
    }



}
