package com.basic.hillel.lecture11;

/**
 * Created by alpa on 11/24/19
 */
public interface IBrowser {

    String navigateToUrl(String url);

    String moveForward();

    String moveBack();

    void refresh();

}
