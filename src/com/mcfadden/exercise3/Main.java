package com.mcfadden.exercise3;
//Ean McFadden
//January 30, 2018
//Exercise 3
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	System.out.println("Enter a temperature in Fahrenheit.");
	float x = inputTemp();
	while (x >= -460){
	  float y = conversion(x);
	  output(y);
	  x = inputTemp();
    }
    System.out.println("You have entered a number that is below absolute zero.");
    }
    static float inputTemp(){
		Scanner input = new Scanner(System.in);
		float fahrenheitTemp = input.nextFloat();
		return fahrenheitTemp;
	}
	static float conversion(float x){
    	float celsiusTemp = (x - 32) * 5 / 9;
    	return celsiusTemp;
	}
	static void output(float y){
		System.out.println("The temperature in Celsius is " + y + ".");
		System.out.println("Enter a temperature in Fahrenheit.");
	}
}
