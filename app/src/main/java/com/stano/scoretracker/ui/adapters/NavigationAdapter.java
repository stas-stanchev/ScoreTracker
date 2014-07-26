package com.stano.scoretracker.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.stano.scoretracker.R;
import com.stano.scoretracker.navigation.NavigationItem;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by STANO on 26/07/2014.
 */
public class NavigationAdapter extends ArrayAdapter<NavigationItem> {
    private LayoutInflater inflater;

    public NavigationAdapter(Context context, List<NavigationItem> objects) {
        super(context, 0, objects);
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.navigation_item_game, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        NavigationItem item = getItem(position);

        holder.txtView.setText(item.getName());
        if (item.getDrawable() != null) {
            holder.imgView.setImageDrawable(item.getDrawable());
        }

        return convertView;
    }

    @Override
    public boolean isEnabled(int position) {
        return getItem(position).isActive();
    }

    public class ViewHolder {
        @InjectView(R.id.img_view)
        ImageView imgView;
        @InjectView(R.id.txt_view)
        TextView txtView;

        public ViewHolder(View view) {
            ButterKnife.inject(this, view);
        }
    }
}
