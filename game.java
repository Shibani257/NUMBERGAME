import java.util.Scanner;
import java.util.Random;

public class game {
    public static void numbergame() {
        int trial = 5;
        int i;
        Random rand = new Random();
        int randomno = rand.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess what's the number it is....(Between 0 to 100)");
        for (i = 0; i < 5; i++) {

            int num = sc.nextInt();
            if (num == randomno) {
                System.out.println("***BRILLIANT***" + "\n" + "You Guessed The Correct Number");
                break;
            } else if (num > randomno) {
                System.out.println("OPS!!" + "You guess a greater no" + "\n" + "TRY AGAIN...." + "\n"
                        + "Enter another number");
            } else if (num < randomno) {
                System.out.println("OPS!!" + "You guess a lesser no" + "\n" + "TRY AGAIN...." + "\n"
                        + "Enter another number");
            }

        }
        if (i == trial) {
            System.out.println("---GAME OVER---" + "\n" + "The number was " + randomno);
        }
    }

    public static void main(String arg[]) {
        numbergame();
    }
}