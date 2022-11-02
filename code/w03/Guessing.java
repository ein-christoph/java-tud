package code.w03;

import java.util.Scanner;

public class Guessing{
    public static void main(String[] args){
        int min = 5;
        int max = 10;
        int random = (int) ((Math.random() * (max - min)) + min );
        
        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        while(run){

            System.out.println("Guess a number between " + min + " and "+max);
            int userInput = scanner.nextInt();
            
            if(userInput > random){
                System.out.println("To large!");
            }else if(userInput < random){
                System.out.println("To small!");
            }else{
                System.out.println("correct!");
                run = false;
            }
        }

        scanner.close();
    }
}