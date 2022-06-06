package com.mtstream.shelve.init;

import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.mtstream.shelve.Shelve;
import com.mtstream.shelve.block.BarChargerBlock;
import com.mtstream.shelve.block.BearTrapBlock;
import com.mtstream.shelve.block.BridgeBlock;
import com.mtstream.shelve.block.ChannelerBlock;
import com.mtstream.shelve.block.CheeseCakeBlock;
import com.mtstream.shelve.block.ChimneyBlock;
import com.mtstream.shelve.block.CopperBarBlock;
import com.mtstream.shelve.block.CreepshroomBlock;
import com.mtstream.shelve.block.CrystalBallBlock;
import com.mtstream.shelve.block.DiceBlock;
import com.mtstream.shelve.block.EggCartonBlock;
import com.mtstream.shelve.block.ExplosiveCrateBlock;
import com.mtstream.shelve.block.FireCrackerBlock;
import com.mtstream.shelve.block.FlameThrowerBlock;
import com.mtstream.shelve.block.FramedEndStoneBlock;
import com.mtstream.shelve.block.FuriousObsidianBlock;
import com.mtstream.shelve.block.GlassTubeBlock;
import com.mtstream.shelve.block.HarvesterBlock;
import com.mtstream.shelve.block.HumidityDetectorBlock;
import com.mtstream.shelve.block.IgniterBlock;
import com.mtstream.shelve.block.InstantTntBlock;
import com.mtstream.shelve.block.MegaGlowBerryBlock;
import com.mtstream.shelve.block.MilkCauldron;
import com.mtstream.shelve.block.NailBlock;
import com.mtstream.shelve.block.ResonatorBlock;
import com.mtstream.shelve.block.RespawnPendulumBlock;
import com.mtstream.shelve.block.RheostatBlock;
import com.mtstream.shelve.block.ShearerBlock;
import com.mtstream.shelve.block.StaticDetectorBlock;
import com.mtstream.shelve.block.TrashCanBlock;
import com.mtstream.shelve.block.WallClockBlock;
import com.mtstream.shelve.item.DiceItem;
import com.mtstream.shelve.item.blockItem.ToolTipBlockItem;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.WaterLilyBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Shelve.MOD_ID);
	public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;
	
	
			
	public static final RegistryObject<Block> CHANNELER = register("channeler",
			() -> new ChannelerBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).dynamicShape().sound(SoundType.COPPER)
					.requiresCorrectToolForDrops().strength(2.0F, 6.0F)),
			object -> () -> new ToolTipBlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), false));
	public static final RegistryObject<Block> BAR_CHARGRT = register("bar_charger",
			() -> new BarChargerBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).dynamicShape().sound(SoundType.COPPER)
					.requiresCorrectToolForDrops().strength(2.0F, 6.0F)),
			object -> () -> new ToolTipBlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), false));
			
	public static final RegistryObject<Block> IGNITER = register("igniter",
			() -> new IgniterBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).sound(SoundType.STONE)
					.requiresCorrectToolForDrops().strength(1.5F, 5.0F)),
			object -> () -> new ToolTipBlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), false));
	
	public static final RegistryObject<Block> FLAME_THROWER = register("flame_thrower",
			() -> new FlameThrowerBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).sound(SoundType.STONE)
					.requiresCorrectToolForDrops().strength(1.5F, 5.0F)),
			object -> () -> new ToolTipBlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), false));
			
	public static final RegistryObject<Block> HARVESTER = register("harvester",
			() -> new HarvesterBlock(BlockBehaviour.Properties.copy(Blocks.PISTON).dynamicShape().sound(SoundType.STONE)
					.requiresCorrectToolForDrops().strength(1.5F, 5.0F)),
			object -> () -> new ToolTipBlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), false));
	
	public static final RegistryObject<Block> SHEARER = register("entity_shearer",
			() -> new ShearerBlock(BlockBehaviour.Properties.copy(Blocks.PISTON).dynamicShape().sound(SoundType.STONE)
					.requiresCorrectToolForDrops().strength(1.5F, 5.0F)),
			object -> () -> new ToolTipBlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), false));
	
	public static final RegistryObject<Block> HUMIDITY_DETECTOR = register("humidity_detector",
			() -> new HumidityDetectorBlock(BlockBehaviour.Properties.copy(Blocks.DAYLIGHT_DETECTOR).dynamicShape().sound(SoundType.STONE)
					.strength(1.5f)),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
			
	public static final RegistryObject<Block> STATIC_DETECTOR = register("static_detector",
			() -> new StaticDetectorBlock(BlockBehaviour.Properties.copy(Blocks.DAYLIGHT_DETECTOR).dynamicShape().sound(SoundType.COPPER)
					.strength(1.5f)),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
			
	public static final RegistryObject<Block> TRASH_CAN = register("trash_can",
			() -> new TrashCanBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).dynamicShape().sound(SoundType.LANTERN)
					.strength(2.0F).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
			
	public static final RegistryObject<Block> MILK_CAULDRON = register("milk_cauldron",
			() -> new MilkCauldron(BlockBehaviour.Properties.copy(Blocks.CAULDRON).dynamicShape().sound(SoundType.METAL)
					.requiresCorrectToolForDrops().strength(2.0F, 6.0F)),
			object -> () -> new BlockItem(object.get(), new Item.Properties()));
	
	public static final RegistryObject<Block> CRYSTAL_BALL = register("crystal_ball",
			() -> new CrystalBallBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).dynamicShape().sound(SoundType.AMETHYST)
					.strength(1.5f)),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
	
	public static final RegistryObject<Block> INSTANT_TNT = register("instant_tnt",
			() -> new InstantTntBlock(BlockBehaviour.Properties.of(Material.EXPLOSIVE).instabreak().sound(SoundType.GRASS)), 
			object -> () -> new ToolTipBlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), false));
	
	public static final RegistryObject<Block> FIRECRACKER = register("firecracker",
			() -> new FireCrackerBlock(BlockBehaviour.Properties.of(Material.EXPLOSIVE).instabreak().dynamicShape().sound(SoundType.GRASS)), 
			object -> () -> new BlockItem(object.get(), new Item.Properties()));
	
	public static final RegistryObject<Block> CHEESE_CAKE = register("cheese_cake",
			() -> new CheeseCakeBlock(BlockBehaviour.Properties.copy(Blocks.CAKE).dynamicShape().sound(SoundType.WOOL)
					.strength(0.5f)),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
	
	public static final RegistryObject<Block> MEGA_GLOW_BERRY = register("mega_glow_berry",
			() -> new MegaGlowBerryBlock(BlockBehaviour.Properties.copy(Blocks.MELON).dynamicShape().sound(SoundType.SWEET_BERRY_BUSH).lightLevel($->14)
					.strength(0.7f)),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
	
	public static final RegistryObject<Block> CREEPSHROOM = register("creepshroom",
			() -> new CreepshroomBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).dynamicShape().sound(SoundType.SWEET_BERRY_BUSH)
					.instabreak()),
			object -> () -> new BlockItem(object.get(), new Item.Properties()));
	
	public static final RegistryObject<Block> EGG_CARTON = register("egg_carton",
			() -> new EggCartonBlock(BlockBehaviour.Properties.of(Material.WOOL).dynamicShape().sound(SoundType.SWEET_BERRY_BUSH)
					.strength(0.5f)),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
	
	public static final RegistryObject<Block> BRICKS_CHIMNEY = register("bricks_chimney",
			() -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).dynamicShape().sound(SoundType.STONE)
					.requiresCorrectToolForDrops().strength(2.0F, 6.0F)),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	
	public static final RegistryObject<Block> STONE_BRICKS_CHIMNEY = register("stone_bricks_chimney",
			() -> new ChimneyBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).dynamicShape().sound(SoundType.STONE)
					.requiresCorrectToolForDrops().strength(2.0F, 6.0F)),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	
	public static final RegistryObject<Block> BEAR_TRAP = register("bear_trap",
			() -> new BearTrapBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).dynamicShape().sound(SoundType.LANTERN)
					.requiresCorrectToolForDrops().strength(2.0F, 6.0F)),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
	public static final RegistryObject<Block> WOOD_PLANK_BRIDGE = register("wood_plank_bridge",
			() -> new BridgeBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD).dynamicShape().sound(SoundType.WOOD)
					.requiresCorrectToolForDrops().strength(0.5F, 2.0F)),
			object -> () -> new WaterLilyBlockItem(object.get(), new Item.Properties()));
	public static final RegistryObject<Block> RESONATOR = register("resonator",
			() -> new ResonatorBlock(BlockBehaviour.Properties.copy(Blocks.REPEATER).dynamicShape().sound(SoundType.WOOD)
					.instabreak()),
			object -> () -> new ToolTipBlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), true));
	public static final RegistryObject<Block> RHEOSTAT = register("rheostat",
			() -> new RheostatBlock(BlockBehaviour.Properties.copy(Blocks.COMPARATOR).dynamicShape().sound(SoundType.WOOD)
					.instabreak()),
			object -> () -> new ToolTipBlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), true));
	public static final RegistryObject<Block> COPPER_BARS = register("copper_bars",
			() -> new CopperBarBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).dynamicShape().sound(SoundType.COPPER)
					.requiresCorrectToolForDrops().strength(5.0F, 6.0F)),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
	
	public static final RegistryObject<Block> FURIOUS_OBSIDIAN = register("furious_obsidian",
			() -> new FuriousObsidianBlock(BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN).dynamicShape().sound(SoundType.STONE)
					.requiresCorrectToolForDrops().strength(50.0F, 1200.0F)),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<Block> FRAMED_END_STONE = register("framed_end_stone",
			() -> new FramedEndStoneBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).dynamicShape().sound(SoundType.STONE)
					.requiresCorrectToolForDrops().strength(50.0F, 600.0F).explosionResistance(1145141919)),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<Block> NAIL = register("nail",
			() -> new NailBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).dynamicShape().sound(SoundType.METAL)
					.instabreak()), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
	public static final RegistryObject<Block> DICE = register("dice",
			() -> new DiceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).dynamicShape().sound(SoundType.METAL)
					.instabreak()), 
			object -> () -> new DiceItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
	public static final RegistryObject<Block> HANGING_CLOCK = register("hanging_clock",
			() -> new WallClockBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).dynamicShape().sound(SoundType.METAL)
					.instabreak()), 
			object -> () -> new BlockItem(object.get(), new Item.Properties()));
	public static final RegistryObject<Block> EXPLOSIVE_CRATE = register("explosive_crate",
			() -> new ExplosiveCrateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD).dynamicShape().sound(SoundType.WOOD)), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
	public static final RegistryObject<Block> GLASS_TUBE = register("glass_tube",
			() -> new GlassTubeBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).dynamicShape().sound(SoundType.GLASS).lightLevel($->{return GlassTubeBlock.getLightLevel($);})
					.emissiveRendering((s,l,p)->{return GlassTubeBlock.isEmissive(s);})), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
	public static final RegistryObject<Block> RESPAWN_PENDULUM = register("respawn_pendulum",
			() -> new RespawnPendulumBlock(BlockBehaviour.Properties.copy(Blocks.RESPAWN_ANCHOR).dynamicShape().sound(SoundType.STONE)), 
			object -> () -> new BlockItem(object.get(), new Item.Properties()));
	
	
	
	
	public static final RegistryObject<Block> V = register("v",
			() -> new com.mtstream.shelve.block.V(BlockBehaviour.Properties.of(Material.AIR)),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

	private static <T extends Block> RegistryObject<T> registerBlock(final String name,final Supplier<? extends T> block){
		return BLOCKS.register(name, block);
	}		
	
	private static <T extends Block> RegistryObject<T> register(final String name,final Supplier<? extends T> block,
			Function<RegistryObject<T>, Supplier<? extends Item>> item){
		RegistryObject<T> obj = registerBlock(name,block);
		ITEMS.register(name,item.apply(obj));
		return obj;
	}
}
