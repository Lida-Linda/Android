package com.example.lidiia.recycle_anim;


public class Content {

    private String nameContent, commentContent;

    private int image_Content;

    public Content() {

    }

    public Content(int image, String name, String comment) {
        this.image_Content = image;
        this.nameContent = name;
        this.commentContent = comment;
    }

    public int getImage_Content() {
        return image_Content;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public String getNameContent() {
        return nameContent;
    }
}
