package mijin.std_mijin.y_2022.jun_25;
/*
����
�ֹ����� �̹� �б⿡ ���� ����� ���� �׸��� ������ �־����� ��, ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

������ A+~F���� �� 13���� �ִ�.

A+: 4.3, A0: 4.0, A-: 3.7

B+: 3.3, B0: 3.0, B-: 2.7

C+: 2.3, C0: 2.0, C-: 1.7

D+: 1.3, D0: 1.0, D-: 0.7

F: 0.0

��� ������ �� ������ ����*������ ��� ���� �ڿ�, �� �������� ������ �ȴ�.

�Է�
ù° �ٿ�, �����̰� �̹� �б⿡ ���� ���� ���� �־�����. ��° �ٺ��� N���� �ٿ� �� ������ �����, ����, ������ �־�����. ������� ���ĺ� �ҹ��ڿ� ����, �׸��� ���� (_)�θ� �̷���� ������, �ִ� 100�����̰�, ������ 1���� ũ�ų� ����, 3���� �۰ų� ���� �ڿ����̴�. ������ ������ ������ 13���� �� �ϳ��̴�. 

���
ù° �ٿ� ��� ������ �Ҽ��� ��° �ڸ����� �ݿø��ؼ� ��° �ڸ����� ����Ѵ�. (��� ������ 1.5�̸� 1.50�� ����Ѵ�.)

���� �Է� 1 
7
General_Physics_1 3 A+
Introduction_to_Computer_Science_and_Eng 3 B0
Reading_And_Writing 2 C0
English_1 3 C+
Analytic_Geometry_and_Calculus_1 3 B+
Fortran_Programming 3 B+
C_Language_Programming 3 A+
���� ��� 1 
3.28*/

import java.util.Scanner;

public class bj_2755 {
final static float Ap =(float) 4.3;
final static float A =(float) 4.0;
final static float Am =(float) 3.7;
final static float Bp =(float) 3.3;
final static float B =(float) 3.0;
final static float Bm =(float) 2.7;
final static float Cp =(float) 2.3;
final static float C =(float) 2.0;
final static float Cm =(float) 1.7;
final static float Dp =(float) 1.3;
final static float D =(float) 1.0;
final static float Dm =(float) 0.7;
final static float F =(float) 0.0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float sum=0;
		float h =0; //����
		float s =0; //����
		int cnt =0;//�� ���� 
		String str="";
		String tmp="";
		int N = sc.nextInt();
		//���ۺ��� 
		sc.nextLine();
		
		for(int i=0;i<N;i++) {
			str = sc.nextLine();
			
			tmp= str.substring(str.length()-2,str.length()); 
			h = Float.parseFloat(str.substring(str.length()-4,str.length()-3));
			
		
			if(tmp.equals("A+"))
				s=Ap;
			else if(tmp.equals("A0"))
				s=A;
			else if(tmp.equals("A-"))
				s=Am;
			else if(tmp.equals("B+"))
				s=Bp;
			else if(tmp.equals("B0"))
				s=B;
			else if(tmp.equals("B-"))
				s=Bm;
			else if(tmp.equals("C+"))
				s=Cp;
			else if(tmp.equals("C0"))
				s=C;
			else if(tmp.equals("C-"))
				s=Cm;
			else if(tmp.equals("D+"))
				s=Dp;
			else if(tmp.equals("D0"))
				s=D;
			else if(tmp.equals("D-"))
				s=Dm;
			else if(tmp.equals("F"))
				s=F;
			sum +=s*h;
			cnt+=h;

		}
		System.out.printf("%.2f",(float)sum/cnt);
			
		
	}

}
