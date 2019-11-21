package com.basic.hillel.lecture10;

/**
 * Created by alpa on 11/21/19
 */
public class InheritanceMain2 {

    public static void main(String[] args) {
        SearchSite google = new GoogleSearchSite();
        google.search("Java");

        if (google instanceof DuckduckgoSearchSite) {
            System.out.println();
        }

        if (google instanceof GoogleSearchSite) {
            System.out.println();
        }
//
//        SearchSite duckduckgo = new DuckduckgoSearchSite();
//        duckduckgo.search("Java");
//
//        SearchSite yahoo = new YahooSearchSite();
//        yahoo.search("Java");

//        GoogleSearchSite google = (GoogleSearchSite) SearchSiteFactory.getSite("google");
//        google.showHints();

        SearchSiteFactory.getSite("google").search("java");
        SearchSiteFactory.getSite("duck").search("java");
        SearchSiteFactory.getSite("yahoo").search("java");
    }
}
