package com.jonmid.segundoparcial.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jonmid.segundoparcial.Model.TeamModelOlivaCristian;
import com.jonmid.segundoparcial.R;
import com.jonmid.segundoparcial.Views.DetailActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chris on 17/10/2017.
 */

public class TeamAdapterOlivaCristian extends  RecyclerView.Adapter<TeamAdapterOlivaCristian.ViewHolder> {

    List<TeamModelOlivaCristian> olivaCristianList= new ArrayList<>();
    Context context;

    public TeamAdapterOlivaCristian (List<TeamModelOlivaCristian> olivaCristianList, Context context){
        this.olivaCristianList= olivaCristianList;
        this.context = context;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_team, parent, false);
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.name.setText(olivaCristianList.get(position).getName());
        holder.code.setText(olivaCristianList.get(position).getCode());
        holder.crestUrl.setText(olivaCristianList.get(position).getCrestUrl());

    }

    @Override
    public int getItemCount() {
        return olivaCristianList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView name;
        TextView code;
        TextView crestUrl;



        public ViewHolder(View item) {
            super(item);

            item.setOnClickListener(this);

            name = (TextView) item.findViewById(R.id.id_tv_name_team);
            code = (TextView) item.findViewById(R.id.id_tv_cod_team);
            crestUrl = (TextView) item.findViewById(R.id.id_tv_cod_cresurl);

        }

        @Override
        public void onClick(View view) {

            Context contextItem = view.getContext();
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("name", olivaCristianList.get(getLayoutPosition()).getName());
            contextItem.startActivity(intent);
        }
    }
}
