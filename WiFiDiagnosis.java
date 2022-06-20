package project;

import java.util.Scanner;

public class WiFiDiagnosis {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
		
		//Step 1
		System.out.println("First step: reboot your computer" + "\n" + "Are you able to connect with the internet? (yes or no)");
		String answer = scan.nextLine();
		
		
		if(answer.equals("yes")) {

			System.out.println("Done");		
			
		} else if(answer.equals("no")){
		
			//step 2
			System.out.println("Second step: reboot your router" + "\n" + "Now are you able to connect with the internet? (yes or no)");
			answer = scan.nextLine();
			
			if(answer.equals("yes")) {

				System.out.println("Done");		
				
			} else if(answer.equals("no")){
				
				//step 3
				System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power" + "\n" + "Now are you able to connect with the internet? (yes or no)");
				answer = scan.nextLine();
				
				if(answer.equals("yes")) {

					System.out.println("Done");		
					
				} else if(answer.equals("no")){
					
					//step 4
					System.out.println("Fourth step: move your computer closer to your router" + "\n" + "Now are you able to connect with the internet? (yes or no)");
					answer = scan.nextLine();
					
					if(answer.equals("yes")) {

						System.out.println("Done");		
						
					} else if(answer.equals("no")){
						System.out.println("Contact your ISP");
					}
				}
			}
		}
		scan.close();
	}
}
