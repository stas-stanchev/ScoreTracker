package com.stano.scoretracker.navigation;

import com.stano.scoretracker.ui.fragments.BangFragment;

import java.util.ArrayList;

/**
 * Created by STANO on 26/07/2014.
 */
public class GamesList implements INavigation {

    private static ArrayList<NavigationItem> items = new ArrayList<NavigationItem>();


    @Override
    public ArrayList<NavigationItem> getItems() {
        if (items == null) {
            items = new ArrayList<NavigationItem>();
            items.add(new NavigationItem("Bang", BangFragment.class, null, true));
        }

        return items;
    }
}
