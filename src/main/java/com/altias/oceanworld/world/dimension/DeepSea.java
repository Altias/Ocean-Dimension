package com.altias.oceanworld.world.dimension;

import com.altias.oceanworld.OceanWorld;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

import java.awt.*;

public class DeepSea {
    public static final ResourceKey<Level> DIM_KEY = registerKey("deepsea");


    public static ResourceKey<Level> registerKey(String name) {
        return ResourceKey.create(Registries.DIMENSION, new ResourceLocation(OceanWorld.MOD_ID, name));
    }

    public static ResourceKey<DimensionType> registerTypeKey(String name) {
        return ResourceKey.create(Registries.DIMENSION_TYPE, new ResourceLocation(OceanWorld.MOD_ID, name));
    }



    public static void register()
    {
        System.out.println("Registering Deep Sea for " + OceanWorld.MOD_ID);
    }


}
