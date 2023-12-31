package com.ningymd.spartan_like_weaponry;

import com.ningymd.spartan_like_weaponry.item.ModItemGroups;
import com.ningymd.spartan_like_weaponry.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SpartanLikeWeaponry implements ModInitializer {
    public static final String MOD_ID = "spartan_like_weaponry";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
    }
}
