package third_type_conversions;

public class Demo {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 =num1; //type Conversion

        System.out.println("Original Value:" +num1);
        System.out.println("Converted Value:" +num2);
//Type casting
        double num3 = 3.14;
        int num4 = (int) num3;//Type mismatch: cannot convert from double to int
                            //you need to do the manual conversion
        System.out.println("Original Value:" +num3);
        System.out.println("Original Value:" +num4);
        //Incompatible conversions
        int zip = 500081;
       // String str_zip = (String)zip;//Cannot cast from int to String
       String str_zip = String.valueOf(zip);// String.valueOf is the key to do the process.
       System.out.println("Original Value:" +zip);
       System.out.println("Original Value:" +str_zip);
       System.out.println(str_zip+5);//it works but it will not add value ans will be 5000815  5 is add as a string we are passing in str that's why it is add as a string

       String str_zip_new = "500081";
       //String str_zip_new = "five lakhs eighty one";//lang.NumberFormatException it can't concat
       int zip_new = Integer.parseInt(str_zip_new);//Integer.parseInt  is the key to do the process.
       System.out.println("Original Value:" +str_zip_new);
       System.out.println("Original Value:" +zip_new);
       System.out.println(zip_new+5);
    }
}
