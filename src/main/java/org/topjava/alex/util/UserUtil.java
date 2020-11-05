package org.topjava.alex.util;

import org.topjava.alex.entity.Role;
import org.topjava.alex.entity.User;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserUtil {
    private static Map<Integer, User> usersMap = new HashMap<>();

    static {
        usersMap.put(1, new User(1, "Alex", "alex@alex.org", "123", 2007, true,
                Stream.of(Role.ADMIN, Role.USER).collect(Collectors.toSet())));
        usersMap.put(2, new User(2, "Kim Jon Un", "kim@dprk.nk", "123", 3500, true,
                Stream.of(Role.USER).collect(Collectors.toSet())));
    }

    public static Map<Integer, User> getUsersMap() {
        return usersMap;
    }
}
