package com.example.lidiia.recycle_anim;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private List<Content> contentList;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageIV;
        public TextView nameTV, commentTV;
        public MyViewHolder(View itemView) {
            super(itemView);//???????????????????????/
            imageIV = (ImageView) itemView.findViewById(R.id.image_id);
            nameTV = (TextView) itemView.findViewById(R.id.name_id);
            commentTV = (TextView) itemView.findViewById(R.id.comment_id);
        }
    }

    public MyAdapter(List<Content> contentList) {
        this.contentList = contentList;
    }


    //????????????????????????????/
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_main, parent, false);
        return new MyViewHolder(item);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Content content = contentList.get(position);
        holder.imageIV.setImageResource(content.getImage_Content());
        holder.nameTV.setText(content.getNameContent());
        holder.commentTV.setText(content.getCommentContent());
    }

    @Override
    public int getItemCount() {
        return contentList.size();
    }


}
