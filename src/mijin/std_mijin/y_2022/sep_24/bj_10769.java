package mijin.std_mijin.y_2022.sep_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*

�ູ���� ������ �ٱ���
�ð� ����	�޸� ����	����	����	���� ���	���� ����
1 ��	256 MB	3526	2205	1985	64.302%
����
�¿��̴� �ڽ��� ������ ǥ���ϱ� ���ؼ� ���� ���� �޽����� �̸�Ƽ���� �־� ������ �Ѵ�. �¿��̰� ������ �̸�Ƽ���� �� ���� ���ڰ� �پ��ִ� ������ �̷���� ������, �ູ�� ���� ��Ÿ���� :-) �� ���� ���� ��Ÿ���� :-( �� �ִ�.

�����̴� �¿����� �̸�Ƽ���� �Ϳ��� ô�̶�� ������ �ſ� �Ⱦ��ϹǷ�, �¿����� ���ڰ� ���� ��ü���� �����⸸ �Ǵ��ؼ� �˷��ִ� ���α׷��� �ۼ��ϰ� �ʹ�.

�Է�
ù �ٿ� �ּ� 1������ �ִ� 255���� ���ڵ��� �Էµȴ�.

���
����� ���� ��Ģ�� ���� ��������.

� �̸�Ƽ�ܵ� ���ԵǾ� ���� ������, none �� ����Ѵ�.
�ູ�� �̸�Ƽ�ܰ� ���� �̸�Ƽ���� ���� �����ϰ� ���ԵǾ� ������, unsure �� ����Ѵ�.
�ູ�� �̸�Ƽ���� ���� �̸�Ƽ�ܺ��� ���� ���ԵǾ� ������, happy �� ����Ѵ�.
���� �̸�Ƽ���� �ູ�� �̸�Ƽ�ܺ��� ���� ���ԵǾ� ������, sad �� ����Ѵ�.
���� �Է� 1 
How are you :-) doing :-( today :-)?
���� ��� 1 
happy
���� �Է� 2 
:)
���� ��� 2 
none
���� �Է� 3 
This:-(is str:-(:-(ange te:-)xt.
���� ��� 3 
sad
*/
public class bj_10769 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = null;
		int flag=0,sad=0,hp=0;
		String sb =null;
		
		st = br.readLine();
		
		for(int i=0;i<st.length();i++) {
			if(st.indexOf(":-)",i)>0) {
				flag=1;
				hp+=1;
				i=st.indexOf(":-)",i);
			}
		}
		for(int i=0;i<st.length();i++) {
			if(st.indexOf(":-(",i)>0) {
				flag=1;
				sad+=1;
				i=st.indexOf(":-(",i);
			}
		}
		
		
		if(flag ==0) 
			System.out.println("none");
		else if (hp==sad)
			System.out.println("unsure");
		
		else if (hp>sad)
			System.out.println("happy");
		else if (hp<sad)
			System.out.println("sad");
	}

}
