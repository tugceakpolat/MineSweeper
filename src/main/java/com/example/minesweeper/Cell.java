package com.example.minesweeper;

public class Cell {

     String content;
     boolean hasBomb;

    public boolean isHasBomb(){
        return hasBomb;
    }

    public Cell(){
        this.setHasBomb(false);
        this.setContent("-");
    }

    public void setHasBomb(boolean hasBomb) {
        this.hasBomb = hasBomb;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}




