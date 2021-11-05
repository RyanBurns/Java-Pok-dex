package pokemon;

public class FightingPokemon extends Pokemon {
	String pokemonBehaviour;
	String pokemonAttacks;

	public FightingPokemon() {
		pokemonType = "Fighting";
		pokemonBehaviour = "Fighting Pokémon are strong and muscle-bound, often based on martial artists. Fighting moves are super-effective against five other types (as is Ground), making them very good offensively. Most Fighting type moves are in the Physical category, for obvious reasons.";
		pokemonAttacks = "Arm Thrust,Aura Sphere,Brick Break,Bulk Up,Circle Throw,Close Combat,Counter,Cross Chop,Detect,Double Kick,Drain Punch,Dynamic Punch,Final Gambit,Flying Press,Focus Blast,Focus Punch,Force Palm,Hammer Arm,High Jump Kick,Jump Kick,Karate Chop,Low Kick,Low Sweep,Mach Punch,Mat Block,Power-Up Punch,Quick Guard,Revenge,Reversal,Rock Smash,Rolling Kick,Sacred Sword,Secret Sword,Seismic Toss,Sky Uppercut,Storm Throw,Submission,Superpower,Triple Kick,Vacuum Wave,Vital Throw,Wake-Up Slap";
	}

	public FightingPokemon(int number, String name, String type, int stats,
			String evolution, String description) {
		super(number, name, type, stats, evolution, description);
	}
	
	// Using the this keyword to call one constructor from another
	public FightingPokemon(int number, String name, String type, int stats,
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
