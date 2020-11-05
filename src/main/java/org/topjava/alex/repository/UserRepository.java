package org.topjava.alex.repository;

import org.topjava.alex.entity.User;

import java.util.Collection;

public interface UserRepository {

    Collection<User> getAll();
    User save (User user);
    User getById (int id);
    User getByEmail (String email);
    User update (User user);
    User delete (int id);

}
