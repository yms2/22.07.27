package project1;

public class pro12 {

	public static void main(String[] args) {

		int sum1 = 0; //3의 배수
		int sum2 = 0; //4의 배수
		int sum3 = 0;
		for(int i = 0; i<=33; i++) {
			sum1 = sum1 + (i*3);
		}
		for(int i =0; i<=25; i++) {
			sum2 = sum2 + (i*4);
		}
		for(int i =0; i<=20; i++) {
			sum3 = sum3 + (i*5);
		}
		System.out.println("3의 배수:"+sum1);
		System.out.println("4의 배수:"+sum2);
		System.out.println("4의 배수:"+sum3);
	}

}
