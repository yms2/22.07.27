package project1;

public class pro11 {

	public static void main(String[] args) {
		
		int sum1= 0;//짝수합
		int sum2 = 0;//홀수합
		
		for(int i = 0; i<101; i++) {
			if(i%2==0) {
				sum1 = sum1 +i;
			}else {
				sum2 = sum2 +i;
			}
		}
		System.out.println("짝수합:"+sum1);
		System.out.println("홀수합:"+sum2);
		
		
		sum1 = 0;
		for(int i = 0; i<101; i=i+2) { // 짝수
			sum1 = sum1 + i;
		}
		sum2 = 0;
		for(int i = 1; i<101;i=i+2) {
			sum2 = sum2 + i;
		}
		System.out.println("짝수합:"+sum1);
		System.out.println("홀수합:"+sum2);
	}

}
