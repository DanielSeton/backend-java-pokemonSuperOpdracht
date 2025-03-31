public class ElectricPokemon extends Pokemon {
    private int voltage;
    private int speed;

    public ElectricPokemon(String name, int voltage, int speed) {
        super(name, "Electric");
        this.voltage = voltage;
        this.speed = speed;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return(getName() + " can store up to " + getVoltage() + " volts of electricity in its body \nIt can reach a speed of up to " + getSpeed() + " meters per second!");
    }

    @Override
    void printPokemonSound() {
        System.out.println("Pika pika");
    }

    public void voltTackle(){
        System.out.println(getName() + " charges at the opponent with a blinding " + getSpeed() + " meters per second and crashes into them with a Volt Tackle!");
    }
}
