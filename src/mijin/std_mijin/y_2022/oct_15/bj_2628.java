package mijin.std_mijin.y_2022.oct_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/*
�����ڸ���
�ð� ����	�޸� ����	����	����	���� ���	���� ����
1 ��	128 MB	6756	3745	3092	56.859%
����
�Ʒ� <�׸� 1>�� ���� ���簢�� ����� ���̰� �ִ�. �� ���̴� ���ι���� ���� �������� 1������ ������ �׾��� �ִ�. ���� ������ ������ �Ʒ��� 1������ ���ʷ� ��ȣ�� �پ� �ְ�, ���� ������ ���ʿ��� ���������� ��ȣ�� �پ� �ִ�.



<�׸� 1>

������ ���� �� ���̸� Į�� �ڸ����� �Ѵ�. ���� ������ ���� �ڸ��� ���� ������ ���� ������ ������ ������, ���� ������ ���� ���� ������ �Ʒ��� ������ �� ���� �ڸ���. ���� ���, <�׸� 1>�� ���� ���� 10���̰� ���� ���� 8���� ���̸� 3�� ���� ����, 4�� ���� ����, �׸��� 2�� ���� ������ ���� �ڸ��� <�׸� 2>�� ���� ���� ���� ���� �������� ������ �ȴ�. �̶� ���� ū ���� ������ ���̴� 30���̴�.



<�׸� 2>

�Է����� ������ ���� ���� ����, �׸��� �߶���� �������� �־��� ��, ���� ū ���� ������ ���̰� �� �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù�ٿ��� ������ ���ο� ������ ���̰� ���ʷ� �ڿ����� �־�����. ���ο� ������ ���̴� �ִ� 100���̴�. ��° �ٿ��� Į�� �߶���ϴ� ������ ������ �־�����. ��° �ٺ��� ������ �ٱ��� �� �ٿ� ������ �ϳ��� �Ʒ��� ���� ������� �Էµȴ�. ���η� �ڸ��� ������ 0�� ���� ��ȣ�� ���ʷ� �־�����, ���η� �ڸ��� ������ 1�� ���� ��ȣ�� �־�����. �ԷµǴ� �� ���� ���̿��� �� ĭ�� �ϳ��� �ִ�.

���
ù° �ٿ� ���� ū ���� ������ ���̸� ����Ѵ�. ��, ������ ������ ������� �ʴ´�.

���� �Է� 1 
10 8
3
0 3
1 4
0 2
���� ��� 1 
30*/

//https://skygood95.tistory.com/50?category=913853

public class bj_2628 {
	static ArrayList<Integer> a,b;
	static int width,height,num;
	public static void main(String[] args) throws IOException {
		
			BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
			a=new ArrayList<Integer>();
			b=new ArrayList<Integer>();
			StringTokenizer st=new StringTokenizer(br.readLine());
			width=Integer.parseInt(st.nextToken());
			height=Integer.parseInt(st.nextToken());
			num=Integer.parseInt(br.readLine());
			for(int i=0;i<num;i++) {
				st=new StringTokenizer(br.readLine());
				int where=Integer.parseInt(st.nextToken());
				int k=Integer.parseInt(st.nextToken());
				if(where==1) {
					a.add(k);
				}else {
					b.add(k);
				}
			}
			Collections.sort(a);
			Collections.sort(b);
			int w=0;
			int start=0;
			for(int i=0;i<a.size();i++) {
				if(a.get(i)-start>w) {
					w=a.get(i)-start;
				}
				start=a.get(i);
			}
			if(width-start>w) {
				w=width-start;
			}
			int h=0;
			start=0;
			for(int i=0;i<b.size();i++) {
				if(b.get(i)-start>h) {
					h=b.get(i)-start;
				}
				start=b.get(i);
			}
			if(height-start>h) {
				h=height-start;
			}
			System.out.println(h*w);
		
	}

}
