package org.topjava.alex.util;

import org.topjava.alex.entity.AbstractBaseEntity;

import static org.topjava.alex.util.MealsUtil.DEFAULT_CALORIES_PER_DAY ;

public class SecurityUtil {

    private static int id = AbstractBaseEntity.START_ID;

    public static void setAuthUserId(int id) {
        SecurityUtil.id = id;
    }

    public static int returnAuthorizedUserId () {
        return id;
    }

    public static int authDefaultCaloiesPerDay() {
        return DEFAULT_CALORIES_PER_DAY;
    }

//    public


}
