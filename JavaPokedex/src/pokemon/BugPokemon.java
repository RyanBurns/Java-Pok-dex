package pokemon;

public class BugPokemon extends Pokemon {
	String pokemonBehaviour;
	String pokemonAttacks;

	public BugPokemon() {
		pokemonType = "Bug";
		pokemonBehaviour = "Most Bug Pokémon grow quickly and evolve sooner than other types. As a result, they are often very weak. In Generation I, bugs were almost useless since the few Bug type moves available were very weak. The situation improved in later games with better moves and an advantage against the Dark type.";
		pokemonAttacks = "Attack Order,Bug Bite,Bug Buzz,Defend Order,Fell Stinger,Fury Cutter,Heal Order,Infestation,Leech Life,Megahorn,Pin Missile,Powder,Quiver Dance,Rage Powder,Signal Beam,Silver Wind,Spider Web,Steamroller,Sticky Web,String Shot,Struggle Bug,Tail Glow,Twineedle,U-turn,X-Scissor";
	}

	public BugPokemon(int number, String name, String type, int stats,
			String evolution, String description) {
		super(number, name, type, stats, evolution, description);
	}
	
	// Using the this keyword to call one constructor from another
	public BugPokemon(int number, String name, String type, int stats,
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
		str +="\nName: " + getName() + "\nNumber: " + getNumber() + "\nType: " + getType() +"\nAttack moves: " + pokemonAttacks + "\nPokemon Behaviour: " + pokemonBehaviour;                                                         
		return str;
	}
}
