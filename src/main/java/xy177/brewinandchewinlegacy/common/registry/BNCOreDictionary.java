package xy177.brewinandchewinlegacy.common.registry;

import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;
import xy177.brewinandchewinlegacy.BrewinAndChewinLegacy;

public final class BNCOreDictionary {
    private static boolean registered;
    private static boolean berryCompatibilityRegistered;

    private BNCOreDictionary() {
    }

    public static void register() {
        if (registered) {
            return;
        }
        registered = true;

        OreDictionary.registerOre("bncCheeseWedge", BNCItems.FLAXEN_CHEESE_WEDGE);
        OreDictionary.registerOre("bncCheeseWedge", BNCItems.SCARLET_CHEESE_WEDGE);
        OreDictionary.registerOre("bncMilkFood", Items.MILK_BUCKET);
        OreDictionary.registerOre("listAllEgg", Items.EGG);
        OreDictionary.registerOre("cropCarrot", Items.CARROT);
        OreDictionary.registerOre("cropPotato", Items.POTATO);
        OreDictionary.registerOre("cropBeetroot", Items.BEETROOT);
        OreDictionary.registerOre("foodBread", Items.BREAD);
        OreDictionary.registerOre("listAllveggie", Items.CARROT);
        OreDictionary.registerOre("listAllveggie", Items.POTATO);
        OreDictionary.registerOre("listAllveggie", Items.BEETROOT);
        OreDictionary.registerOre("listAllmilk", Items.MILK_BUCKET);
        OreDictionary.registerOre("listAllfishraw", Items.FISH);
        OreDictionary.registerOre("listAllfishraw", new ItemStack(Items.FISH, 1, 1));
        OreDictionary.registerOre("bncSugar", Items.SUGAR);
        OreDictionary.registerOre("bncPaleFlower", new ItemStack(Blocks.RED_FLOWER, 1, 6));
        OreDictionary.registerOre("bncPaleFlower", new ItemStack(Blocks.RED_FLOWER, 1, 8));
        OreDictionary.registerOre("bncJerkyMeat", Items.ROTTEN_FLESH);
        OreDictionary.registerOre("bncJerkyMeat", Items.BEEF);
        OreDictionary.registerOre("bncJerkyMeat", Items.PORKCHOP);
        OreDictionary.registerOre("bncJerkyMeat", Items.CHICKEN);
        OreDictionary.registerOre("bncJerkyMeat", Items.MUTTON);
        OreDictionary.registerOre("bncJerkyMeat", Items.RABBIT);
        OreDictionary.registerOre("bncPizzaTopping", Blocks.BROWN_MUSHROOM);
        OreDictionary.registerOre("bncPizzaTopping", Blocks.RED_MUSHROOM);
        OreDictionary.registerOre("bncPizzaTopping", Items.CARROT);
        OreDictionary.registerOre("bncPizzaTopping", Items.BEETROOT);
        OreDictionary.registerOre("bncPizzaTopping", Items.COOKED_BEEF);
        OreDictionary.registerOre("bncPizzaTopping", Items.COOKED_FISH);
        OreDictionary.registerOre("bncPizzaTopping", new ItemStack(Items.COOKED_FISH, 1, 1));
        OreDictionary.registerOre("bncPizzaTopping", Items.COOKED_MUTTON);
        OreDictionary.registerOre("bncPizzaTopping", Items.COOKED_PORKCHOP);

        registerExternalOre("cropOnion", "farmersdelight:onion");
        registerExternalOre("cropTomato", "farmersdelight:tomato");
        registerExternalOre("cropCabbage", "farmersdelight:cabbage_leaf");
        registerExternalOre("cropRice", "farmersdelight:rice");
        registerExternalOre("listAllveggie", "farmersdelight:onion");
        registerExternalOre("listAllveggie", "farmersdelight:tomato");
        registerExternalOre("listAllveggie", "farmersdelight:cabbage_leaf");
        registerExternalOre("foodPasta", "farmersdelight:raw_pasta");
        registerExternalOre("foodDough", "farmersdelight:wheat_dough");
        registerExternalOre("listAllfishraw", "farmersdelight:cod_slice");
        registerExternalOre("listAllfishraw", "farmersdelight:salmon_slice");
        registerExternalOre("rawOrSlicedCod", "farmersdelight:cod_slice");
        registerExternalOre("rawOrSlicedSalmon", "farmersdelight:salmon_slice");
        registerExternalOre("bncMilkFood", "farmersdelight:milk_bottle");
        registerExternalOre("bncPizzaTopping", "farmersdelight:cabbage_leaf");
        registerExternalOre("bncPizzaTopping", "farmersdelight:onion");
        registerExternalOre("bncPizzaTopping", "farmersdelight:cooked_bacon");
        registerExternalOre("bncHoneyItem", "futuremc:honey_bottle");
        registerExternalOre("bncHoneyItem", "farmers_future_delight:honey_bottle");
        if (BNCItems.ADULTERATED_HONEY != null) {
            OreDictionary.registerOre("bncHoneyItem", BNCItems.ADULTERATED_HONEY);
        }
        registerExternalOre("bncBeeswax", "futuremc:honeycomb");
        registerExternalOre("bncBeeswax", "farmers_future_delight:honeycomb");
        if (BNCItems.SYNTHETIC_BEESWAX != null) {
            OreDictionary.registerOre("bncBeeswax", BNCItems.SYNTHETIC_BEESWAX);
        }
        registerOptionalOre("bncKelp", "oe:kelp", BNCItems.KELP == null ? ItemStack.EMPTY : new ItemStack(BNCItems.KELP));
        registerExternalOre("bncKelp", "farmers_future_delight:kelp");
        registerOptionalOre("bncDriedKelp", "oe:dried_kelp", BNCItems.DRIED_KELP == null ? ItemStack.EMPTY : new ItemStack(BNCItems.DRIED_KELP));
        registerExternalOre("bncDriedKelp", "farmers_future_delight:dried_kelp");
        registerOptionalOre("bncSeaPickle", "oe:sea_pickle", BNCItems.SEA_PICKLE == null ? ItemStack.EMPTY : new ItemStack(BNCItems.SEA_PICKLE));
        registerExternalOre("bncSeaPickle", "farmers_future_delight:sea_pickle");
        registerFirstExistingOre("bncSeagrass", "oe:seagrass", "futuremc:seagrass", "farmers_future_delight:seagrass");
        registerExternalOre("bncSeagrass", "farmers_future_delight:seagrass");
        if (OreDictionary.getOres("bncSeagrass").isEmpty() && BNCItems.SEAGRASS != null) {
            OreDictionary.registerOre("bncSeagrass", BNCItems.SEAGRASS);
        }
        registerOptionalOre("bncGlowInkSac", "oe:glow_ink_sac", BNCItems.GLOW_INK_SAC == null ? ItemStack.EMPTY : new ItemStack(BNCItems.GLOW_INK_SAC));
        registerExternalOre("bncGlowInkSac", "farmers_future_delight:glow_ink_sac");
        registerOptionalOre("bncTurtleEgg", "oe:turtle_egg", BNCItems.TURTLE_EGG == null ? ItemStack.EMPTY : new ItemStack(BNCItems.TURTLE_EGG));
        registerExternalOre("bncTurtleEgg", "farmers_future_delight:turtle_egg");
        registerFirstExistingOre("bncOminousBottle", "deeperdepths:ominous_bottle", "raids:ominous_bottle");
        registerFirstExistingOre("bncWitherRose", "futuremc:wither_rose", "minecraft:wither_rose", "oe:wither_rose", "da:wither_rose");
        registerAnyExternalPathOre("bncWitherRose", "wither_rose");
        if (OreDictionary.getOres("bncWitherRose").isEmpty() && BNCItems.WITHER_ROSE != null) {
            OreDictionary.registerOre("bncWitherRose", BNCItems.WITHER_ROSE);
        }
        registerFirstExistingOre("bncCrimsonFungus",
            "futuremc:crimson_fungus",
            "netherized:crimson_fungus",
            "nb:crimson_fungus",
            "farmers_future_delight:crimson_fungus");
        registerExternalOre("bncCrimsonFungus", "farmers_future_delight:crimson_fungus");
        registerFirstExistingOre("bncWarpedFungus",
            "futuremc:warped_fungus",
            "netherized:warped_fungus",
            "nb:warped_fungus",
            "farmers_future_delight:warped_fungus");
        registerExternalOre("bncWarpedFungus", "farmers_future_delight:warped_fungus");
        registerFirstExistingOre("bncShroomlight",
            "netherized:shroomlight",
            "nb:shroom_light",
            "farmers_future_delight:shroomlight");
        registerExternalOre("bncShroomlight", "farmers_future_delight:shroomlight");
        if (OreDictionary.getOres("bncShroomlight").isEmpty()) {
            OreDictionary.registerOre("bncShroomlight", new ItemStack(Blocks.GLOWSTONE));
        }
        if (OreDictionary.getOres("bncCrimsonFungus").isEmpty() && BNCItems.CRIMSON_FUNGUS != null) {
            OreDictionary.registerOre("bncCrimsonFungus", BNCItems.CRIMSON_FUNGUS);
        }
        if (OreDictionary.getOres("bncWarpedFungus").isEmpty() && BNCItems.WARPED_FUNGUS != null) {
            OreDictionary.registerOre("bncWarpedFungus", BNCItems.WARPED_FUNGUS);
        }
    }

