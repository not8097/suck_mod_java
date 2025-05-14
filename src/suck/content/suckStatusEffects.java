package suck.content;

import arc.graphics.*;
import mindustry.type.*;
public class suckStatusEffects {
        public static StatusEffect 
        brokenbody,ruthless_assault
		;

    public static void load() {


		brokenbody = new StatusEffect("brokenbody") {{
			color =  Color.valueOf("000000");
			reloadMultiplier = 0.5f;
			speedMultiplier = 0.3f;
			permanent = true;
		}};

		ruthless_assault = new StatusEffect("ruthless_assault"){{
			speedMultiplier = 2.5f;
			color =  Color.valueOf("8EDDFF");



		}};
}}