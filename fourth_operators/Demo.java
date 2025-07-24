package fourth_operators;

public class Demo {
    public static void main(String[] args) {
    //Arithmetic Operators

        //Addition operators
        int num1 = 10;
        int num2 = 6;
        int sum = num1+num2;
        System.out.println("Sum:" +sum);

        //Subtraction operators
        int diff = num1 - num2;
        System.out.println("Difference:"+diff);
        System.out.println("Product:"+(num1*num2));
        System.out.println("Division:"+(num1/num2));
        System.out.println("Modulus:"+(num1%num2));

        //Increment/ Decrement operators ++ --

        int a = 10;
        System.out.println("A: "+a);
        System.out.println("++A: "+ ++a);//Pre increment
        System.out.println("A++: "+ a++);//post increment
        System.out.println("A: "+a);

        System.out.println("++A: "+ --a);//Pre Decrement
        System.out.println("A++: "+ a--);//post Decrement
        System.out.println("A: " +a);

        //compound assignment operators
        int num = 10;
        num += 5;
        System.out.println("Number is:"+num);

        //Relational operators
        int x=10;
        int y=5;
        System.out.println("X is greater than Y:" +(x>y));
        System.out.println("X is eq ual to Y:" +(x==y));

        //Logical Operators
        int l=7;
        int m=5;
        int n=3;
        int o=7;

        boolean resultAND = l > m && n > o; //T && F -> T
        System.out.println(resultAND);

        boolean resultOR = l > m || n > o; //T && F -> T
        System.out.println(resultOR);

        //Bitwise Operators
        int valuea =5; //0000000000000101
        int valueb =3; //0000000000000011
        int resultand = valuea & valueb;//0000000000000001-->1
        System.out.println(resultand);

        int resultor = valuea | valueb; //0000000000000111-->7
        System.out.println(resultor);

        int resultxor = valuea ^ valueb;//0000000000000110-->6
        System.out.println(resultxor);

        int result = ~valueb; //0000000000000011-->1111111111111100
        System.out.println(result);


            //Left shift
            //int valueb = 3; //0000000000000011
        System.out.println(valueb<<2);//0000000000001100-->12
        System.out.println(valueb<<1);//0000000000000110-->6
        System.out.println(valueb<<3);//0000000000011000-->24
        //right shift
        //int valueb = 3; //0000000000000011
        System.out.println(valueb>>2);//0000000000000000-->0

    }
}
