package model;

//PROGRESSION - 1 
//Go to JAVA Resouces - src/model and create a parent class called Pokemon inside the model package - with the following arguments
//String pokemonName
//Int pokemonNumber
//
//Generate appropriate getters and setters.
//Generate a two-argument constructor in the Pokemon class

public class Pokemon{
	String pokemonName;
	int pokemonNUmber;
	public String getPokemonName() {
		return pokemonName;
	}
	public void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}
	public int getPokemonNUmber() {
		return pokemonNUmber;
	}
	public void setPokemonNUmber(int pokemonNUmber) {
		this.pokemonNUmber = pokemonNUmber;
	}
	public Pokemon(String pokemonName, int pokemonNUmber) {
		super();
		this.pokemonName = pokemonName;
		this.pokemonNUmber = pokemonNUmber;
	}
	
}