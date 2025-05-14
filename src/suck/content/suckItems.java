package suck.content;

import arc.graphics.*;
import mindustry.type.*;
public class suckItems {

    public static Item
    incendiary_bomb,arc_bomb;
    public static void load() {
        incendiary_bomb = new Item("incendiary_bomb", Color.valueOf("ffaa5f")){{
            explosiveness=0.6f;
            flammability=5;

        }};

        arc_bomb=new Item("incendiary_bomb", Color.valueOf("ffaa5f")){{
            charge=6f;
        }};







    }}