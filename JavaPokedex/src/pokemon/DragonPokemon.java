package pokemon;

public class DragonPokemon extends Pokemon {
	String pokemonBehaviour;
	String pokemonAttacks;

	public DragonPokemon() {
		pokemonType = "Dragon";
		pokemonBehaviour = "Dragons are among the most elusive and powerful of all Pokemon.They are notoriously difficult to train due to requiring more EXP points per level than most non-legendary Pokémon, and the fact they evolve much later and thus are in their weaker forms for longer. Interestingly, many final-evolution Dragon types have a 4x weakness to the Ice type.";
		pokemonAttacks = "Draco Meteor,Dragon Breath,Dragon Claw,Dragon Dance,Dragon Pulse,Dragon Rage,Dragon Rush,Dragon Tail,Dual Chop,Outrage,Roar of Time,Spacial Rend,Twister";
	}

	public DragonPokemon(int number, String name, String type, int stats,
			String evolution, String description) {
		super(number, name, type, stats, evolution, description);
	}
	
	// Using the this keyword to call one constructor from another
	public DragonPokemon(int number, String name, String type, int stats,
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
		str +="\nName: " + getName() + "\nNumber: " + getNumber() + "\nType: " + getType() + "\nAttack moves: " + pokemonAttacks + "\nPokemon Behaviour: " + pokemonBehaviour;                                                         
		return str;
	}
}