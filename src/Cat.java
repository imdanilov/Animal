public class Cat extends Animal {
    public String catHome;

    public Cat() {
        super();
    }
    public void makeNoise (){
        System.out.println("Cat " + action);
    }
    public void eat() {
        action = "eat";
        food = "meat";
        location = "in the house";
        System.out.println("Cat " + action);
    }
}
