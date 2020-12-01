package com.company;
import java.util.Random;
import java.util.Scanner;

class Game {
    private int rd_no;
    private int input;


    public Game() {
        Random guess = new Random();
        rd_no = guess.nextInt(100);
    }

    public int takeUserInput() {
        Scanner temp = new Scanner(System.in);
        input = temp.nextInt();
        return input;
    }


    public void isCorrectNumber(int attempt) {
        int temp = 0;
        for (int i = 0; i < attempt; i++) {
            System.out.println("Enter your " + (i+1) + " try....");
            temp = takeUserInput();
            if (temp > rd_no) {
                System.out.println("Your number is greater!!!\n");
            } else if (temp < rd_no) {
                System.out.println("Your number is lesser!!\n");
            } else if (temp == rd_no) {
                System.out.println("You won the game in " + (i+1) + " attempts!!!\n");
                break;
            }

        }
        System.out.println("The correct answer is " + rd_no);

    }
}

public class Ex3_Guess_the_number {
    public static void main(String[] args) {
        Scanner per = new Scanner(System.in);
        System.out.println("To play game Enter the number of attempts you want to have : ");
        int answer = per.nextInt();
        Game play = new Game();
        play.isCorrectNumber(answer);

    }

}
