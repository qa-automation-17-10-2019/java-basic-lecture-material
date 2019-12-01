package com.basic.hillel.lecture13;

/**
 * Created by alpa on 12/1/19
 */
public class UserService {

    private String[] users = { "alex", "bob", "anna" };

    public String findUserByName(String userName) throws CustomException {
        for (String user: users) {
            if (user.equalsIgnoreCase(userName)) {
                return user;
            }
        }

        throw new CustomException("User with name " + userName + " not found!");
    }
}
