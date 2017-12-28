package com.omrobbie.androidversions;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by omrobbie on 29/12/2017.
 */

public class AndroidAdapter extends RecyclerView.Adapter<AndroidAdapter.ViewHolder> {

    private List<AndroidPojo> list;

    public AndroidAdapter(List<AndroidPojo> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_android, parent, false
                )
        );
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView codename;
        TextView initialRelease;

        public ViewHolder(View itemView) {
            super(itemView);
            codename = (TextView) itemView.findViewById(R.id.tv_codename);
            initialRelease = (TextView) itemView.findViewById(R.id.tv_initial_release);
        }

        public void bind(AndroidPojo item) {
            codename.setText(item.getCodename() + " (" + item.getVersion() + ")");
            initialRelease.setText(DateTimeFormat.getDateString(item.getInitialRelease()));
        }
    }
}
