package Animal;

public class Main {
    public static void main ( String [] args){
        Animal animal = new Animal("Dog",10,15);

        System.out.println(animal.toString());

        animal.setName("Kat");
        animal.setAge(12);
        animal.setSpeed(10);

        System.out.println (animal.toString());




    }
}
