import java.sql.SQLOutput;

public class GrassPokemon extends Pokemon {
    private int sunhour;
    private double water;

    public GrassPokemon(String name, int sunhour, double water) {
        super(name, "Grass");
        this.sunhour = sunhour;
        this.water = water;
    }

    public int getSunlight() {
        return sunhour;
    }

    public void setSunlight(int sunlight) {
        this.sunhour = sunlight;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    @Override
    public String toString() {
        return(getName() + " needs " + getSunlight() + " hours of sunlight a day \nand " + getWater() + " liter water to stay healthy.");
    }

    @Override
    void printPokemonSound() {
        System.out.println("Bulba Bulbasaur!");
    }

    public void solarbeam(){
        System.out.println(getName() + " charged up a powerful solarbeam!");
    }
}
