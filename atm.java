package ch3;

public class atm {

	public static void main(String[] args) {
		int choice = 2;
		System.out.println("welcome to atm");
		System.out.println("1.savings");
		System.out.println("2.to change pin");
		System.out.println("3.to widraw");
		System.out.println("4.to check balance");
		switch(choice) {
		case 1:System.out.println("you chose savings account");break;
		case 2:System.out.println("to change pin.please press change pin");break;
		case 3:System.out.println("to widraw cash.enter amount");break;
		case 4:System.out.println("to check balance.please press reciept");break;
		default :System.out.println("invalid choice");
		
		}
		
	    	
		

	}

}
