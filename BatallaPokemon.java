public class BatallaPokemon {
    
    public static void main(String[] args) {
        // Crea instancias de cada clase hija con nombre y nivel 10
        PokemonAgua PokemonAgua = new PokemonAgua("Squirtle", 10);
        PokemonPlanta PokemonPlanta = new PokemonPlanta("Bulbasaur", 10);

        // Primero, el Pokemon de Agua ataca al Pokemon de Planta
        PokemonAgua.atacar("Burbuja", PokemonPlanta);

        // Luego, el Pokemon de Planta ataca al Pokemon de Agua
        PokemonPlanta.atacar("Rayo solar", PokemonAgua);
      
    }
  
}
