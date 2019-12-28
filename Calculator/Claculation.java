
/**
 * Claculation
 */

import java.lang.ArithmeticException;

public class Claculation {

    Claculation(byte input, byte input1, byte input2) {
        float answer = 0;
        switch (input) {
        case 1:

            answer = input1 + input2;

            System.out.println("Addition is : " + answer);

            break;
        case 2:

            answer = input1 - input2;

            System.out.println("Subtraction is : " + answer);

            break;
        case 3:

            answer = input1 * input2;

            System.out.println("Multiplication is : " + answer);

            break;

        case 4:

            try {

                answer = input1 / input2;

                System.out.println("Division is : " + answer);

            } catch (ArithmeticException e) {


                System.out.println("  divide by 0   is not  possible ");


            }

            break;

        default:

            System.out.println(" Error 404 : Something  Wrong ");
            break;
        }

    }
}
