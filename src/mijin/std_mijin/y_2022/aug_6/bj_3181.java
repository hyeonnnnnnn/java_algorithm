package mijin.std_mijin.y_2022.aug_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*���Ӹ� ����� �ٱ���
�ð� ����	�޸� ����	����	����	���� ���	���� ����
1 ��	128 MB	1099	654	568	62.349%
����
���� ���簡 �����Ƽ� ���� �ϱ⵵ ������ �Ѵ�. �׷��� �Ϸ��� ���� ������� ���Ӹ��� ������� �ϴµ� ���� ��Ģ�� �������.

�Ϸ��� ���� �ּ� �ϳ� �̻��� �ܾ �����ϴµ� �� �ܾ���� ��Ȯ�� ��ĭ�� �������� ������ �ȴ�. ���Ӹ��� ���鶧�� �� �ܾ��� �ձ��ڸ� ���� ��������µ� ������ �ܾ���� ������� �ܾ���̹Ƿ� �����Ѵ�.

'i', 'pa', 'te', 'ni', 'niti', 'a', 'ali', 'nego', 'no', 'ili'.

������ �� �ܾ���� �Ϸ��� ���� �� �տ� �ð�� �ſ� �߿��ϴٰ� �ǴܵǾ� �����ϸ� �ȵǰ� ���Ӹ��� �����Ͽ��� �Ѵ�.

���Ӹ��� ����⵵ �������� ���� ���� ���Ӹ��� ������ִ� ���α׷��� �ۼ��϶�.

��, ���Ӹ��� ��� �빮�ڷθ� �̷�����ִ�.

�Է�
�Է��� �����ϰ� �� �ٸ� �־����� �Ϸ��� ���� ���ԵǾ� �ִ�.

������ ���ĺ� �ҹ��ڿ� �������θ� �̷���� �ִ�.

������ �ִ���̴� 100�̴�.

���
������� ���Ӹ��� ����϶�.

���� �Է� 1 
micro soft
���� ��� 1 
MS
���� �Է� 2 
biti ali i ne biti
���� ��� 2 
BNB
���� �Է� 3 
ali ja sam i jucer jeo
���� ��� 3 
AJSJJ*/
public class bj_3181 {
	public static String zr[]  = {"i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili"}; 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		//�� ���� ����� �ֳ� ã�ƺ��� 
		
		String ss ="" ; // �ӽ� ���ڿ� ����
		String rs =""; //���� ���ڿ�
		for(int i=0;st.hasMoreTokens();i++) {
			ss= st.nextToken();
			//ù��°�ε� �ְų�, ���°��
			if( (i==0 && exst(ss)==1) || exst(ss)==0) {
				rs += Character.toUpperCase(ss.charAt(0));
				continue;
			}
			
		}
		System.out.println(rs);
			
	}
	
	public static int exst (String str) {
		//������ 1 ������ 0
		int rsi =0;
		for(int i=0;i<zr.length;i++) {
			if(str.equals(zr[i]))
				rsi = 1;
		}
		return rsi ;
	}

}
