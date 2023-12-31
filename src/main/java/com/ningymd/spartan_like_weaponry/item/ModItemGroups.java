package com.ningymd.spartan_like_weaponry.item;

import com.ningymd.spartan_like_weaponry.SpartanLikeWeaponry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SpartanLikeWeaponry.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.TEST);

                        entries.add(Items.DIAMOND);


                    }).build());

    public static void registerItemGroups() {
        SpartanLikeWeaponry.LOGGER.info("Registering Item Groups for " + SpartanLikeWeaponry.MOD_ID);
    }
}
