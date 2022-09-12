package week1.day1;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num =28;
		int count =0;
		
		if (num >1) {
			for(int i=1;i<=num;i++) {
				if(num%i ==0) 
					count++;
					
			}if (count ==2)
				{
					System.out.println("The Given Number is Prime");
				}
				else {
					System.out.println("The Given number is NOT a Prime");		
				}
					
		}
		else
		{
			System.out.println("The Given number is NOT a Prime");
		}
		
	}

}
