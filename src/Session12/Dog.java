package Session12;

public class Dog extends Animal{
    @Override
    public void greeting(){
        System.out.println("Woof!");
    }
    public void greeting(Dog Another){
        System.out.println("Woooooooof!");
    }
}
