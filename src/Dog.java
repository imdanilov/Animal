public class Dog extends Animal{
    public String dogHome;

    public Dog(){
        super();
    }
    public void makeNoise (){
        System.out.println("Dog " + action);
    }
    public void eat() {
        action = "eat";
        food = "meat";
        location = "kennel";
        System.out.println("Dog " + action);
    }
}
