package mijin.std_mijin.y_2022.jul_23;

import java.util.Scanner;
/*����
����̴� ���� ��ħ ���� �Ź��� �б��� �����ͼ� �д´�. ������, ������� ���� ���� ��������, �� �̻� ��ħ �Ź��� ���� �� ���� ��Ȳ�� �̸�����. ����̴� ��ĳ�ʸ� �̿��ؼ� ���ڸ� Ȯ���� ������ ������ �Ѵ�.

�Ź� ���� ���ڷ� �̷���� R*C ��ķ� ��Ÿ�� �� �ִ�. ���ڴ� ���ĺ��� ����, �׸��� ��ħǥ�� �̷���� �ִ�.

��ĳ�ʴ� ZR�� ZC�� �Է����� �޴´�. �̷��� �Ǹ�, ��ĳ�ʴ� 1*1ũ�⿴�� �� ���ڸ� ZR*ZCũ��� Ȯ���ؼ� ����� �ش�.

�Ź� ���� ZR, ZC�� �־����� ��, ��ĳ���� ��ĵ�� ��ģ ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� R, C, ZR, ZC�� �־�����. R�� C�� 1�� 50 ������ �����̰�, ZR�� ZC�� 1�� 5 ������ �����̴�.

���� R�� �ٿ��� �Ź� ��簡 �־�����.

���
��ĳ�ʿ� ��ĵ�� ����� �� R*ZR�� �ٿ� ���ļ� C*ZC�� ���ھ� ����Ѵ�.

���� �Է� 1 
3 3 1 2
.x.
x.x
.x.
���� ��� 1 
..xx..
xx..xx
..xx..
���� �Է� 2 
3 3 2 1
.x.
x.x
.x.
���� ��� 2 
.x.
.x.
x.x
x.x
.x.
.x.*/



public class bj_3035 {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int R=s.nextInt(),C=s.nextInt(),ZR=s.nextInt(),ZC=s.nextInt();
		String tmp;
		
		char [][] ar =  new char [R][C];
		
		//�⺻ ���� �Է�
		for(int i=0;i<R;i++) {
			tmp =s.next();
			for(int j=0;j<C;j++) {
				ar[i][j]=tmp.charAt(j);
			}
		}
		//int i=0,j=0;
		//���, ���� Ȯ�� ���� ��ŭ �ݺ� ���
		
		for(int i=0;i<R;i++) {          			//�迭�� �Էµ� �ش� ����
			for(int t=0;t<ZR;t++) {     			//ZR�� �ݺ� ���
				for(int j=0;j<C;j++) {				//����
					for(int k=0;k<ZC;k++) {			//ZC�� �ݺ� ���
						System.out.print(ar[i][j]);
					}
				}
				System.out.println();
			}
		}

		
		
	}

}
