public class BatallaPokemon {
    
    public static void main(String[] args) {
        
        PokemonAgua PokemonAgua = new PokemonAgua("Squirtle", 10);
        PokemonPlanta PokemonPlanta = new PokemonPlanta("Bulbasaur", 10);

        
        PokemonAgua.atacar("Burbuja", PokemonPlanta);

        
        PokemonPlanta.atacar("Rayo solar", PokemonAgua);
      
    }
  
}
