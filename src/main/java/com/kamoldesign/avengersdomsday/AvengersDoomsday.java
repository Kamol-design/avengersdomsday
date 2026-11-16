package com.kamoldesign.avengersdomsday;

import com.kamoldesign.avengersdomsday.registry.ModItems;
import net.minecraftforge.fml.common.Mod;

@Mod(AvengersDoomsday.MOD_ID)
public class AvengersDoomsday {
    public static final String MOD_ID = "avengersdomsday";

    public AvengersDoomsday() {
        ModItems.register();
    }
}
