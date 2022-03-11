public class Horse extends Animal {
    public String horseHome;

    public Horse() {
        super();
    }
    public void makeNoise (){
        System.out.println("Horse " + action);
    }
    public void eat() {
        action = "eat";
        food = "hay";
        location = "stable";
        System.out.println("Horse " + action);
    }
}
