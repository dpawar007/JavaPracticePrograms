package allbasic;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class MaskCardNumber {

	public static void main(String[] args) {
		System.out.println("Welcome....!!!!!!"); 
		System.out.println("Enter the Number"); 
		Scanner sc = new Scanner(System.in);
		String number  = sc.nextLine();
		if (number.length()==8 && StringUtils.isNumeric(number)) {			     
	    StringBuilder sb  = new StringBuilder();
	    System.out.println("Mask Card Number = "+sb.append(number.substring(0,2)).append("XXXX").append(number.substring(6,8)));
		}else {
			System.out.println("You enter wrong number Could you please enter right number");
			System.out.println("Prorper number tak kelay.!!!!!!!");
		}
	    
	}

}
