package com.example.lidiia.myfragmentsapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    List<String> titles = new ArrayList<>();
    OnItemClickListener onItemClickListener;

    public MyAdapter(List<String>titles){
        this.titles = titles;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.title_list, parent, false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.onBind(titles.get(position));
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView tvTitle;

        public MyViewHolder(View itemView) {//корневой элемент (title_list)
            super(itemView);
            tvTitle = (TextView)itemView.findViewById(R.id.title_id);
            itemView.setOnClickListener(this);
        }

        public void onBind(String str1){
            tvTitle.setText(str1);
        }

        @Override
        public void onClick(View view) {
            onItemClickListener.OnItemClick(getAdapterPosition());
        }
    }

    public interface OnItemClickListener {
        void OnItemClick(int id);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }
}
