package project1;

public class pro19 {

	public static void main(String[] args) {

		int count =0;
		for(int i =1;i<=9;i++) {
			if(i<=5) {
				count++;//1에서 5까지 증가하고 
			}else {
				count--;//5를 넘으면 줄어든다.
			}
			for(int j =1;j<=5-count;j++) {//count가 1이면 공백이 4가되고 별은 1개가 됨. 이런식으로 동작
				System.out.print( " ");
			}
			for(int k=1;k<=2*count-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
