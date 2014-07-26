package com.stano.scoretracker.games.bang;

/**
 * Created by STANO on 26/07/2014.
 */
public class Player {
    private String mName;
    private int mLife;

    public Player(String name) {
        mName = name;
        mLife = 0;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getLife() {
        return mLife;
    }

    public void setLife(int life) {
        mLife = life;
    }

    public void addLife() {
        mLife++;
    }

    public void removeLife() {
        mLife = mLife == 0 ? 0 : --mLife;
    }
}
