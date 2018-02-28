package Odev1;

import java.util.Scanner;
public class SalesPerson1 {
    public static void main(String args[]) {
        int number=1;
        double gain;
        double salary;
        gain = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product item(1-4),enter -1 to exit:");
        System.out.println("Please enter  prodocut numbers:");

        do {
            number = input.nextInt();
            switch (number) {
                case 1:
                    gain += 239.99;
                    break;
                case 2:
                    gain += 129.75;
                    break;
                case 3:
                    gain += 99.95;
                    break;
                case 4:
                    gain += 350.89;
                    break;
               /* case -1:
                    break;*/

                default:
                    /*if(number==-1)
                        break;*/
                    System.out.println("You entered wrong number.");

            }
            //while döngüsünde -1 yazınca çıkacak.
        }while (number !=-1 );
        System.out.println("Sales amount:" + gain + "'dir.");
        salary = 200+ (gain * 9) / 100;
        System.out.println("Total income this week:" + salary + "TL'dir.");








    }
}