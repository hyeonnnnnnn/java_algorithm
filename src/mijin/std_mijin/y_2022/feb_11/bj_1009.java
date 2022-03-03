package mijin.std_mijin.y_2022.feb_11;

import java.util.Scanner;

public class bj_1009 {

	public static void main(String[] args) {
		//7^100이 1????
		//1. a,b입력
		int a,b;
		int temp;
		int fst; //일의자리 수 담음
		Scanner scan = new Scanner(System.in);
		
		System.out.println("총 케이스 T 입럭 :");
		int t = scan.nextInt();
		
		while(t>0) {
			//a,b 숫자 받기 
			System.out.println("a,b 입럭 :");
			a = scan.nextInt();
			b = scan.nextInt();
			
			temp = b%4;
			fst = a%10;
			for (int i=1;i<temp;i++) {
				fst= ((fst*a)%100)%10;
			}
			
			System.out.printf("컴퓨터 번호 : %d\n",fst);
			t=t-1;
			fst=0;
			temp=0;
			
		}
		System.out.println("끝");
		scan.close();
	}

}
