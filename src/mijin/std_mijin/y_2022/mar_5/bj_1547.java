package mijin.std_mijin.y_2022.mar_5;

import java.util.Scanner;

public class bj_1547 {

	public static void main(String[] args) {
		int M =0;//�ݺ�
		int F,T =0; //�Է�
		int L =1; //�� ��ġ
		Scanner s = new Scanner(System.in);
		
		M =s.nextInt();
		while (M>0) {
			System.out.println("���� �Է� ");
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
