import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FirePokemon Char = new FirePokemon("Charmander", "Fire", 500, 120000);
        GrassPokemon Bulb = new GrassPokemon("Bulbasaur", "Grass", 6, 2.5);

//        System.out.println("Kies een Pokemon: \n1. Bulbasaur \n2. Charmander");
//
//        int choice = sc.nextInt();
//
//        switch(choice) {
//            case 1:
//                Bulbasaur();
//                break;
//            case 2:
//                charmander();
//                break;
//            default:
//        }

        Char.printSound();
        Char.printInfo();
        Char.flamethrower();

        Bulb.printSound();
    }
}
