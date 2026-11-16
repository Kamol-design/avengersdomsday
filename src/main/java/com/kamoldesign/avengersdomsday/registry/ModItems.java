package com.kamoldesign.avengersdomsday.registry;

import com.kamoldesign.avengersdomsday.AvengersDoomsday;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public final class ModItems {
    private static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AvengersDoomsday.MOD_ID);

    public static final RegistryObject<Item> HERO_DATABASE =
            ITEMS.register("hero_database", () -> new Item(new Item.Properties().stacksTo(1)));

    private ModItems() {}

    public static void register() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(modBus);
    }
}
