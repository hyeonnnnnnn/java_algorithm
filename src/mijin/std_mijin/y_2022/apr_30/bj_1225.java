package mijin.std_mijin.y_2022.apr_30;

import java.util.Scanner;

/*A��B�� ����ϴ� ���ܿ��� �����̴� A��B�� ���ο� ������� �����Ϸ��� �Ѵ�.

A���� �� �ڸ��� �̰� �� B���� ���Ƿ� �� �ڸ��� �̾� ���Ѵ�.

�� ������ ��� ���� (A�� n�ڸ�, B�� m�ڸ� ����� �� ������ ������ n��m��)�� ���� ���� �����Ϸ��� �Ѵ�.

���� ��� 121��34��

1��3 + 1��4 + 2��3 + 2��4 + 1��3 + 1��4 = 28

�� �ȴ�. �̷��� �������� ���� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

public class bj_1225 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B ; 
		int sum=0;
		A=sc.nextInt(); B=sc.nextInt();
		int btmp=B,atmp=A; //������ ���� �� ��� 
		int ax,bx;
		
		for (int i=4;i>=0;i--) {
			ax=(int) (atmp/Math.pow(10, i));
			atmp =(int) (atmp%Math.pow(10, i));
			btmp =B;
			for(int j=4;j>=0;j--) {
				bx=(int) (btmp/Math.pow(10, j));
				btmp =(int) (btmp%Math.pow(10, j));
				sum+=ax*bx;
			}
		}
		System.out.println(sum);
		
		
	}

}
