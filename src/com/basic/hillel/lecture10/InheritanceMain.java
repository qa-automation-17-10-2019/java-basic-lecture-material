package com.basic.hillel.lecture10;

/**
 * Created by alpa on 11/21/19
 */
public class InheritanceMain {

    public static void main(String[] args) {

        SearchSite searchSite = new SearchSite("https://www.google.com/");
        searchSite.search("Java");

        SearchSite duckduckgoSite = new SearchSite("https://duckduckgo.com/");
        duckduckgoSite.search("Automation");

        GoogleSearchSite googleSearchSite = new GoogleSearchSite();
        googleSearchSite.search("Java");
        googleSearchSite.showHints();

        DuckduckgoSearchSite duckduckgoSearchSite = new DuckduckgoSearchSite();
        duckduckgoSearchSite.search("Automation");

        YahooSearchSite yahooSearchSite = new YahooSearchSite();
        yahooSearchSite.search("Selenium");
    }
}
