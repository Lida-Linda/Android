package com.example.lidiia.tabbed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends  RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    List<String> list = new ArrayList<>();
    OnListClickListener onListClickListener;

    public MyAdapter(List<String> list){
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.my_adapter_list,parent,false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder
            extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView tv;
        CheckBox checkBox;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.tv_list);
            checkBox = (CheckBox) itemView.findViewById(R.id.checkbox_id);
            itemView.setOnClickListener(this);
        }

        public void onBind(String str) {
            tv.setText(str);
        }

        @Override
        public void onClick(View view) {
            onListClickListener.onListClick(getAdapterPosition());
        }
    }

    public interface OnListClickListener {
        void onListClick(int id);
    }

    public void setOnListClickListener(OnListClickListener onListClickListener) {
        this.onListClickListener = onListClickListener;
    }
}
