package suck.content;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.type.StatusEffect.*;
import mindustry.content.StatusEffects.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import suck.content.*;
import suck.content.suckItems.*;
import suck.content.suckLiquids.*;
import suck.content.suckStatusEffects.*;
import static mindustry.type.ItemStack.*;
import static mindustry.type.StatusEffect.*;
import static suck.suck.*;
import multicraft.*;




public class suckBlocks {
    public static Block 
    bombCrafter,origin,abnormal,prophecy,disaster,end,bakuen,transport_aircraft_factory;

    
    /**
 * 
 */
public static void load() {

    bombCrafter = new MultiCrafter("bomb_crafter") {{
        requirements(Category.crafting, with(Items.copper, 200, Items.silicon, 60, Items.graphite, 100, Items.lead, 150, Items.titanium, 100));
        health = 450;
        size = 2;
        consumePower(1f);
        itemCapacity = 10;
        resolvedRecipes = Seq.with(
            new Recipe(
                new IOEntry(
                    Seq.with(ItemStack.with(                                    
                    copper , 3,
                    pyratite , 2,
                    blastCompound , 1)),
                    Seq.with()
                ),

                new IOEntry(
                    Seq.with(ItemStack.with(suckItems.incendiary_bomb, 2)),
                    Seq.with()
                ),
                180f
            ),
            new Recipe(
                new IOEntry(
                    Seq.with(ItemStack.with(                                    
                    Items.lead , 2,
                    Items.silicon , 2,
                    Vars.content.item("chrono-nucleardustry-radioalloy") , 1)),
                    Seq.with()
                ),
                new IOEntry(
                    Seq.with(ItemStack.with(suckItems.arc_bomb, 3)),
                    Seq.with()
                ),
                90f
            )

            );
        
        drawer = new DrawRecipe() {{
                defaultDrawer = 3;
                drawers = new DrawBlock[]{
                        new DrawMulti(
			new DrawRegion("-1")
                        ),
                        new DrawMulti(
			new DrawRegion("-2")
                        ),

                };
        }};
    }};
//end of bombCrafter

origin = new UnitFactory("origin") {{
        size = 3;
        health=500;
        consumePower(1f);

        requirements(Category.units, with(
                Items.lead,70,
                Items.copper,50,
                Items.silicon,40
        ));
        plans = Seq.with(
                new UnitPlan(suckUnitTypes.bode, 600f , with(
                        lead,30,
                        Items.silicon,20,
                        Items.graphite,5
                )));
}};
//end of origin

abnormal = new Reconstructor("abnormal") {{
        size = 3;
        consumePower(3f);
        requirements(Category.units, with(
                Items.lead,300,
                Items.copper,400,
                Items.silicon,100
        ));

        consumeItems(with(
                Items.titanium,15,
                Items.silicon,50,
                Items.lead,20
            
        ));
        upgrades.addAll(
                new UnitType[]{suckUnitTypes.bode, suckUnitTypes.ominous});

        constructTime = 600f;
}};
//end of abnormal
prophecy = new Reconstructor("prophecy") {{
        health= 1000;
        size = 5;
        consumePower(5f);
        requirements(Category.units, with(
                Items.lead,300,
                Items.copper,400,
                Items.silicon,300,
                Items.titanium,200
        ));
        consumeItems(with(
                Items.lead,300,
                Items.copper,400,
                Items.silicon,300,
                Items.titanium,200
            
        ));
        upgrades.addAll(
                new UnitType[]{suckUnitTypes.ominous, suckUnitTypes.fulfilled});

        constructTime = 600f;
}};
//end of prophecy
disaster = new Reconstructor("disaster") {{
        health= 2200;
        size = 5;
        consumePower(5f);
        requirements(Category.units, with(
                Items.lead,300,
                Items.copper,400,
                Items.silicon,100
        ));

        consumeItems(with(
                Items.titanium,300,
                Items.plastanium,400,
                Items.thorium,500,
                Items.silicon,800
            
        ));
        upgrades.addAll(
                new UnitType[]{suckUnitTypes.fulfilled, suckUnitTypes.struggle});

        constructTime = 600f;
}};
//end of disaster
end = new Reconstructor("end") {{
        health= 5000;
        size = 5;
        consumePower(8f);
        requirements(Category.units, with(
                Items.lead,300,
                Items.copper,400,
                Items.silicon,300,
                Items.titanium,200
        ));

        consumeItems(with(
                surgeAlloy,750,
                phaseFabric,500,
                silicon,1600,
                titanium,600
            
        ));
        upgrades.addAll(
                new UnitType[]{suckUnitTypes.struggle, suckUnitTypes.eventually});

        constructTime = 600f;
}};
//end of end
transport_aircraft_factory= new UnitFactory("transport_aircraft_factory") {{
        size = 3;
        health=500;
        consumePower(1f);

        requirements(Category.units, with(
                Items.lead,500,
                Items.copper,400,
                Items.silicon,100
        ));
        plans = Seq.with(
                new UnitPlan(suckUnitTypes.transport_drone_a, 600f , with(
                        lead,30,
                        Items.silicon,40,
                        Items.graphite,5
                )));

}};

bakuen = new ItemTurret("bakuen"){{
            requirements(Category.turret, 
            ItemStack.with(
            copper, 25, 
            lead, 10
            ));
            ammo(
                suckItems.incendiary_bomb, new FlakBulletType(12f, 15){{
                    width = 9f;
                    height = 9f;
                    splashDamageRadius = 24f;
                    splashDamage = 24f * 1.5f;
                    ammoMultiplier = 5f;
                    lifetime = 60;
                    shootEffect = Fx.shootSmall;
                    smokeEffect = Fx.shootSmallSmoke;
                    hitEffect = Fx.flakExplosion;
                    hitSound = Vars.tree.loadSound("Hits/MetalHitRL");
                }});}};











//end of it java

}
}