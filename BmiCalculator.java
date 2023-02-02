package programs;

import java.util.Scanner;

public class BmiCalculator {

	public static void main(String[] args)

	{

		Scanner obj1 = new Scanner(System.in);
		System.out.print("Enter your age ");
		int age = obj1.nextInt();

		Scanner sc = new Scanner(System.in);
		System.out.print("Input weight in kilogram: ");
		double weight = sc.nextDouble();
		System.out.print("Input height in meters: ");
		double height = sc.nextDouble();

		double BMI = weight / (height * height);
		System.out.println("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2\n");

		if (BMI < 18.5) {
			System.out.println("Your BMI is : " + BMI + " kg/m2" + " | Classification :" + " Under weight");
		}

		else if (BMI <= 18.5 || BMI <= 24.9) {
			System.out.println("Your BMI is : " + BMI + " kg/m2" + " | Classification :" + " Normal");
		}

		else if (BMI <= 25 || BMI <= 29.9) {
			System.out.println("Your BMI is : " + BMI + " kg/m2" + " | Classification :" + " Over weight");
		}

		else if (BMI <= 30 || BMI <= 34.9) {
			System.out.println("Your BMI is : " + BMI + " kg/m2" + " | Classification :" + " Obesity (Class 1)");
		} else if (BMI <= 35 || BMI <= 39.9) {
			System.out.println("Your BMI is : " + BMI + " kg/m2" + " | Classification :" + " Obesity (Class 2)");
		}

		else if (BMI > 40) {
			System.out.println("Your BMI is : " + BMI + " kg/m2" + " | Classification :" + " Extreme Obesity");
		}

	}
//=====================================================================================================================
	// Here is the Optimized way of doing the same code #Method 2
	/*
	 * import java.util.Scanner;
	 * 
	 * public class BmiCalculator {
	 * 
	 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
	 * System.out.print("Input weight in kilograms: "); double weight =
	 * sc.nextDouble(); System.out.print("Input height in meters: "); double height
	 * = sc.nextDouble(); double BMI = weight / (height * height);
	 * System.out.println("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");
	 * 
	 * String classification; if (BMI < 18.5) { classification = "Under weight"; }
	 * else if (BMI <= 24.9) { classification = "Normal"; } else if (BMI <= 29.9) {
	 * classification = "Over weight"; } else if (BMI <= 34.9) { classification =
	 * "Obesity (Class 1)"; } else if (BMI <= 39.9) { classification =
	 * "Obesity (Class 2)"; } else { classification = "Extreme Obesity"; }
	 * System.out.println("Your BMI is: " + BMI + " kg/m2 | Classification: " +
	 * classification); } }
	 */

}
