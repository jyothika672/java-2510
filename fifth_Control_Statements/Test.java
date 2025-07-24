package fifth_Control_Statements;

public class Test {
    public static void main(String[] args) {
        //0 to 4 ->Toddler
        //5 to 12 ->Child
        //13 to 19->Teenager
        //20 to 26 ->young adult
        //27 above->Adult 

        //using else  if ladder
        int age=10;
        if(age>=4){
            System.out.println("Toddler");
        }else if(age>=5 && age<=12){
            System.out.println("Child");
        }else if(age>=13 && age<=19){
            System.out.println("Teenager");

        }else if(age>=20 && age<=26){
            System.out.println("Young Adult");
        }else {
            System.out.println("Adult");
        }

        //using swith case
        String category;
        switch (age) {
            case 0:
                System.out.println("Toddler");
                break;
            case 1:
                System.out.println("Child");
                break;
            default:
                break;
        }

        //swith case - fall through(old way till java)

        int day=4;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
            System.out.println("wednesday");
                break;
        
            default:
            System.out.println("Invalid day");
                break;
        }
        //swith case - using arrow operator(from java8 supports)
        String category_age = switch (age){
                case 0,1,2,3,4 -> "Toddler";
                case 5,6,7,8,9,10,11,12 -> "Child";
                case 13,14,15,16,17,18,19 ->"Teenager";
                case 20,21,22,23,24,25,26 ->"Young Adult";
                default -> "Adult";
        };
        System.out.println(category_age);


        //nested condition check
        //->check if user can enter a club age is 21 or above
        // should also have a valid ID
        int age_verify = 22;
        boolean id = true;
        if(age_verify>=21){
            if(id == true){
                System.out.println("Can Enter");
            }else{
                System.out.println("Canont Enter Without ID");
            }
        }else{
            System.out.println("Cannot Enter you are too young");
        }
        }
    }

