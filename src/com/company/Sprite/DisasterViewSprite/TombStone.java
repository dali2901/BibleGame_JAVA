package com.company.Sprite.DisasterViewSprite;

import com.company.Sprite.Sprite;

import javax.swing.*;

public class TombStone extends Sprite {


    public TombStone(int x,int y){
        setPosition(x,y);
        img = new ImageIcon("tombstone.png");
    }

    @Override
    public String overlap(int x, int y) {
        return null;
    }
}
