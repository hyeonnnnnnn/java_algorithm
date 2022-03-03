package mijin.std_mijin.y_2022.mar_5;

import java.util.Scanner;

public class bj_1547 {

	public static void main(String[] args) {
		int M =0;//반복
		int F,T =0; //입력
		int L =1; //공 위치
		Scanner s = new Scanner(System.in);
		
		M =s.nextInt();
		while (M>0) {
			System.out.println("숫자 입력 ");
			F =s.nextInt();
			T =s.nextInt();
			if (F==T) 
				continue;
			else if (F==L) 
				L=T;
			else if (T==L)
				L=F;
			
			M -=1;
		}
		System.out.println(L);
		
	}

}
