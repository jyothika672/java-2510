package seven_Constructors;

public class Constructor {
    //it's a method
    public void doSomething(){
        System.out.println("Doing Some Task");
    }
    //explicit constructor
    public Constructor(){
        System.out.println("Explicit constructor called");
    }

    public static void main(String[] args) {
        //Create constructor->implicit constructor will be create
        Constructor obj =new Constructor();
        System.out.println("Implicit constructor called");
    }
}
