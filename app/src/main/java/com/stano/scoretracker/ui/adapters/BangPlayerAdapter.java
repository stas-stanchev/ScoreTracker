package com.stano.scoretracker.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.stano.scoretracker.R;
import com.stano.scoretracker.games.bang.Player;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by STANO on 26/07/2014.
 */
public class BangPlayerAdapter extends ArrayAdapter<Player> {
    private LayoutInflater inflater;

    public BangPlayerAdapter(Context context, List<Player> objects) {
        super(context, 0, objects);
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.game_score_bang, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Player player = getItem(position);
        holder.txtLife.setText("" + player.getLife());
        holder.txtName.setText(player.getName());
        holder.btnAdd.setTag(position);
        holder.btnRemove.setTag(position);

        return convertView;
    }

    public class ViewHolder {
        @InjectView(R.id.txt_score)
        TextView txtLife;
        @InjectView(R.id.txt_name)
        TextView txtName;
        @InjectView(R.id.btn_add_life)
        ImageButton btnAdd;
        @InjectView(R.id.btn_remove_life)
        ImageButton btnRemove;

        public ViewHolder(View view) {
            ButterKnife.inject(this, view);
        }

        @OnClick(R.id.btn_add_life)
        public void onAdd(View view) {
            Integer position = (Integer) view.getTag();
            getItem(position).addLife();
            notifyDataSetChanged();
        }

        @OnClick(R.id.btn_remove_life)
        public void onRemove(View view) {
            Integer position = (Integer) view.getTag();
            getItem(position).removeLife();
            notifyDataSetChanged();
        }
    }
}
