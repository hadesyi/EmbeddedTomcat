package db;

import user.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Project: EmbeddedTomcat
 * FileName: Database
 * Date: 2017-02-21
 * Time: 오후 4:50
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Database {
    private static Map<String, User> users = new HashMap<String, User>();

    public static void addUser(User user) {
        System.out.println("user : " + user);
        users.put(user.getUserId(), user);
    }

    public static User findByUserId(String userId) {
        return users.get(userId);
    }
}
