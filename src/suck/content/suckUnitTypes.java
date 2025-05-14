package suck.content;

import mindustry.entities.bullet.*;
import mindustry.entities.pattern.ShootSpread;
import mindustry.type.*;
import mindustry.content.*;

public class suckUnitTypes {
     public static UnitType
        bode,ominous,fulfilled,struggle,end,transport_drone_a
		;
    public static void load() {
       bode = new UnitType("bode"){{
            speed = 3f;
            accel = 0.05f;
            drag = 0.02f;
            flying = true;
            drag = 0.017f;
            health = 120f;
            range = 90f;
            hitSize = 8;
            itemCapacity = 10;
            targetAir= true;
            targetGround = true;
            faceTarget = true;
            circleTarget = true;
            rotateSpeed = 15f;
            weapons.add (
                new Weapon("weapon"){{
                y=0f;
                x=0f;
                mirror= false;
                rotate= false;
                reload= 150f;
                recoil= 5;
                shake= 2;

                bullet = new ShrapnelBulletType(){{
                    length = 80f;
                    damage = 30f;
                    width = 4f;
                    status = suckStatusEffects.brokenbody;
                    buildingDamageMultiplier = 0.35f;
                    }};
                  }}
                );
            weapons.add(
                new Weapon("Weapon"){{
                    reload=600;
                    x=0f;
                    y=0f;
                    mirror=false;
                    rotate=false;
                    shootStatus = suckStatusEffects.ruthless_assault;
                    shootStatusDuration = 300f;
                    shoot = new ShootSpread(){{
                        shots = 20;
                        }};
                    bullet = new BasicBulletType(baseRotateSpeed, crashDamageMultiplier){{
                        width = 10f;
                        inaccuracy =360f;
                        speed =1f;
                        lifetime =30f;
                        damage =1f;
                        shootEffect =Fx.shootSmall;
                        smokeEffect =Fx.shootSmallSmoke;
                        frontColor =Pal.ffbf72;
                        backColor=Pal.c977143;
                        lightColor=Pal.fabd72;
                        collidesTeam=false;

                        }};
                    }}
                );
        }};
//end of bode

     ominous = new UnitType("ominous"){{
        speed = 2.5f;
        accel = 0.05f;
        drag = 0.02f;
        flying = true;
        drag = 0.017f;
        health = 400f;
        hitSize = 14f;
        itemCapacity = 30;
        targetAir= true;
        targetGround = true;
        faceTarget = true;
        circleTarget = true;
        rotateSpeed = 15f;
        weapons.add(
            new Weapon("Weapon"){{
            y=0f;
            x=0f;
            mirror= false;
            rotate= false;
            reload= 150f;
            recoil= 5;
            shake= 2;
            shootStatusDuration = 300f;
            shootStatus = suckStatusEffects.ruthless_assault;
            shoot = new ShootSpread(){{
                shots = 20;
            }};
            bullet = new BasicBulletType(baseRotateSpeed, crashDamageMultiplier){{
                width = 10f;
                inaccuracy =360f;
                speed =1f;
                lifetime =30f;
                damage =2f;
                shootEffect =Fx.shootSmall;
                smokeEffect =Fx.shootSmallSmoke;
                frontColor =Pal.ffbf72;
                backColor=Pal.c977143;
                lightColor=Pal.fabd72;
                collidesTeam=false;

            }};
        }}

        );
        weapons.add(
            new Weapon("weapon"){{
                reload = 150f;
                x=y=0f;
                mirror= false;
                rotate= false;
                bullet= new BasicBulletType(){{
                    width = 12f;
                    inaccuracy =4f;
                    speed =3f;
                    lifetime =120;
                    damage =40f;
                    shootEffect =Fx.shootSmall;
                    smokeEffect =Fx.shootSmallSmoke;
                    frontColor =Pal.ffbf72;
                    backColor=Pal.c977143;
                    lightColor=Pal.fabd72;
                    collidesTeam=false;
                    scaledSplashDamage=true;
                    splashDamageRadius = 80f;
                    splashDamage = 50f;
                }};
            }}
        );
     }};
//end of Ominous

    fulfilled = new UnitType("fulfilled"){{
        speed = 2.13f;
        accel = 0.05f;
        drag = 0.02f;
        flying = true;
        drag = 0.017f;
        armor = 1f;
        health = 900f;
        hitSize = 18f;
        itemCapacity = 50;
        targetAir= true;
        targetGround = true;
        faceTarget = true;
        circleTarget = true;
        rotateSpeed = 15f;
        weapons.add(
            new Weapon("Weapon"){{
            y=0f;
            x=0f;
            mirror= false;
            rotate= false;
            reload= 150f;
            recoil= 5;
            shake= 2;
            shootStatusDuration = 300f;
            shootStatus = suckStatusEffects.ruthless_assault;
            shoot = new ShootSpread(){{
                shots = 20;
            }};
            bullet = new BasicBulletType(baseRotateSpeed, crashDamageMultiplier){{
                width = 10f;
                inaccuracy =360f;
                speed =1f;
                lifetime =30f;
                damage =2f;
                shootEffect =Fx.shootSmall;
                smokeEffect =Fx.shootSmallSmoke;
                frontColor =Pal.ffbf72;
                backColor=Pal.c977143;
                lightColor=Pal.fabd72;
                collidesTeam=false;

            }};
        }});
        weapons.add(
            new Weapon("weapons"){{
                x=y=0f;
                rotate=mirror=false;
                reload=150f;
                recoil=5f;
                shake=2;
                shoot=new ShootSpread(){{
                    shots=40;
                    spread=1;
                }};
                bullet= new BasicBulletType(){{
                    height=width=30f;
                    inaccuracy=4f;
                    speed=8f;
                    lifetime=20f;
                    damage=25f;
                    pierce=pierceBuilding=makeFire=true;
                    pierceCap=4;
                    incendChance=1;
                    status=StatusEffects.burning;
                    shootEffect =Fx.shootSmall;
                    smokeEffect =Fx.shootSmallSmoke;
                    frontColor =Pal.ffbf72;
                    backColor=Pal.c977143;
                    lightColor=Pal.fabd72;
                    collidesTeam=false;
                }};
            }}
        );

    }};
//end of fulfilled
    struggle = new UnitType("struggle"){{
        speed = 2.13f;
        accel = 0.05f;
        drag = 0.02f;
        flying = true;
        drag = 0.017f;
        health = 8500f;
        hitSize = 18f;
        itemCapacity = 50;
        targetAir= true;
        targetGround = true;
        faceTarget = true;
        circleTarget = true;
        rotateSpeed = 15f;
        maxRange=300;
        weapons.add(
            new Weapon("1"){{
            y=x=0;
            mirror=rotate=false;
            reload=150f;
            shake=2;
                shoot= new ShootSpread(){{
                    shots=3;
                    spread=10;
                }};
            bullet= new ShrapnelBulletType(){{
                length=240;
                damage=400;
                width=4;
                status=suckStatusEffects.brokenbody;
                buildingDamageMultiplier=0.35f;
            }};}});
        weapons.addAll(
            new Weapon("2"){{
                x=y=0f;
                xRand=8f;
                reload=600f;
                shootCone=360f;
                shoot= new ShootSpread(){{
                    shots=10;
                    spread=36;
                }};
                bullet= new BasicBulletType(){{
                    maxRange=300f;
                    width=height=8f;
                    speed=0.5f;
                    collides=false;
                    damage=0f;
                    shootEffect=Fx.shootSmall;
                    smokeEffect= Fx.shootSmallSmoke;
                    despawnEffect=Fx.none;
                    trailEffect= new parentizeEffects(){

                    }


                }};

            }}
);
    }};

    end = new UnitType("Eventually"){{
        flying=targetAir=targetGround=faceTarget=circleTarget=true;
        health=6000f;
        armor=25f;
        buildSpeed=2.4f;
        speed=1.6f;
        accel=0.05f;
        drag=0.017f;
        engineOffset=6f;
        itemCapacity=200;
        weapons.add(
            new Weapon("1"){{
            y=x=0;
            mirror=rotate=false;
            reload=150f;
            shake=2;
                shoot= new ShootSpread(){{
                    shots=3;
                    spread=10;
                }};
            bullet= new ShrapnelBulletType(){{
                length=240;
                damage=400;
                width=4;
                status=suckStatusEffects.brokenbody;
                buildingDamageMultiplier=0.35f;
            }};}});
            weapons.add(
                new weapon("2")

            )



    }};
//end of struggle
transport_drone_a= new UnitType("transport_drone_a"){{
flying=true;
itemCapacity=200;
health=500;
speed=2;
}};
//end of it java
    }}




