package eleven_Inheritance;

public class Dog extends Animal {
    String animal = "Dog";

    public void display(){
        System.out.println("Dog Displayed");
    }
    //call super animal
    public void show(){
        super.display();//super class
        display();//same class
        System.out.println("Show Current class Animal: "+animal);
        System.out.println("Show super class Animla: "+super.animal);
    }
}
