package Week1day3;

import java.util.Scanner;



public class Phoneid {
	

	public static void main(String[] args) {
		System.out.println("enter the digital number:");
		Scanner ipp=new Scanner(System.in);
		int digitalNumber=ipp.nextInt();
		
		if(digitalNumber==944) {
			System.out.println("mobile service provider is BSNL");
			
		}else if(digitalNumber==900) {
			System.out.println("mobile service provider is Airtel");
			
		}else if(digitalNumber==897) {
			System.out.println("mobile service provider is Idea");
			
		}else if(digitalNumber==630) {
			System.out.println("mobile service provider is Jio");
			
		}else {
			System.out.println("mobile service provider is not equal to your choice ");
		}
		
		
	}}