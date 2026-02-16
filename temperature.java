// this code is to learn how to take input from user in java
// and how to conver value of one variable to another455
import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		        Scanner sc = new Scanner(System.in);
		        double fahrenheit = sc.nextDouble();   
		        double celsius = (fahrenheit - 32) * 5 / 9;
		        sc.close();		     
		        System.out.println(celsius);
	}

}
