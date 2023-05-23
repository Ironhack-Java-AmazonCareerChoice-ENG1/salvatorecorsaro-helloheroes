import java.util.Objects;

public class SuperHero {
    protected String name;
    private String power;
    private String origin;

    private static int counter = 0;

    public void introduce(){
        System.out.println("Hello, I'm " + name +
                " my power is " + power + " and I came from " + origin);
    }

    public void train(SuperHero friend){
        System.out.println(name + " is training with " + friend.getName());
    }

    public static void printCounter(){
        System.out.println("Number of heroes in the world: " + counter);
    }


    public SuperHero(String name, String power, String origin) {
        this.name = name;
        this.power = power;
        this.origin = origin;
        counter++;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "name='" + name + '\'' +
                ", power='" + power + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperHero superHero = (SuperHero) o;
        return Objects.equals(name, superHero.name) && Objects.equals(origin, superHero.origin);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
