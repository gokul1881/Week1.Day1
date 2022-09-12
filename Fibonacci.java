package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNum =0;
		int secondNum =1;
		int sum =0;
		System.out.println(sum);
		for (int i=0;i<=10;i++) {
			
			sum =firstNum + secondNum;
		System.out.println(sum);
		firstNum =secondNum;
		secondNum = sum;
		
		}
	}

}
