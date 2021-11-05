package pokemon;
public class FirePokemon extends Pokemon {
	String pokemonBehaviour;
	String pokemonAttacks;

	public FirePokemon() {
		pokemonType = "Fire";
		pokemonBehaviour = "Fire is one of the three basic elemental types along with Water and Grass, which constitute the three starter Pokémon. This creates a simple triangle to explain the type concept easily to new players. Fire types are notoriously rare in the early stages of the games so choosing the Fire variation starter is often a plus.";
		pokemonAttacks = "Blast Burn,Blaze Kick,Blue Flare,Ember,Eruption,Fiery Dance,Fire Blast,Fire Fang,Fire Pledge,Fire Punch,Fire Spin,Flame Burst,Flame Charge,Flame Wheel,Flamethrower,Flare Blitz,Fusion Flare,Heat Crash,Heat Wave,Incinerate,Inferno,Lava Plume,Magma Storm,Mystical Fire,Overheat,Sacred Fire,Searing Shot,Sunny Day,V-create,Will-O-Wisp";
	}

	public FirePokemon(int number, String name, String type, int stats,
			String evolution, String description) {
		super(number, name, type, stats, evolution, description);
	}
	
	// Using the this keyword to call one constructor from another
	public FirePokemon(int number, String name, String type, int stats,
			String evolution, String description,String pokemonBehaviour,
			String pokemonAttacks)
	{	
		this(number, name, type, stats, evolution, description);
			this.pokemonBehaviour = pokemonBehaviour;
			this.pokemonAttacks = pokemonAttacks;
	}	
	
	// Sets and Gets
	public void setName(String name)
	{
		pokemonName = name;	
	}
	
	public String getName()
	{
		return pokemonName;	
	}
	
	public void setNumber(int num)
	{
		pokemonNumber = num;	
	}
	
	public int getNumber()
	{
		return pokemonNumber;	
	}
	
	public void setType(String type)
	{
		pokemonType = type;	
	}
	
	public String getType()
	{
		return pokemonType;	
	}
	 
	public void setStats(int stats)
	{
		pokemonStats = stats;	
	}
	
	public int getStats()
	{
		return pokemonStats;	
	}

	public void setEvolution(String evolution)
	{
		pokemonEvolution = evolution;	
	}
	
	public String getEvolution()
	{
		return pokemonEvolution;	
	}
	
	public void setDescription(String description)
	{	
		pokemonDescription = description;
	}
	
	public String getDescription()
	{	
		return pokemonDescription;
	}

	//switch

	//display
	public String toString()
	{	
		String str = "";
		str +="\nName: " + getName() + "\nNumber: " + getNumber() + "\n Type: " + getType() + "\nAttack moves: " + pokemonAttacks + "\nPokemon Behaviour: " + pokemonBehaviour;                                                         
		return str;
	}
}
