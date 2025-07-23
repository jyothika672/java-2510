package second_variables;

public class LMSVariables {
// Student-> ID,Name,Email,Password, Gender, Mobile Number
//define datatype
    public static void main(String[] args) {
        short studentID = 101;
        String studentName = "Jyo";
        String studentEmail = "katrujyo@gmail.com";
        String studentPassword = "pass@133";
        char studentGender_1 = 'F';
        boolean isStudentFemale = true;
        long studentMobileNumber = 900009888;

//String concatenation means joining multiple strings
        System.out.println("Student ID:" +studentID);
        System.out.println("Student Name:" +studentName);
        System.out.println("Student Email:" +studentEmail);
        System.out.println("Student Password:" +studentPassword);
        System.out.println("Student Gender_1:" +studentGender_1);
        System.out.println("Student Gender Female:" +isStudentFemale);
        System.out.println("Student MobileNumber:" +studentMobileNumber);
    }
}
