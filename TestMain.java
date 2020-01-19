package eggs;

import java.util.Scanner;

public class TestMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Welcome!!!");
		System.out.println("How eggs you want boil?");
		
		while(NumEggs.getNumeggs()==5) {
			System.out.println("Use " + Cooker.pots[0] + "!");
			break;		
		}
		while(NumEggs.getNumeggs()<=10) {
			System.out.println("Use " + Cooker.pots[1] + "!");
			break;		
		}
		while(NumEggs.getNumeggs()>10) {
			System.out.println("Use " + Cooker.pots[2] + "!");
			break;		
		}
		
		System.out.println("Put water to cover eggs and set pot on fire!");
		System.out.println("What type of eggs you want?");
		
		int arr=0;
		
		for( arr=0;arr < TypeOfEggs.getEgtype().length; arr++) {
			
			System.out.println((arr + 1) + ". " + TypeOfEggs.getEgtype()[arr]);
			
		}
		
		arr = sc.nextInt();
		
		if (arr==1) {
			
			System.out.println("When water start boil set 3 minutes");
			
		}else if (arr==2) {
			
			System.out.println("When water start boil set 5 minutes");
			
		}else if(arr==3) {
			
			System.out.println("When water start boil stop boiling after 5 minutes");
			
		}else {
			
			System.out.println("Error!!!Choose one of 1-3");			
			System.exit(0);
			
		}
		
		System.out.println("Put cold water in eggs for easy peeling");
		System.out.println("Thanks :D :P");
							
	}					
}
