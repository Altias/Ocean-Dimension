package com.altias.oceanworld.item;

import com.altias.oceanworld.OceanWorld;
import com.altias.oceanworld.item.custom.PortalOpen;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OceanWorld.MOD_ID);

    public static final RegistryObject<Item> SEA_KEY = ITEMS.register("sea_key", PortalOpen::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
