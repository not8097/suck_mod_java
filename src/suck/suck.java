package suck;

import suck.content.suckItems;
import suck.content.suckStatusEffects;
import suck.content.Pal;
import suck.content.suckBlocks;
import suck.content.suckUnitTypes;
import mindustry.content.Items;
import mindustry.mod.Mod;




public class suck extends Mod{
    public suck(){

    }

    @Override
    public void loadContent(){
        Pal.load();
        suckItems.load();
        suckStatusEffects.load();
        suckBlocks.load();
        suckUnitTypes.load();
    }
}
