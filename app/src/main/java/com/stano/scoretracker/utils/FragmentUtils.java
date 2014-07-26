package com.stano.scoretracker.utils;

import android.app.Fragment;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by STANO on 26/07/2014.
 */
public class FragmentUtils {

    public static Fragment createFragmentFromClass(Class<?> clz) {
        Fragment fragment = null;
        Constructor<?> ctor;
        try {
            ctor = clz.getConstructor();
            fragment = (Fragment) ctor.newInstance();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return fragment;
    }
}
