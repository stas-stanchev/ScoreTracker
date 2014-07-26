package com.stano.scoretracker.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.ViewGroup;

import com.stano.scoretracker.Consts;
import com.stano.scoretracker.R;
import com.stano.scoretracker.navigation.NavigationItem;
import com.stano.scoretracker.utils.FragmentUtils;

import butterknife.InjectView;

public class GamesActivity extends BaseActivity {

    @InjectView(R.id.container) ViewGroup mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_score);
        
        loadFragmnet();
    }

    private void loadFragmnet() {
        NavigationItem item = (NavigationItem) getIntent().getSerializableExtra(Consts.KEY_ITEM);

        Fragment fragment = FragmentUtils.createFragmentFromClass(item.getNavigationClass());
    }
}
