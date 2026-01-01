package net.lovhol.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lovhol.testmod.TestMod;
import net.lovhol.testmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemTabs {

    public static final ItemGroup TEST_MOD_ITEM_TAB = Registry.register(Registries.ITEM_GROUP, Identifier.of(TestMod.MOD_ID, "test_mod_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET)).displayName(Text.translatable("itemtab.testmod.test_mod_items"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                    }).build());

    public static void registerItemTabs() {

        TestMod.LOGGER.info("Registering Mod Item Tabs for " + TestMod.MOD_ID);


    }
}
