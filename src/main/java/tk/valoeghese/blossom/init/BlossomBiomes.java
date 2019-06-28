package tk.valoeghese.blossom.init;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import tk.valoeghese.blossom.Blossom;
import tk.valoeghese.blossom.biome.TropicalIslandBiome;
import tk.valoeghese.blossom.biome.TropicalIslandShoreBiome;

public final class BlossomBiomes
{
	public static Biome TROPICAL_ISLAND;
	public static Biome PALM_BEACH;
	
	public static void init()
	{
		TROPICAL_ISLAND = register(new TropicalIslandBiome(), "tropical_island");
		PALM_BEACH = register(new TropicalIslandShoreBiome(), "palm_beach");
	}
	
	private static Biome register(Biome biome, String id)
	{
		return Registry.register(Registry.BIOME, Blossom.create(id), biome);
	}
}