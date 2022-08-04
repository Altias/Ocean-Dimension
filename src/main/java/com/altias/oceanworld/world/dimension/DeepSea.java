package com.altias.oceanworld.world.dimension;

import com.altias.oceanworld.OceanWorld;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class DeepSea {
    public static final ResourceKey<Level> DIM_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,

            new ResourceLocation(OceanWorld.MOD_ID,"deepsea"));

    public static final ResourceKey<DimensionType> DIM_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY,DIM_KEY.getRegistryName());



    public static void register()
    {
        System.out.println("Registering Deep Sea for " + OceanWorld.MOD_ID);
    }


}
