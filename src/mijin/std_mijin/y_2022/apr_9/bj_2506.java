package mijin.std_mijin.y_2022.apr_9;

import java.util.Scanner;

public class bj_2506 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =0;
		int w=1;//���� ���� ����ġ
		int sc =0; //�հ�
		int tmp =0;
		n=s.nextInt();
		
		for(int i=0;i<n;i++) {
			tmp = s.nextInt();
			if(tmp ==1) {
				sc+=w;
				w++;
			}else {
				w=1;
			}
		}
		System.out.println(sc);
		

	}

}
