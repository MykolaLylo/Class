package Animal;

public class Animal {
    private String name;
    private int age;
    private int speed;

    public Animal ( String name, int age, int speed){
        this.name = name;
        this.age = age;
        this.speed = speed;

    }
    public Animal () {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Animal:" +
                "name='" + name + '\'' +
                ", age=" + age +
                "years , speed=" + speed +
                "km/h";
    }
}
