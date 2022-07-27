package project1;

public class pro21 {

	public static void main(String[] args) {
		//
		int sum = 0;
		//1에서부터 100까지 홀수의 합
		for(int i =1;i<=100;i=i+2) {
			sum =sum + i;
		}
		System.out.println("홀수의합:"+sum);
		
		
		sum = 0;
		//0~100까지 짝수의 합
		for(int i =0; i<=100;i=i+2) {
			sum = sum+i;
		}
		System.out.println("짝수의합:"+sum);
		
		System.out.println()
	}

}
