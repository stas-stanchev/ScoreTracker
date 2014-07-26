package com.stano.scoretracker.navigation;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by STANO on 26/07/2014.
 */
public class NavigationItem implements Serializable {

    private static final long serialVersionUID = 4956715730368530979L;
    private String mName;
    private Drawable mDrawable;
    private Boolean mIsActive;
    private Class mClass;

    public NavigationItem(String name, Class clz, Drawable drawable, Boolean bActive) {
        mName = name;
        mClass = clz;
        mDrawable = drawable;
        mIsActive = bActive;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Drawable getDrawable() {
        return mDrawable;
    }

    public void setDrawable(Drawable drawable) {
        mDrawable = drawable;
    }

    public Boolean isActive() {
        return mIsActive;
    }

    public void setActive(Boolean bActive) {
        this.mIsActive = bActive;
    }

    public Class getNavigationClass() {
        return mClass;
    }

    public void setClass(Class aClass) {
        mClass = aClass;
    }
}
