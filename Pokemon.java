public class Pokemon {

    private int hp = 100;
    private int nivel;
    private String nombre;
    private String tipo;

    public Pokemon(String nombre, String tipo, int nivel) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public int getHp() {
        return hp;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }

    private int calculaDanio() {
        int danio = (int) (Math.random() * 10 + 1);
        hp -= danio;
        return danio;
    }

    public void recibirAtaque(String movimiento) {
        System.out.printf("%s recibe ATK %s\n", nombre, movimiento);
        int danio = calculaDanio();
        System.out.printf("%s tiene ahora %d puntos de vida.\n", nombre, hp);
        System.out.printf("%s recibe %d puntos de danio\n", nombre, danio);
    }

    public void atacar(String movimiento, Pokemon pokemon) {
        System.out.printf("%s ataca a %s con %s\n", nombre, pokemon.getNombre(), movimiento);
        pokemon.recibirAtaque(movimiento);
    }
}
