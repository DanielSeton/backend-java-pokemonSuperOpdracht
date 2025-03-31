public class WaterPokemon extends Pokemon{
    private int depth;
    private int shellthickness;

    public WaterPokemon(String name, int depth, int shellthickness) {
        super(name, "Water");
        this.depth = depth;
        this.shellthickness = shellthickness;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getShellthickness() {
        return shellthickness;
    }

    public void setShellthickness(int shellthickness) {
        this.shellthickness = shellthickness;
    }

    @Override
    public String toString() {
        return(getName() + " can reach a depth of up to " + getDepth() + " meters! \nThis is largely due to its " + getShellthickness() + " centimeter thick shell.");
    }

    @Override
    void printPokemonSound() {
        System.out.println("Squirtle squirtle");
    }

    public void dive(){
        System.out.println(getName() + " dives " + getDepth() + " meter under water and rushed the opponent!");
    }
}
