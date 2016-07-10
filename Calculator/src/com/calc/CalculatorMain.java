package com.calc;
import java.util.Scanner;
import java.util.InputMismatchException; 
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;



public class CalculatorMain {
	public static StringBuilder userEquation = new StringBuilder("");

	
    public static void main(String[] args) {
        System.out.print("BLA BLA BLA");
    }

    public static String numOne() {
    	double one = 1.0;
    	userEquation.append(Double.toString(one));
    	return Double.toString(one);
    }
    
    public static String numTwo() {
    	double two = 2.0;
    	userEquation.append(Double.toString(two));
    	return Double.toString(two);
    }
    
    public static String numThree() {
    	double three = 3.0;
    	userEquation.append(Double.toString(three));
    	return (Double.toString(three));
    }
    
    public static String numFour() {
    	double four = 4.0;
    	userEquation.append(Double.toString(four));
    	return (Double.toString(four));
    }
    
    public static String numFive() {
    	double five = 5.0;
    	userEquation.append(Double.toString(five));
    	return (Double.toString(five));
    }
    
    public static String numSix() {
    	double six = 6.0;
    	userEquation.append(Double.toString(six));
    	return (Double.toString(six));
    }
       
    public static String numSeven() {
    	double seven = 7.0;
    	userEquation.append(Double.toString(seven));
    	return (Double.toString(seven));
    }
    
    public static String numEigth() {
    	double eigth = 8.0;
    	userEquation.append(Double.toString(eigth));
    	return (Double.toString(eigth));
    }
    
    public static String numNine() {
    	double nine = 9.0;
    	userEquation.append(Double.toString(nine));
    	return (Double.toString(nine));
    }
    
    public static String numZero() {
    	double zero = 0.0;
    	userEquation.append(Double.toString(zero));
    	return (Double.toString(zero));
    }
    
    public static String operatorPlus(){
    	char plus = '+';
    	userEquation.append(Character.toString(plus));
    	return (Character.toString(plus));
    }

    public static String operatorMinus(){
    	char minus = '-';
    	userEquation.append(Character.toString(minus));
    	return (Character.toString(minus));
    }
    
    public static String operatorDivide(){
    	char divide = '/';
    	userEquation.append(Character.toString(divide));
    	return (Character.toString(divide));
    }
    
    public static String operatorMultiply(){
    	char multiply = '*';
    	userEquation.append(Character.toString(multiply));
    	return (Character.toString(multiply));
    }
    
    public static String bracketLeft() {
    	char bracketLeft = '(';
    	userEquation.append(Character.toString(bracketLeft));
    	return (Character.toString(bracketLeft));
    }
    
    public static String bracketRight() {
    	char bracketRight = ')';
    	userEquation.append(Character.toString(bracketRight));
    	return (Character.toString(bracketRight));
    }
    
    public static String operatorResult() {
    	String solution = "";
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
    	try {
        System.out.println(userEquation + " = " + engine.eval(userEquation.toString()));
        solution = engine.eval(userEquation.toString()).toString();
    	} catch (ScriptException e) {
            System.out.println("Fehler in der Gleichung!");
            e.printStackTrace();
    	}
    	return solution;
    }
}