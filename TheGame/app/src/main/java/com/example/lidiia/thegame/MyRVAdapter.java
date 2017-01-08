package com.example.lidiia.thegame;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MyRVAdapter extends RecyclerView.Adapter<MyRVAdapter.MyViewHolder> {

    List<ListeningImageContent> listeningImageContents;
    OnImgClickListener onImgClickListener;

    public MyRVAdapter(List<ListeningImageContent> listeningImageContents) {
        this.listeningImageContents = listeningImageContents;
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.listening_images, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ListeningImageContent listeningImageContent = listeningImageContents.get(position);
        holder.imageView.setImageResource(listeningImageContent.getImgContent());
    }

    @Override
    public int getItemCount() {
        return listeningImageContents.size();
    }

    public interface OnImgClickListener {
        void onImgClick(int id);
    }

    public void setOnImgClickListener (OnImgClickListener onImgClickListener){
        this.onImgClickListener = onImgClickListener;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.imageview_id);
        }

        public void bindDrawable(Drawable drawable) {
            imageView.setImageDrawable(drawable);
        }
    }
}

