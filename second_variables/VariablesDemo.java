package second_variables;

public class VariablesDemo {
            //brand
            //descripation
            //rating
            //price
        // if we define variable in class we call them instance variables
    static int someData1;
    static double someData2;  //declartion
    static char someData3; 
    static boolean someData4;   
    short price = 350;
    String brand = "HIGHLANDER";
    float rating=4.2f;
    public static void main(String[] args) {
        //if we define variable in methods we call them as local variables
        int someDataNew1 = 10; //intilization
        //int someDataNew2; // declaration
        System.out.println(someDataNew1); 
        //System.out.println(someDataNew2);

        System.out.println(someData1);
        System.out.println(someData2);
        System.out.println(someData3);
        System.out.println(someData4);
    }
}
