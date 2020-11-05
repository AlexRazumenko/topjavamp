package org.topjava.alex.repository;

import org.topjava.alex.entity.User;
import org.topjava.alex.util.UserUtil;

import java.util.Collection;
import java.util.Map;

public class InMemoryUserRepository implements UserRepository {

    private static Map<Integer, User> usersMap = UserUtil.getUsersMap();

    @Override
    public Collection<User> getAll() {
        return usersMap.values();
    }

    @Override
    public User save(User user) {
        usersMap.put(1, user);
        return user;
    }

    @Override
    public User getById(int id) {
        return usersMap.get(id);
    }

    @Override
    public User getByEmail(String email) {
        return usersMap.values().stream().filter((user -> user.getEmail().equals(email))).findFirst().get();
    }

    @Override
    public User update(User user) {
        return usersMap.put(1, user);
    }

    @Override
    public User delete(int id) {
        return usersMap.remove(id);
    }
}
