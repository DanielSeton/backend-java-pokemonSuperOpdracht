public class FirePokemon extends Pokemon {
    private int flameheat;
    private int experience;

    public FirePokemon(String name, String type, int flameheat, int experience) {
        super(name, type);
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

    public void printInfo() {
        System.out.println("The heat of its flame is: " + getFlameheat() + " Celsius");
        System.out.println("Experience needed to reach level 50: " + getExperience());
    }

    public void flamethrower(){
        System.out.println(getName() + " attacked with a flamethrower! \n The heat of the attack was " + getFlameheat() + " Celsius!");
    }
}
