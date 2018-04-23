import java.util.Scanner;
import java.lang.Math;

class Guess {
    public static void main(String [] args){
        int myNumber = (int) (Math.random() * 11);
        int n;
        int guessNum = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("I'm thinking of an integer in the range 1 to 10. You have three guesses.");
        System.out.print("Enter your first guess: ");
        n = sc.nextInt();
        guessNum = guessNum + 1;

        while (n != myNumber){
            if (guessNum == 2){
                if (n > myNumber){
                    System.out.println("Your guess is too high.");
                    Scanner nc = new Scanner(System.in);
                    System.out.print("Enter your second guess: ");
                    n = nc.nextInt();
                    guessNum = guessNum + 1;
                } else if (n < myNumber){
                    System.out.println("Your guess is too low.");
                    Scanner nc = new Scanner(System.in);
                    System.out.print("Enter your second guess: ");
                    n = nc.nextInt();
                    guessNum = guessNum + 1;
                }
            } else if (guessNum == 3){
                if (n > myNumber){
                    System.out.println("Your guess is too high.");
                    Scanner lc = new Scanner(System.in);
                    System.out.print("Enter your third guess: ");
                    n = lc.nextInt();
                    guessNum = guessNum + 1;
                } else if (n < myNumber){
                    System.out.println("Your guess is too low.");
                    Scanner lc = new Scanner(System.in);
                    System.out.print("Enter your third guess: ");
                    n = lc.nextInt();
                    guessNum = guessNum + 1;
                }
            } else if (guessNum == 4) {
                if (n > myNumber){
                    System.out.println("Your guess is too high.");
                    System.out.print("You lose. The number was " +myNumber+ ".");
                    break;
                } else if (n < myNumber){
                    System.out.println("Your guess is too low.");
                    System.out.print("You lose. The number was " +myNumber+ ".");
                    break;
                }
            }
        }

        if (n == myNumber){
            System.out.println("You win!");
        }
    }
}
