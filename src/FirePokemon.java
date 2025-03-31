public class FirePokemon extends Pokemon {
    private int flameheat;
    private int experience;

    public FirePokemon(String name, int flameheat, int experience) {
        super(name, "Fire");
        this.flameheat = flameheat;
        this.experience = experience;
    }

    public int getFlameheat() {
        return flameheat;
    }

    public void setFlameheat(int flameheat) {
        this.flameheat = flameheat;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return("The heat of its flame is: " + getFlameheat() + " Celsius \nExperience needed to reach level 50: " + getExperience());
    }

    @Override
    void printPokemonSound() {
        System.out.println("Char!");
    }

    public void flamethrower(){
        System.out.println(getName() + " attacked with a flamethrower! \nThe heat of the attack was " + getFlameheat() + " Celsius!");
    }
}
