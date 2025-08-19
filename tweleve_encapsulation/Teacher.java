package tweleve_encapsulation;

public class Teacher {
    public static void main(String[] args) {
        NewStudent s = new NewStudent();
        //s.isAttended = true;
        //we have directly accessed the data and set data
        //in future we cannot perform any sort of validations or logics
        s.setAttended(true);
        s.getAttendance();
        
        //s.isAttended = false;
        //we can directly act on the data before encapsulation
        s.setAttended(false);
    }
}
