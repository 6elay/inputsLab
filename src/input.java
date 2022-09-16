import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
//variables




        String bit, integer;


        System.out.print("How many bits are in an integer ");
        int intOne = keyboard.nextInt();

        System.out.print("What is the max an integer can go to?");
        int intTwo = keyboard.nextInt();

        System.out.print("How many bits are in an float ");
        float fl0atone = keyboard.nextFloat();

        System.out.print("What are floats digits of accuracy ?");
        float floatTw0 = keyboard.nextFloat();

        System.out.print("How many bits are in an double ");
        double d0uble0ne  = keyboard.nextDouble();

        System.out.print("What are double digits of accuracy ?");
        double doubleTw0  = keyboard.nextDouble();

        System.out.print("How many bits are in an short ");
        short sh0rtone  = keyboard.nextShort();

        System.out.print("What is the max an short can go to?");
        short shortTw0  = keyboard.nextShort();

        System.out.print(" What does a string do? ");
        String function  = keyboard.nextLine();

        System.out.println();

        System.out.print("Do strings print words and phrases");
        String answer  = keyboard.next();


        //add in input for all variables

        System.out.println();
        System.out.println("integers = " + intOne + "bits" );
        System.out.println("max for integers = " + intTwo );

        System.out.println();

        System.out.println("float = " + fl0atone + "bits" );
        System.out.println("max for float = " + floatTw0 );

        System.out.println();

        System.out.println("double = " + d0uble0ne + "bits" );
        System.out.println("max for double = " + doubleTw0 );

        System.out.println();

        System.out.println("short = " + sh0rtone + "bits" );
        System.out.println("max for short = " + shortTw0 );

        System.out.println();

        System.out.println("A string =" + function );
        System.out.println( answer );









        //add output for all variables
    }
}