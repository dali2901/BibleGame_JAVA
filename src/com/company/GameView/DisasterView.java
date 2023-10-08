package com.company.GameView;

import com.company.Sprite.DisasterViewSprite.Bug;
import com.company.Sprite.DisasterViewSprite.Frog;
import com.company.Sprite.DisasterViewSprite.Ice;
import com.company.Sprite.DisasterViewSprite.TombStone;
import com.company.Sprite.Door;

import javax.swing.*;
import java.util.ArrayList;

public class DisasterView extends GameView{

    public ArrayList<Bug> getBugs() {
        return bugs;
    }

    public ArrayList<Frog> getFrogs() {
        return frogs;
    }

    public ArrayList<Ice> getIceCubes() {
        return iceCubes;
    }

    public ArrayList<TombStone> getTombStones() {
        return tombStones;
    }

    private ArrayList<Bug> bugs = new ArrayList<>();
    private ArrayList<Frog> frogs = new ArrayList<>();
    private ArrayList<Ice> iceCubes = new ArrayList<>();
    private ArrayList<TombStone> tombStones = new ArrayList<>();


    public DisasterView(){
        img =new ImageIcon("egypt.jpg");
        elements = new ArrayList<>();
        door = new Door(10,10);

        bugs.add(new Bug(10, 5));
        bugs.add(new Bug(9, 5));
        bugs.add(new Bug(9, 4));
        bugs.add(new Bug(6, 2));
        bugs.add(new Bug(6, 3));
        bugs.add(new Bug(6, 4));
        bugs.add(new Bug(6, 5));
        frogs.add(new Frog(1, 2));
        frogs.add(new Frog(1, 3));
        frogs.add(new Frog(1, 4));
        frogs.add(new Frog(2, 2));
        frogs.add(new Frog(2, 3));
        iceCubes.add(new Ice(7, 5));
        iceCubes.add(new Ice(3, 5));
        iceCubes.add(new Ice(5, 5));
        iceCubes.add(new Ice(4, 5));
        iceCubes.add(new Ice(8, 5));
        tombStones.add(new TombStone(6, 6));
        tombStones.add(new TombStone(7, 8));
        tombStones.add(new TombStone(8, 8));
        tombStones.add(new TombStone(9, 8));
        tombStones.add(new TombStone(3, 8));


        elements.add(door);
        elements.addAll(bugs);
        elements.addAll(frogs);
        elements.addAll(iceCubes);
        elements.addAll(tombStones);



    }




}