    public static void registerBerryCompatibility() {
        if (berryCompatibilityRegistered) {
            return;
        }
        berryCompatibilityRegistered = true;

        registerPreferredOre("bncSweetBerries", BNCItems.SWEET_BERRIES, "futuremc:sweet_berries", "farmers_future_delight:sweet_berries");
        registerExternalOre("bncSweetBerries", "farmers_future_delight:sweet_berries");
        registerPreferredOre("bncGlowBerries", BNCItems.GLOW_BERRIES, "da:glow_berry", "depthsupdate:glow_berries", "farmers_future_delight:glow_berries");
        registerExternalOre("bncGlowBerries", "farmers_future_delight:glow_berries");
    }

    public static Item getSweetBerriesItem() {
        Item preferred = findFirstItem("futuremc:sweet_berries", "farmers_future_delight:sweet_berries");
        return preferred == null ? BNCItems.SWEET_BERRIES : preferred;
    }

    public static Item getGlowBerriesItem() {
        Item preferred = findFirstItem("da:glow_berry", "depthsupdate:glow_berries", "farmers_future_delight:glow_berries");
        return preferred == null ? BNCItems.GLOW_BERRIES : preferred;
    }

    public static boolean hasExternalGlowBerries() {
        return findFirstItem("da:glow_berry", "depthsupdate:glow_berries", "farmers_future_delight:glow_berries") != null;
    }

