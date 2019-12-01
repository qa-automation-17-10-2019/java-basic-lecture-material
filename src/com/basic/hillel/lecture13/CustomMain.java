package com.basic.hillel.lecture13;

/**
 * Created by alpa on 12/1/19
 */
public class CustomMain {

    public static void main(String[] args) {
        UserService userService = new UserService();

        try {
            String user = userService.findUserByName("bob");
//            user = null;
            System.out.println(user.length());
        } catch (CustomException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Close connection");
        }

    }
}
