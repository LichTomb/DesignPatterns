package behavioral.singleton;

/**
 *
 * Created by user on 2015/8/20.
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        // ....
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);

        if(singleton1 == singleton2)
        {
            System.out.println("singleton1 & singleton2 point to the same memory location!");
        }
        else
        {
            System.out.println("singleton1 & singleton2 are different object!");
        }


    }

}