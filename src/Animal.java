public class Animal {
    public String food;
    public String location;
    public String action;

    public Animal(String food, String location){
        this.food = food;
        this.location = location;
        action = "doing nothing";
    }

    public void makeNoise(){
        System.out.println("Animal " + action);
    }

    public void eat(){
        action = "eat";
        System.out.println("Animal " + action);
    }
    public void sleep(){
        action = "sleep";
        System.out.println("Animal " + action);
    }
}

