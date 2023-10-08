package com.company.Sprite;

import javax.swing.*;

public class Moses extends Sprite {

    public Moses(int x, int y){
        setPosition(x,y);
        img = new ImageIcon("moses.png");
    }

    @Override
    public String overlap(int x, int y) {
        return null;
    }
}
