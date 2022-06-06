package com.mtstream.shelve.init;

import com.google.common.base.Supplier;
import com.mtstream.shelve.Shelve;
import com.mtstream.shelve.item.ChaoticStewItem;
import com.mtstream.shelve.item.CreeperBudItem;
import com.mtstream.shelve.item.DiceItem;
import com.mtstream.shelve.item.HandheldDispenserItem;
import com.mtstream.shelve.item.RippingForkItem;
import com.mtstream.shelve.item.TransmutationMagnetItem;
import com.mtstream.shelve.item.TuningForkItem;
import com.mtstream.shelve.item.TurfItem;
import com.mtstream.shelve.item.boxitem.InfernalBoxItem;
import com.mtstream.shelve.item.boxitem.MarineBoxItem;
import com.mtstream.shelve.item.boxitem.MysteriousBoxItem;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Shelve.MOD_ID);

	public static final RegistryObject<Item> TURF = Register("turf", ()->new TurfItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MARINIDE_INGOT = Register("marinide_ingot", ()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HANDHELD_DISPENSER = Register("handheld_dispenser", ()->new HandheldDispenserItem(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1)));
	public static final RegistryObject<Item> AMETHYST_BALL = Register("amethyst_ball", ()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
	public static final RegistryObject<Item> CHEESE = Register("cheese", ()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(5).saturationMod(4).build())));
	public static final RegistryObject<Item> CREEPER_BUD = Register("creeper_bud", ()->new CreeperBudItem(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
	public static final RegistryObject<Item> CHAOTIC_STEW = Register("chaotic_stew", ()->new ChaoticStewItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(1).saturationMod(1).build())));
	public static final RegistryObject<Item> TUNING_FORK = Register("tuning_fork", ()->new TuningForkItem(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1)));
	public static final RegistryObject<Item> RIPPING_FORK = Register("ripping_fork", ()->new RippingForkItem(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1)));
	//Unfinished
	public static final RegistryObject<Item> TRANSMUTATION_MAGNET = Register("transmutation_magnet", ()->new TransmutationMagnetItem(new Item.Properties()));
	
	public static final RegistryObject<Item> EMPTY_BOX = Register("empty_box", ()->new Item(new Item.Properties()));
	public static final RegistryObject<Item> MYSTERIOUS_BOX = Register("mysterious_box", ()->new MysteriousBoxItem(new Item.Properties()));
	public static final RegistryObject<Item> INFERNAL_BOX = Register("infernal_box", ()->new InfernalBoxItem(new Item.Properties()));
	public static final RegistryObject<Item> MARINE_BOX = Register("marine_box", ()->new MarineBoxItem(new Item.Properties()));
	
	
	
	
	public static <T extends Item> RegistryObject<T> Register(final String name, final Supplier<T> item){
		return ITEMS.register(name, item);
		
	}
}
