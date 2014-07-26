package com.stano.scoretracker.ui.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.stano.scoretracker.R;
import com.stano.scoretracker.games.bang.Player;
import com.stano.scoretracker.ui.adapters.BangPlayerAdapter;

import java.util.ArrayList;

import butterknife.InjectView;
import butterknife.OnClick;
public class BangFragment extends BaseFragment {

    @InjectView(R.id.list_bang_players) ListView mListViewPlayers;
    @InjectView(R.id.edt_name) EditText mEdtName;
    @InjectView(R.id.btn_add) Button btnAdd;

    private ArrayAdapter adapter;

    private ArrayList<Player> mListPlayers = new ArrayList<Player>();

    public BangFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bang, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new BangPlayerAdapter(getActivity(), mListPlayers);
        mListViewPlayers.setAdapter(adapter);
    }

    @OnClick(R.id.btn_add)
    public void onAdd() {
        String name = mEdtName.getText().toString();
        mListPlayers.add(new Player(name));
        adapter.notifyDataSetChanged();
    }

}
