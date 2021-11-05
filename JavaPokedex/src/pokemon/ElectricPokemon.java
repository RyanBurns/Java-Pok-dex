package pokemon;

public class ElectricPokemon extends Pokemon {
	String pokemonBehaviour;
	String pokemonAttacks;

	public ElectricPokemon() {
		pokemonType = "Electric";
		pokemonBehaviour = "There are relatively few Electric Pokémon; in fact only four were added in the third generation. Most are based on rodents or inanimate objects. Electric Pokémon are very good defensively, being weak only to Ground moves.";
		pokemonAttacks = "Bolt Strike,Charge,Charge Beam,Discharge,Eerie Impulse,Electric Terrain,Electrify,Electro Ball,Electroweb,Fusion Bolt,Ion Deluge,Magnet Rise,Magnetic Flux,NuzzleParabolic Charge,Shock Wave,Spark,Thunder,Thunder Fang,Thunder Punch,Thunder Shock,Thunder Wave,Thunderbolt,Volt Switch,Volt Tackle,Wild Charge,Zap Cannon";
	}

	public ElectricPokemon(int number, String name, String type, int stats,
			String evolution, String description) {
		super(number, name, type, stats, evolution, description);
	}
	
	// Using the this keyword to call one constructor from another
	public ElectricPokemon(int number, String name, String type, int stats,
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

	//switch

	//display
	public String toString()
	{	
		String str = "";
		str +="\nName: " + getName() + "\nNumber: " + getNumber() + "\nType: " + getType() + "\nAttack moves: " + pokemonAttacks + "\nPokemon Behaviour: " + pokemonBehaviour;                                                         
		return str;
	}
}
