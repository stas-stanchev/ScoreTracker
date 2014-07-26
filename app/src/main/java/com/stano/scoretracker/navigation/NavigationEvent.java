package com.stano.scoretracker.navigation;

import java.io.Serializable;

/**
 * Created by STANO on 26/07/2014.
 */
public class NavigationEvent implements Serializable {
    private static final long serialVersionUID = 6603310030923575303L;
    private NavigationItem item;

    public NavigationEvent(NavigationItem item) {
        this.item = item;
    }

    public NavigationItem getItem() {
        return item;
    }
}
