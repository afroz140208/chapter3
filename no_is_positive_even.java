package ch3;

public class no_is_positive_even {

	public static void main(String[] args) {
		int number=40;
		String odd_or_even= "even";
		if(number%2==0){
		     if(odd_or_even.equals("even")){
		    	 System.out.println("it is positive");
		     }else {
		    	 System.out.println("it is not positive");
		     }
		} else {
			System.out.println("it is even");
		}
	

	}

}
