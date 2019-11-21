package com.basic.hillel.lecture10;

/**
 * Created by alpa on 11/21/19
 */
public class SearchSiteFactory {

    public static SearchSite getSite(String site) {
        switch (site) {
            case "google":
                return new GoogleSearchSite();
            case "duck":
                return new DuckduckgoSearchSite();
            case "yahoo":
                return new YahooSearchSite();
        }

        return null;
    }
}
