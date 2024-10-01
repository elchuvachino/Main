import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int counter1 = 7;
    public static int counter2 = 10;

    public static void main(String[] args) {
        printRooles(); // печатает правила
        Scanner sc = new Scanner(System.in);

        int playerChoice = sc.nextInt();

        if (playerChoice == 0) { // Если игрок выберет 0 или 1, вызовется один из методов
            System.out.println("You're playing on [0, 100] Difficulty with 7 tries");
            gameSection1();
        } else if (playerChoice == 1)
            System.out.println("You're playing on [0, 1000] Difficulty with 7 tries");
        gameSection2();
    }


    public static void printRooles() {
        System.out.println("Choose your level:");
        System.out.println("\t0 - [0, 100] + 7 tries");
        System.out.println("\t1 - [0, 1000] + 10 tries");
        System.out.println("\t2 - Exit");
    }

    public static void gameSection1() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int highGround = 100;
        int lowGround = 0;


        int num = rand.nextInt(lowGround, highGround);

        while (Main.counter1 >= 0) {
            int playerNum = sc.nextInt();
            if (playerNum == num) {
                youWon();
            } else if (playerNum > num) {
                numIsGreater();
                minusCounter1();
            } else if (playerNum < num) {
                numIsLess();
                minusCounter1();
            }
        }
        if (Main.counter1 == 0) {
            youLoosed();
        }


    }

    public static void gameSection2() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int highGround = 1000;
        int lowGround = 0;


        int num = rand.nextInt(lowGround, highGround);

        while (Main.counter2 >= 0) {
            int playerNum = sc.nextInt();
            if (playerNum == num) {
                youWon();
            } else if (playerNum > num) {
                numIsGreater();
                minusCounter2();
            } else if (playerNum < num) {
                numIsLess();
                minusCounter2();
            }
        }
        if (Main.counter2 == 0) {
            youLoosed();
        }


    }

    public static void youWon() {
        System.out.println("You Won!");
    }

    public static void minusCounter1() {
        System.out.println("You have " + Main.counter1-- + " tries left");
    }

    public static void minusCounter2() {
        System.out.println("You have " + Main.counter2-- + " tries left");
    }

    public static void numIsLess() {
        System.out.println("Number guessed is less!");
    }

    public static void numIsGreater() {
        System.out.println("Number quessed is greater!");
    }

    public static void youLoosed() {
        System.out.println("You Looser");
    }


}






