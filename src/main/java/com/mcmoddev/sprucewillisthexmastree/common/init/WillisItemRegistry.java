package com.mcmoddev.sprucewillisthexmastree.common.init;

import com.mcmoddev.sprucewillisthexmastree.SpruceWillisTheXmasTree;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.awt.*;

/**
 * The registry class this mod uses for items.
 */
@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = SpruceWillisTheXmasTree.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class WillisItemRegistry {

	/**
	 * @param event Add items and block items to the item registry.
	 */
	@SubscribeEvent
	@SuppressWarnings("unused")
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
			new SpawnEggItem(WillisEntityRegistry.SPRUCE_WILLIS_THE_XMAS_TREE, Color.GREEN.getRGB(), Color.RED.getRGB(),
				new Item.Properties().group(ItemGroup.MISC))
				.setRegistryName(SpruceWillisTheXmasTree.MODID, "spruce_willis_the_xmas_tree_spawn_egg")
		);
	}
}
