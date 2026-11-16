package com.kamoldesign.avengersdomsday.registry;

import com.kamoldesign.avengersdomsday.AvengersDoomsday;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModCreativeTabs {
    private static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(ForgeRegistries.CREATIVE_MODE_TABS, AvengersDoomsday.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAIN =
            TABS.register("main", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.avengersdomsday.main"))
                    .icon(() -> new ItemStack(ModItems.HERO_DATABASE.get()))
                    .displayItems((parameters, output) -> output.accept(ModItems.HERO_DATABASE.get()))
                    .build());

    private ModCreativeTabs() {}

    public static void register() {
        IEventBus modBus = net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext.get().getModEventBus();
        TABS.register(modBus);
    }
}
