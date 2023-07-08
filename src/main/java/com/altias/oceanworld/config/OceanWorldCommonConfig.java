package com.altias.oceanworld.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OceanWorldCommonConfig {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> SEA_LEVEL;

    static
    {
        BUILDER.push("Ocean World Configs");

        SEA_LEVEL = BUILDER.comment("The height the water reaches in the Deep Sea dimension. Can be set from 62 (default sea level in overworld) to 320 (max height in minecraft)")
                .defineInRange("Water Level", 300,62,320);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
