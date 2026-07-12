package ch3;

public class pass_fail {

	public static void main(String[] args) {
		int mark1=30;
		int mark2=80;
		String sub_1="eng";
		String sub_2="tamil";
		if(mark1>=30&&mark2>=80)
		{
			if(sub_1.equals("eng")||sub_2.equals("tamil"))
			{
		
			System.out.println("pass");
		}
	 else 
	 {
		System.out.println("fail");

	}
	}
		else {
			System.out.println("fail");
		}
	}
}
