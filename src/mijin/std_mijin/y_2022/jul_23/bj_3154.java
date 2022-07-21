package mijin.std_mijin.y_2022.jul_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*����
�츮�� �ڵ������� �˶��ð踦 ������ ���� �ð��� ���� ��Ÿ���� 4���� ���ڸ� �Է��ϱ� ���� Ű���带 ����Ѵ�. ���� ���, �츮�� 12:30���� �˶��� �����Ϸ��� �Ѵٸ� 1,2,3,0�� �Է��ϸ� �ǰ� 9��30�� ���� ���� �� �տ� 0�� �ٿ� 0,9,3,0�� ������ �ȴ�.

�׷��� �� ��, ���� �˶��ð踦 ���ߴٰ� �ð��� �߸� �Է��ߴµ� ȭ�鿡 ��Ÿ���� �ð��� 24�� ���� ��������� ���� �˰Եƴ�. ���������� �� ���� 60���� ���� �������� ȭ�鿡 ��Ÿ���� ����� �˰Եƴ�. ���� ��� 66:79�� �ð��� �߸� �Է��߾ ������ ȭ�鿡�� 18:19�� ��Ÿ���ٴ� ���̴�.

���� �ſ� �������� ���ϴ� �˶��ð��� ���ߴµ� �ּ����� ��¸� �ϰ�ʹ�. �׷��� �����е��� ���� ��� �ϸ� �ּ����� ����� �鿩�� ���ϴ� �ð����� �˶��� ���� �� ������ �˾Ƴ��� ���α׷��� ������ �Ѵ�.



Ű����� ���� ���� ����� Ű a���� Ű b�� �̵��� �� �ʿ��� ����� ������ ����.

effort(a,b) = |xa-xb|+|ya-yb|

���⼭ (xa, ya) �� (xb, yb)�� Űa, b�� ��ǥ�� ��Ÿ����.

��ü ����� ���� ù ��° Ű���� �� ��° Ű�� �̵��ϴµ� �ʿ��� ���, �� ��° Ű���� �� ��° Ű�� �̵��ϴµ� �ʿ��� ���, �� ��° Ű���� �� ��° Ű�� �̵��ϴµ� �ʿ��� ����� �� ���� ������ ���ǵȴ�.

���� ��� 22:45�� �Է��ϴµ� �ʿ��� ��ü ����� ���� effort(2,2)+effort(2,4)+effort(4,5)=0+2+1=3. �̴�.

���� ���� ���� ������� ���� ���� �ð��� ����϶�.

�Է�
�Է��� ù ��° �ٿ��� HH:MM �������� �����ϰ� ���� �ð��� �־�����. ���� �ð��̳� ���� �� �ڸ������ �����ϴ� 0�� �پ�� �Ѵ�.

�����ϰ� ���� �ð��� 00:00~23:59 �� �ϳ��̴�.

���
����� ù ��° �ٿ��� HH:MM �������� ���� ����Ѵ�. �� �ڸ��� ����� �����ϴ� 0�� �ٿ��� �Ѵ�.

���� �Է� 1 
14:19
���� ��� 1 
14:79
���� �Է� 2 
00:11
���� ��� 2 
24:11
���� �Է� 3 
12:34
���� ��� 3 
12:34*/

public class bj_3154 {
static int rh=0; //�Լ����� �� �Ŷ� ���� ����
static int rm=0;
	public static void main(String[] args) throws IOException {
		//���� �߰� �� 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] hm  = br.readLine().split(":");
		int h = Integer.parseInt(hm[0]);
		int m = Integer.parseInt(hm[1]);
		int min=999,sum=0; 
		
		//case1 ������
		min =comp(h,m,min);
		
		//case2 �ð� ����
		h+=24;
		min =comp(h,m,min);
		
		//case3 �е� ����
		m+=60;
		min =comp(h,m,min);
		
		//case4 �и�����
		h-=24;
		min =comp(h,m,min);
		
		System.out.println(rh/10+""+rh%10 +":"+rm/10+""+rm%10);
	}
	//��°��� ���ؼ� ����� ���� & min�� ���� 
	static int comp(int h,int m,int min) {
		int tmp ;
		tmp =sumef(h/10,h%10,m/10,m%10);
		if(min>=tmp) {      //�ּ� �ð� �� 
			if(min==tmp && (rh+rm<=h+m)) 		// ����� ������ �ð��� �� �ʰų� �������� pass
				return min;
			rh =h; rm=m; 
			min=tmp;
		}
		return min;
	}
	//�ش� �ð��� ����� �� ���ؼ� ������
	static int sumef(int a,int b,int c,int d) {
		return effort(a,b)+effort(b,c)+effort(c,d);
	}
	//a�� b������ ��� ���ϴ� �Լ�
	static int effort(int a,int b) {
		if(a==b) 
			return 0;
		int tmp;
		int xa,xb,ya,yb;
		if(a>b) { //���� ���� a�� 
			tmp = a;
			b=a;
			b=tmp;
		}
		//��, ���� ������ ��ǥ ���� 
		xa=(a-1)/3;ya=(a%3)==0?2:(a%3)-1;
		xb=(b-1)/3;yb=(b%3)==0?2:(b%3)-1;
		
		if(a==0) { //0�� ��츸 ó�� 
			xa =3;ya=1;
		}
		
		return Math.abs(xa-xb)+Math.abs(ya-yb);
	}

}
