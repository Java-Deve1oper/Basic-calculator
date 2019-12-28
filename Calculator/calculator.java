import java.util.Scanner;

public class calculator{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1.  Addition ");
        System.out.println("2.  Subtraction ");
        System.out.println("3.  Multiplication ");
        System.out.println("4.  Division ");

        byte input = sc.nextByte();

        System.out.println("Enter First value");

        byte input1 = sc.nextByte();

        System.out.println("Enter Second value");

        byte input2 = sc.nextByte();

        Claculation c = new  Claculation(input, input1, input2);

    }

}