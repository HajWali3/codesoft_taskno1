import java.util.Random;
import java.util.Scanner;

class Game {
    public int score;
    public int guesses;

    public static int generateRandomNum() {
        Random rndmNum = new Random();
        return rndmNum.nextInt(100) + 1;
    }

    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your guess number: ");
        int guessNum = getValidatedInput(sc, 1, 100);
        return guessNum;
    }

    public static boolean compare(int randomNum, int guessNum) {
        if (guessNum > randomNum) {
            System.out.println("\nToo high");
            return false;
        }

        else if (guessNum < randomNum) {
            System.out.println("\nToo low");
            return false;
        } else {
            System.out.println("\nCORRECT! You have guessed the right answer.");
            return true;
        }
    }

    public static boolean match(int randomNum) {
        if (compare(randomNum, getUserInput())) {
            return true;
        } else
            return false;
    }

    public boolean singleRound() {
        int randomNum = generateRandomNum();
        int i = 0;
        int ttlGuess = 6;
        while (i < ttlGuess) {
            this.guesses++;
            if (match(randomNum)) {
                if (i == 4)
                    this.score = 20;
                else if (i == 3)
                    this.score = 30;
                else if (i == 2)
                    this.score = 40;
                else if (i == 1)
                    this.score = 50;
                else
                    this.score = 10;
                return true;
            }
            i++;
            System.out.println((ttlGuess - i) + " Guesses Left");
        }
        if (i >= 5)
            System.out.println("Better Luck Next Time\n");
        return false;
    }

    public static int getValidatedInput(Scanner sc, int min, int max){
        while (true) {
            if (sc.hasNextInt()) {
                int choose = sc.nextInt();
                if (choose >= min && choose <= max) {
                    return choose;
                } else {
                    System.out.println("Enter option in between " + min + " and " + max);
                }
            } else {
                sc.next();
                System.out.println("Enter a valid number");
            }
        }
    } 
}

public class Task1{
    public static void main(String[] arg) {
        Game round1 = new Game();
        Game round2 = new Game();

        Scanner sc = new Scanner(System.in);
        int round = 0;

        System.out.println(
                "Select the number to choose the category \n 1. Play a single match \n 2. Play round of matches ");
        int choose = Game.getValidatedInput(sc, 1, 2);
        switch (choose) {
            case 1: {
                if (round1.singleRound())
                    ;
                round++;
                System.out.println("\nNumber of Guesses " + round1.guesses + " \nYour Score is " + round1.score);
            }
                break;
            case 2: {
                {
                    System.out.println("Enter number of rounds you want to play: ");
                    int rounds = Game.getValidatedInput(sc, 1, 20);
                    System.out.println("\nYou are playing " + rounds
                            + " rounds of matches. Loosing a single match will through you out of the tournament\n");
                    int i = 0;
                    while (i < rounds) {
                        System.out.println("Round " + (i + 1) + " out of " + rounds);
                        if (round2.singleRound()) {
                            System.out.println(
                                    "Number of guesses: " + round2.guesses + " \nScore: " + round2.score + "\n");
                            if (i + 1 == rounds)
                                System.out.println("wuhuu!! Congratulations you have won all the rounds");
                        } else
                            break;
                        i++;
                    }
                }
            }
                break;

            default:
                System.out.println("Invalid option Choose between 1 - 3 ");
                break;
        }
        sc.close();
    }
}