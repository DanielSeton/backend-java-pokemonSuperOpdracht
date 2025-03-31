import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FirePokemon Char = new FirePokemon("Charmander",  500, 120000);
        GrassPokemon Bulb = new GrassPokemon("Bulbasaur", 6, 2.5);
        WaterPokemon Squirt = new WaterPokemon("Squirtle", 50, 65);
        ElectricPokemon Pika = new ElectricPokemon("Pikachu", 120, 65);


        Char.printInfo();
        System.out.println(Char);
        Char.flamethrower();
        Char.printPokemonSound();

        System.out.println(" ");

        Bulb.printInfo();
        System.out.println(Bulb);
        Bulb.solarbeam();
        Bulb.printPokemonSound();

        System.out.println(" ");

        Squirt.printInfo();
        System.out.println(Squirt);
        Squirt.dive();
        Squirt.printPokemonSound();

        System.out.println(" ");

        Pika.printInfo();
        System.out.println(Pika);
        Pika.voltTackle();
        Pika.printPokemonSound();
    }
}
