public class GrassPokemon extends Pokemon {
    private int sunhour;
    private double water;

    public GrassPokemon(String name, String type, int sunhour, double water) {
        super(name, type);
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
}
