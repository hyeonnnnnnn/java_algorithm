package sohyeon.sep03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ����
�¿��̴� �ڽ��� ������ ǥ���ϱ� ���ؼ� ���� ���� �޽����� �̸�Ƽ���� �־� ������ �Ѵ�. 

�¿��̰� ������ �̸�Ƽ���� �� ���� ���ڰ� �پ��ִ� ������ �̷���� ������, �ູ�� ���� ��Ÿ���� :-) �� ���� ���� ��Ÿ���� :-( �� �ִ�.

�����̴� �¿����� �̸�Ƽ���� �Ϳ��� ô�̶�� ������ �ſ� �Ⱦ��ϹǷ�, �¿����� ���ڰ� ���� ��ü���� �����⸸ �Ǵ��ؼ� �˷��ִ� ���α׷��� �ۼ��ϰ� �ʹ�.
--
�Է�
ù �ٿ� �ּ� 1������ �ִ� 255���� ���ڵ��� �Էµȴ�.
--
���
����� ���� ��Ģ�� ���� ��������.

� �̸�Ƽ�ܵ� ���ԵǾ� ���� ������, none �� ����Ѵ�.
�ູ�� �̸�Ƽ�ܰ� ���� �̸�Ƽ���� ���� �����ϰ� ���ԵǾ� ������, unsure �� ����Ѵ�.
�ູ�� �̸�Ƽ���� ���� �̸�Ƽ�ܺ��� ���� ���ԵǾ� ������, happy �� ����Ѵ�.
���� �̸�Ƽ���� �ູ�� �̸�Ƽ�ܺ��� ���� ���ԵǾ� ������, sad �� ����Ѵ�.
--
���� �Է� 1 
How are you :-) doing :-( today :-)?
���� ��� 1 
happy
--
���� �Է� 2 
:)
���� ��� 2 
none
--
���� �Է� 3 
This:-(is str:-(:-(ange te:-)xt.
���� ��� 3 
sad
*/
public class No5_10769 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int happy = str.split(":-\\)", -1).length-1;
		int sad = str.split(":-\\(", -1).length-1;
		
//		System.out.println(happy + " " + sad);
		
		if(happy > sad) {									// ���� ���� ���ؼ� ��� ���
			System.out.println("happy");
		}else if(happy < sad) {
			System.out.println("sad");
		}else if(happy!= 0 && happy == sad) {				// �� ���� ��� 0���� ��� none ����ؾ� �ϱ� ������ ���� �߰�
			System.out.println("unsure");
		}else  {
			System.out.println("none");
		}
	}

}
