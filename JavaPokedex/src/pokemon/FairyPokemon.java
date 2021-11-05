package pokemon;

public class FairyPokemon extends Pokemon {
	String pokemonBehaviour;
	String pokemonAttacks;

	public FairyPokemon() {
		pokemonType = "Fairy";
		pokemonBehaviour = "Fairy-type Pokémon are mostly cute, pink or feminine in appearance, and can be really powerful. Fairy types also have some magical appeal to them. As opposed to Psychic-type Pokémon, Fairy-type Pokémon have powers related to magic and supernatural powers, instead of mind power. ";
		pokemonAttacks = "Aromatic Mist,Baby-Doll Eyes,Charm,Crafty Shield,Dazzling Gleam,Disarming Voice,Draining Kiss,Fairy Lock,Fairy Wind,Flower Shield,Geomancy,Light of Ruin,Misty Terrain,Moonblast,Moonlight,Play Rough,Sweet Kiss";
	}

	public FairyPokemon(int number, String name, String type, int stats,
			String evolution, String description) {
		super(number, name, type, stats, evolution, description);
	}
	
	// Using the this keyword to call one constructor from another
	public FairyPokemon(int number, String name, String type, int stats,
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
	
	/*public void setDescription(String description)
	{	
		pokemonDescription = description;
	}
	
	public String getDescription()
	{	
		return pokemonDescription;
	}*/

	//switch

	//display
	public String toString()
	{	
		String str = "";
		str +="\nName: " + getName() + "\nNumber: " + getNumber() + "\ntype: " + getType() + "\nAttack moves: " + pokemonAttacks + "\nPokemon Behaviour: " + pokemonBehaviour;                                                         
		return str;
	}
}
