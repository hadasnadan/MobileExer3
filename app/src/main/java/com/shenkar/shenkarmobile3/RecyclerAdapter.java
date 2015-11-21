package com.shenkar.shenkarmobile3;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;


/**
 * Created by david on 27/10/2015.
 */
public class RecyclerAdapter extends RecyclerView.Adapter <RecyclerAdapter.MyViewHolder>{

    //private LayoutInflater inflater;
    private List<Task> tasks;


    public RecyclerAdapter(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_card, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Task current = tasks.get(position);
        holder.task.setText(current.task);

    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView task;
        //Button done;

        public MyViewHolder(View itemView) {
            super(itemView);
            task = (TextView) itemView.findViewById(R.id.task);
            //done = (Button) itemView.findViewById(R.id.done_button);
        }
    }
}
