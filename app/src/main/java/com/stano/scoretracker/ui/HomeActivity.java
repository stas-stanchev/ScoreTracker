package com.stano.scoretracker.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.stano.scoretracker.Consts;
import com.stano.scoretracker.R;
import com.stano.scoretracker.navigation.GamesList;
import com.stano.scoretracker.navigation.INavigation;
import com.stano.scoretracker.navigation.NavigationItem;
import com.stano.scoretracker.ui.adapters.NavigationAdapter;

import butterknife.InjectView;
import butterknife.OnItemClick;


public class HomeActivity extends BaseActivity {

    @InjectView(R.id.list) ListView mListView;
    private INavigation navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initList();
    }

    private void initList() {
        navigation = new GamesList();
        mListView.setAdapter(new NavigationAdapter(this, navigation.getItems()));
    }

    @OnItemClick(R.id.list)
    public void onNavItemClick(int position) {
        NavigationItem item = navigation.getItems().get(position);
        Intent intent = new Intent(this, GamesActivity.class);
        intent.putExtra(Consts.KEY_ITEM, item);
        startActivity(intent);
    }
}
