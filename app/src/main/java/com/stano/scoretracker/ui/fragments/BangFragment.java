package com.stano.scoretracker.ui.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.stano.scoretracker.R;
import com.stano.scoretracker.games.bang.Player;

import java.util.ArrayList;

import butterknife.InjectView;
import butterknife.OnClick;
public class BangFragment extends Fragment {

    @InjectView(R.id.list_bang_players) ListView mListPlayers;
    @InjectView(R.id.edt_name) EditText mEdtName;
    @InjectView(R.id.btn_add) Button btnAdd;

    private ArrayList<Player> listPlayers = new ArrayList<Player>();

    public BangFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bang, container, false);
    }

    @OnClick(R.id.btn_add)
    public void onAdd() {
        String name = mEdtName.getText().toString();
        listPlayers.add(new Player(name));
    }

}
