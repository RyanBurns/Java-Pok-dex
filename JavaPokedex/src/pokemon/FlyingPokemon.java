package pokemon;

public class FlyingPokemon extends Pokemon {
	String pokemonBehaviour;
	String pokemonAttacks;

	public FlyingPokemon() {
		pokemonType = "Flying";
		pokemonBehaviour = "Most Flying type Pokémon are based on birds or insects, along with some mythical creatures like dragons. On average they are faster than any other type. Nearly every Flying type has Flying as the secondary type, usually with Normal. There is only one pure Flying Pokémon (Tornadus), and one line with Flying as a primary type (Noibat/Noivern).";
		pokemonAttacks = "Acrobatics,Aerial Ace,Aeroblast,Air Cutter,Air Slash,Bounce,Brave Bird,Chatter,Defog,Dragon Ascent,Drill Peck,Feather Dance,Fly,Gust,Hurricane,Mirror Move,Oblivion Wing,Peck,Pluck,Roost,Sky Attack,Sky Drop,Tailwind,Wing Attack";
	}

	public FlyingPokemon(int number, String name, String type, int stats,
			String evolution, String description) {
		super(number, name, type, stats, evolution, description);
	}
	
	// Using the this keyword to call one constructor from another
	public FlyingPokemon(int number, String name, String type, int stats,
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