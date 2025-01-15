package org.example.model;

import org.example.model.enums.LampType;

import java.util.Arrays;

public class Room {
    private Wall[] walls;


    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;

    private Ceiling ceiling;
    private Carpet carpet;
    private Lamp lamp;

    public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Carpet carpet, Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.carpet = carpet;
        this.lamp = lamp;
    }

    public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
    }

    @Override
    public String toString() {
        return "Room{" +
                "walls=" + Arrays.toString(walls) +
                ", wall1=" + wall1 +
                ", wall2=" + wall2 +
                ", wall3=" + wall3 +
                ", wall4=" + wall4 +
                ", ceiling=" + ceiling +
                ", carpet=" + carpet +
                ", lamp=" + lamp +
                '}';
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Lamp getLamp() {
        return lamp;
    }
}
