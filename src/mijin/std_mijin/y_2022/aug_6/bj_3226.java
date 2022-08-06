package mijin.std_mijin.y_2022.aug_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*��ȭ ��� �ٱ���
�ð� ����	�޸� ����	����	����	���� ���	���� ����
1 ��	128 MB	1268	507	464	44.359%
����
7:00���� 19:00���� ��ȭ ����� 1�п� 10���̴�.

19:00���� 7:00���� ��ȭ ����� 1�п� 5���̴�.

����̰� ��ȭ�� �� �ð��� ��ȭ �ð��� ��� �־����� ��, ��ȭ ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ����̰� �� ��ȭ�� �� N�� �־�����. (1 �� N �� 100)

���� N�� �ٿ��� ����̰� �� ��ȭ�� ���� ������ HH:MM DD�� ���� �������� �־�����.

HH:MM�� ��ȭ�� �� �ð��̸�, DD�� ��ȭ �ð��̴�. DD�� �ִ� 60�̸�, MM�� DD���̿��� ������ �ϳ� �־�����.

���� �ó� ���� ���ڸ� ���ڶ��, �տ� 0�� �ϳ� �־�����.

�ð��� 00:00���� 23:59�����̴�.

���
�� ��ȭ ����� ����Ѵ�.

���� �Է� 1 
2
11:02 11
15:30 01
���� ��� 1 
120
���� �Է� 2 
3
20:05 12
06:45 30
13:08 15
���� ��� 2 
435
���� �Է� 3 
5
00:00 05
06:47 35
11:30 18
18:33 60
23:59 22
���� ��� 3 
1035*/
public class bj_3226 {

	public static void main(String[] args) throws IOException {
		int N ; //��ȭ �Ǽ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = null;
		int stt =7; //7��
		int edt =19; //19��
		int h,m,d; //�Է¹޴� ��
		int c10m=0 ,c5m=0; //10�� �� , 5�� �� 
		int rs= 0; //��� ����
		
		N =br.read()-48; //�� �Ǽ� �ޱ� , ���ప ����
		br.readLine(); //����ó�� 
		//System.out.println(N);
		for (int i=0;i<N;i++) {
			
			st= new StringTokenizer(br.readLine(),": "); //�� �� ��ȭ�ð� �ڸ��� 
			h = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());
			
			int tmph=h;
			int tmpm =d;
			c10m=0;c5m=0;
			
			//case1 ���ϸ�  �ð� ĳ���� ����� ���
			if(m+d>60 && ( (h+1)%24 ==stt || (h+1)%24 == edt )) {
				tmph = (h+1)%24;
				tmpm =m+d;
			}   
		
			//case2 ���ص� �ð� ĳ���� �� ����� ���, �Ϲ�
			if(tmph>= stt && tmph<edt) { //���ؼ� 7�ð� �Ѿ��
				c10m = tmpm%60;
				c5m  = d-c10m;
			}
			else if(tmph >=edt || tmph<stt) {//���ؼ� 19�ð� �Ѿ��
				c5m  = tmpm%60;
				c10m = d-c5m;
			}
			rs+=c10m*10 +c5m*5;
		}
		
		//��� ���
		System.out.println(rs); 

	}

}
