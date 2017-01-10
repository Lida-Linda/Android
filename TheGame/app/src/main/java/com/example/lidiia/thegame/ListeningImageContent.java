package com.example.lidiia.thegame;

public class ListeningImageContent {

    private int imgContent;
    private int soundContent;

    public ListeningImageContent() {

    }

    public ListeningImageContent(int imgContent, int soundContent) {
        this.imgContent = imgContent;
        this.soundContent= soundContent;
    }

    public ListeningImageContent(int imgContent) {
        this.imgContent = imgContent;
    }

    public int getImgContent() {
        return imgContent;
    }


    public int getSoundContent() {
        return soundContent;
    }

}
