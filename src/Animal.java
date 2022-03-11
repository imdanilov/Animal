public class Animal {
    public String food;
    public String location;
    public String action;

    public Animal(){
        action = "doing nothing";
    }
    public void makeNoise() {
        System.out.println("Animal " + action);
    }
    public void eat(){
        action = "eat";
        food = "any";
        location = "any";
        System.out.println("Animal " + action);
    }
    public void sleep(){
        action = "sleep";
        System.out.println("Animal " + action);
    }
}

