package eleven_Inheritance;

public class Person {

    //common attributes of any person
    //as of now it's student and trainer
    //but in future it can be Mentor ,VideoAdmin etc
    int personID;
    String personName;
    int personAge;
    long personMobileNumber;
    

    //constructors fir intialization

    public Person(){}

    public Person(int personID, String personName, int personAge, long personMobileNumber){
        this.personID = personID;
        this.personName = personName;
        this.personAge = personAge;
        this.personMobileNumber =  personMobileNumber;
    }

    //common methods for any person ,like displaying info
    public void displayInfo(){
        System.out.println("ID: "+personID);
        System.out.println("Name: "+personName);
        System.out.println("Age: "+personAge);
        System.out.println("MobileNumber: "+personMobileNumber);
    }
}
