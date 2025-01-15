package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bed yatak = new Bed("Modern", 2, 45, 1, 1);
        Carpet halı = new Carpet(20, 1, PaintColor.RED);
        Ceiling tavan = new Ceiling(30, PaintColor.WHITE);
        Lamp lamba = new Lamp(LampType.NORMAL,false,  3 );
        Wall duvar1 = new Wall("Dogu");
        Wall duvar2 = new Wall("Batı");
        Wall duvar3 = new Wall("Kuzey");
        Wall duvar4 = new Wall("Güney");
        Wardrobe gardrop =new Wardrobe(10,20,50);



        Bedroom bedroom = new Bedroom( duvar1, duvar2, duvar3, duvar4, tavan, halı, lamba,"yatak odası", yatak,gardrop);

    }
}