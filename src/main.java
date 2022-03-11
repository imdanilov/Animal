import java.util.ArrayList;

public class main{

    public static void main(String[] args){
        ArrayList<Animal> arrayAnimal = new ArrayList<>();
        Cat cat = new Cat();
        cat.eat();
        Dog dog = new Dog();
        dog.eat();
        Horse horse = new Horse();
        horse.eat();
        Animal animal = new Animal();
        animal.eat();
        arrayAnimal.add(cat);
        arrayAnimal.add(dog);
        arrayAnimal.add(horse);
        arrayAnimal.add(animal);
        Vet vet = new Vet();
        for (int i = 0; i < arrayAnimal.size(); i++){
            vet.treatAnimal(arrayAnimal.get(i));
        }
    }
}
