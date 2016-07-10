package com.calc;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class OldConsoleCalc {
	public static StringBuilder userEquation = new StringBuilder("");


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to enter the equation in total? Otherwise its piece by piece?(Y/N) ");
        char userAbfrage = input.next().charAt(0);
        if (userAbfrage == 'Y' || userAbfrage == 'y' ) {
            System.out.println("Entering in total!");
            enterTotalEquation();
        } 
        System.out.println("Entering piece by piece!");
        enterEquationPieceByPiece();

    }
    
    //let the User enter the equation in total
    public static void enterTotalEquation() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your equation. Be careful to use the right form! ");
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String userEquation = input.nextLine();
        try {
            System.out.println(userEquation + " = " +engine.eval(userEquation));
        } catch (ScriptException e) {
            System.out.println("Fehler in der Gleichung!");
            enterTotalEquation();
            //e.printStackTrace();
        }
        System.out.print("Want to calculate another equation like this? (Y/N) ");
        char userInput = input.next().charAt(0); 
        if (userInput == 'Y' || userInput == 'y') {
            enterTotalEquation();
        } else {
            System.out.println("Hope to see you again!");
            return;
        }
    }
    
    //let the user enter the equation piece by piece
    //use Stringbuilder?
    //TODO: uebergabe in string und erweiterung, abfrage bei = auswerten
    public static void enterEquationPieceByPiece() {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a piece of your equation: ");
        try {
            //nextInt will throw InputMismatchException
            //if the next token does not match the Integer
            //regular expression, or is out of range
            double userInput = input.nextDouble();
            userEquation.append(Double.toString(userInput));
            enterEquationPieceByPiece();
        } catch(InputMismatchException exception) {
            //Print "This is not an integer"
            //when user put other than integer
            char userInput = input.next().charAt(0);
            
            
            if ((userInput == '*') || (userInput == '/') || (userInput == '+') || (userInput == '-') || (userInput == '(') || (userInput == ')')){
                userEquation.append(Character.toString(userInput));
                enterEquationPieceByPiece();
                
            } else if (userInput == '=') {
                ScriptEngineManager mgr = new ScriptEngineManager();
                ScriptEngine engine = mgr.getEngineByName("JavaScript");
                //System.out.println(userEquation);
                try {
                    System.out.println(userEquation + " = " + engine.eval(userEquation.toString()));
                    System.out.print("Want to calculate another equation like this? (Y/N) ");
                    userInput = input.next().charAt(0); 
                    if (userInput == 'Y' || userInput == 'y') {
                        enterEquationPieceByPiece();
                    } else {
                        System.out.println("Hope to see you again!");
                        return;
                    }
                } catch (ScriptException e) {
                    System.out.println("Fehler in der Gleichung!");
                    //enterTotalEquation();
                    //e.printStackTrace();
                }
            } else {
            System.out.println("You entered neither a number nor a implemented logical operator.");
            enterEquationPieceByPiece();
            }


        }        
    }
}
