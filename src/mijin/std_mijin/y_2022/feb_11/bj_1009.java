package mijin.std_mijin.y_2022.feb_11;

import java.util.Scanner;

public class bj_1009 {

	public static void main(String[] args) {
		//7^100�� 1????
		//1. a,b�Է�
		int a,b;
		int temp;
		int fst; //�����ڸ� �� ����
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� ���̽� T �Է� :");
		int t = scan.nextInt();
		
		while(t>0) {
			//a,b ���� �ޱ� 
			System.out.println("a,b �Է� :");
			a = scan.nextInt();
			b = scan.nextInt();
			
			temp = b%4;
			fst = a%10;
			for (int i=1;i<temp;i++) {
				fst= ((fst*a)%100)%10;
			}
			
			System.out.printf("��ǻ�� ��ȣ : %d\n",fst);
			t=t-1;
			fst=0;
			temp=0;
			
		}
		System.out.println("��");
		scan.close();
	}

}
