package com.altias.oceanworld.villager;

import com.altias.oceanworld.OceanWorld;
import com.altias.oceanworld.block.ModBlocks;
import com.google.common.collect.ImmutableSet;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPOIs {
    public static final DeferredRegister<PoiType> POI
            = DeferredRegister.create(ForgeRegistries.POI_TYPES, OceanWorld.MOD_ID);

    public static final RegistryObject<PoiType> SEA_PORTAL =
            POI.register("sea_portal", () -> new PoiType(
                    ImmutableSet.copyOf(ModBlocks.SEA_PORTAL.get().getStateDefinition().getPossibleStates())
                   , 0, 1));


    public static void register(IEventBus eventBus) {
        POI.register(eventBus);
    }
}
