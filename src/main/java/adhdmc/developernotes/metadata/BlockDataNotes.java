package adhdmc.developernotes.metadata;

import adhdmc.developernotes.DeveloperNotes;
import org.bukkit.Axis;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.Orientable;

public class BlockDataNotes {

    /*Sub-interfaces of BlockData:
    Ageable, AmethystCluster, AnaloguePowerable, Attachable, Bamboo,
    Barrel, Bed, Beehive, Bell, BigDripleaf, Bisected, BrewingStand,
    BubbleColumn, Cake, Campfire, Candle, CaveVines, CaveVinesPlant,
    Chain, Chest, ChiseledBookshelf, Cocoa, CommandBlock, Comparator,
    CoralWallFan, DaylightDetector, Directional, Dispenser, Door,
    Dripleaf, EnderChest, EndPortalFrame, FaceAttachable, Farmland,
    Fence, Fire, Furnace, Gate, GlassPane, GlowLichen, Grindstone,
    Hangable, HangingSign, Hopper, Jigsaw, Jukebox, Ladder, Lantern,
    Leaves, Lectern, Levelled, Light, Lightable, LightningRod,
    MangrovePropagule, MultipleFacing, NoteBlock, Observer, Openable,
    Orientable, Piston, PistonHead, PointedDripstone, Powerable, Rail,
    RedstoneRail, RedstoneWallTorch, RedstoneWire, Repeater, RespawnAnchor,
    Rotatable, Sapling, Scaffolding, SculkCatalyst, SculkSensor, SculkShrieker,
    SculkVein, SeaPickle, Sign, Slab, SmallDripleaf, Snow, Snowable, Stairs,
    StructureBlock, Switch, TechnicalPiston, TNT, TrapDoor, Tripwire, TripwireHook,
    TurtleEgg, Wall, WallHangingSign, WallSign, Waterlogged*/

    public void settingBlockData(){
        Location location = new Location(DeveloperNotes.getInstance().getServer().getWorlds().get(0), 1, 1, 1 );
        //that was a really weird, way to get a location
        Block block = location.getBlock();
        Orientable blockData = (Orientable) Bukkit.createBlockData(Material.DAMAGED_ANVIL);
        blockData.setAxis(Axis.X);
        block.setBlockData(blockData);
    }
    /*Same idea for items*/
}