    public static Item getKelpItem() {
        Item preferred = findFirstItem("oe:kelp", "farmers_future_delight:kelp");
        return preferred == null ? BNCItems.KELP : preferred;
    }

    public static Item getSeaPickleItem() {
        Item preferred = findFirstItem("oe:sea_pickle", "farmers_future_delight:sea_pickle");
        return preferred == null ? BNCItems.SEA_PICKLE : preferred;
    }

    public static Item getSeagrassItem() {
        Item preferred = findFirstItem("oe:seagrass", "futuremc:seagrass", "farmers_future_delight:seagrass");
        return preferred == null ? BNCItems.SEAGRASS : preferred;
    }

    public static Item getTurtleEggItem() {
        Item preferred = findFirstItem("oe:turtle_egg", "farmers_future_delight:turtle_egg");
        return preferred == null ? BNCItems.TURTLE_EGG : preferred;
    }

    public static boolean hasOceanFallbackItems() {
        return BNCItems.KELP != null || BNCItems.SEA_PICKLE != null;
    }

    private static void registerExternalOre(String oreName, String id) {
        Item item = findItem(id);
        if (item != null && !containsItem(oreName, item)) {
            OreDictionary.registerOre(oreName, item);
        }
    }

    private static boolean containsItem(String oreName, Item item) {
        for (ItemStack stack : OreDictionary.getOres(oreName)) {
            if (!stack.isEmpty() && stack.getItem() == item) {
                return true;
            }
        }
        return false;
    }

    private static void registerPreferredOre(String oreName, Item fallback, String... preferredIds) {
        Item preferred = findFirstItem(preferredIds);
        Item item = preferred == null ? fallback : preferred;
        if (item != null) {
            OreDictionary.registerOre(oreName, item);
        }
    }

    private static Item findFirstItem(String... ids) {
        for (String id : ids) {
            Item item = findItem(id);
            if (item != null) {
                return item;
            }
        }
        return null;
    }

    private static void registerOptionalOre(String oreName, String preferredId, ItemStack fallback) {
        Item preferred = findItem(preferredId);
        if (preferred != null) {
            OreDictionary.registerOre(oreName, preferred);
        } else if (!fallback.isEmpty()) {
            OreDictionary.registerOre(oreName, fallback);
        }
    }

    private static void registerFirstExistingOre(String oreName, String... ids) {
        for (String id : ids) {
            Item item = findItem(id);
            if (item != null) {
                OreDictionary.registerOre(oreName, item);
                return;
            }
        }
    }

    private static void registerAnyExternalPathOre(String oreName, String path) {
        if (!OreDictionary.getOres(oreName).isEmpty()) {
            return;
        }
        for (Item item : ForgeRegistries.ITEMS) {
            ResourceLocation registryName = item.getRegistryName();
            if (registryName != null
                && path.equals(registryName.getResourcePath())
                && !BrewinAndChewinLegacy.MODID.equals(registryName.getResourceDomain())) {
                OreDictionary.registerOre(oreName, item);
                return;
            }
        }
    }

    private static ItemStack firstOreOrEmpty(String oreName) {
        return OreDictionary.getOres(oreName).isEmpty() ? ItemStack.EMPTY : OreDictionary.getOres(oreName).get(0).copy();
    }

    private static Item findItem(String id) {
        return ForgeRegistries.ITEMS.getValue(new ResourceLocation(id));
    }
}
