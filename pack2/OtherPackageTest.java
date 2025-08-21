package pack2;

import pack.Person;

public class OtherPackageTest {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Different package - non subclass");
        System.out.println(p.publicName); 
        // We canont access anything expect public if it's on a
        //Different
        //System.out.println(p.protectedName); 
        //System.out.println(p.defaultName);
        //System.out.println(p.privateName); 
    }
}
