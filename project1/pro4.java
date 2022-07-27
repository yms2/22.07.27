package project1;

public class pro4 {

	public static void main(String[] args) {
		
		for(int i = 0; i<10; i++) {
			System.out.println(i+" ");
		}
		
		
		System.out.println();
		
		int j;
		for(j=0; j<10; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
		
		System.out.println(0+1+2+3+4+5+6+7+8+9+10);
		
		int sum =0;
		for(int i =0; i<=10;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		
		//0에서 100까지 합을 계산해보시오
		
		int sum1 =0 ;
		for (int k = 0; k<=100; k++) {
			if(k==100) {
			System.out.println("=");
		}else {
		System.out.println(k+"+");
		}
		sum1=sum1+k;
		}
		System.out.println(sum1);
		System.out.println();
	}
}
