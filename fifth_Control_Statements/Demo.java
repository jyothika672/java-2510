package fifth_Control_Statements;

public class Demo {
    public static void main(String[] args) {
        //IF
        int num = 10;
        //check if the given num is positive
        if(num>0){
            System.out.println("The Number is Positive");
        }
        //IF ELSE
        //check if the given num is positive or negative
        if(num>0){
            System.out.println("The Number is Positive");
        }else{
            System.out.println("The Number is negative");
        }
        //vote Eligibility check
        int age=9;
        if(age>=18){
            System.out.println("You can vote");
        }else{
            System.out.println("You cannot vote");
        }
        //vote Eligibility check -->ternary operator 
        String msg = (age >= 18) ? "You can vote":"You cannot vote";
        System.out.println(msg);

        //else if ladder
        int avg_score =70;
        if(avg_score>90){
            System.out.println("A Grade");

        }else if(avg_score>=75){
            System.out.println("B Grade");
        }else if(avg_score>=60){
            System.out.println("C Grade");

        }else if(avg_score>=45){
            System.out.println("D Grade");
        }

        //switch
        int choice =2;
        switch(choice){
            case 1:
                System.out.println("A selected");
                break;
            case 2:
                System.out.println("B selected");
                break;
            case 3:
                System.out.println("C selected");
                break;
            case 4:
                System.out.println("D selected");
                break;
        }

        }
    }
