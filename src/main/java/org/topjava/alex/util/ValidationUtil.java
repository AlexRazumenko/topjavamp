package org.topjava.alex.util;

import org.topjava.alex.entity.AbstractBaseEntity;
import org.topjava.alex.exception.NotFoundException;

public class ValidationUtil {

    public static void checkNotFound (boolean found, String message) {
        if (!found) throw new NotFoundException("Not found; " + message);
    }

    public static void checkNotFountWithId (int id, boolean found) {
        checkNotFound(found, "id=" + id);
    }

    public static <T> T checkNotFound (T obj, String msg) {
        checkNotFound(obj != null, msg);
        return obj;
    }

    public void checkNew (AbstractBaseEntity entity) {
        if (!entity.isNew()) throw new IllegalArgumentException(entity + "must be new with id=null");
    }

    public void checkIdConsistent (AbstractBaseEntity entity, int id) {
        if (entity.isNew()) {
            entity.setId(id);
        } else {
            if (entity.getId() != id) {
                throw new IllegalArgumentException("must be with id= " + id);
            }
        }
    }
}
