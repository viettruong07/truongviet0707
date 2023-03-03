package Session10;

public class SingletonExample {
    private static SingletonExample singletonExample = null;
    private SingletonExample(){
    }
    public static SingletonExample getInstance(){
        if (singletonExample == null){
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }
    public void display(){
        System.out.println("Welcome to Singleton Design Pattern");
    }
}
