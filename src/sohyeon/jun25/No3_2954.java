package sohyeon.jun25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ����
â���̴� ���� �� �Ϸ絿�� �Ͼ ���� �ϱ��忡 �����. �ϱ����� ���鼭 ���� ���ε� ���� �ϱ� ���ؼ� ����� �ϱ⸦ ����.

��, ������ �ڽ��� �ϱ����� ���� ���� ���� ���ؼ� ����('a','e','i','o','u')�� ������ 'p'�� �ϳ� ����,  �� ������ �ϳ� �� ����.

���� ���, "kemija" �� "kepemipijapa"�� �ǰ�, "paprika"�� "papapripikapa"�� �ȴ�.

â���̰� �ϱ��忡 �ۼ��� ������ �ϳ� �־����� ��, ���� ������ �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
ù° �ٿ� ���ĺ� �ҹ��ڿ� �������θ� �̷���� ������ �ϳ� �־�����. ��� �ܾ�� ���� �ϳ��� ���еǾ��� �ִ�. ������ ���̴� �ִ� 100�̴�.
--
���
ù° �ٿ� â���̰� �ϱ��忡 �ۼ��� ������ ���� �������� �ٲپ� ����Ѵ�.
--
���� �Է� 1 
zepelepenapa papapripikapa
���� ��� 1 
zelena paprika
--
���� �Է� 2 
bapas jepe doposapadnapa opovapa kepemipijapa 
���� ��� 2 
bas je dosadna ova kemija
*/
public class No3_2954 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();												// ���� �Է¹���
		
		str = str.replaceAll("apa", "a")
				 .replaceAll("epe", "e")
				 .replaceAll("ipi", "i")
				 .replaceAll("opo", "o")
				 .replaceAll("upu", "u");
		
		System.out.println(str);
		
	}

}
