package sohyeon.jun25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//https://github.com/PaengE/AlgorithmPractice/blob/master/BaekJoon_java/src/BOJ2929.java
//https://aorica.tistory.com/187?category=835561
/*
 * ����
������ �� ����ũ�����μ����� �����ߴ�. �� ���μ����� ���� ���μ������� �۵��ϴ� ���α׷��� �����Ű�� ������ ���� �ʾҴ�.

��ĥ���� �� ���μ����� ��� ������ ���캻 ���, �� ����� �˰� �Ǿ���. �� ���μ����� ���� �ӵ��� ����Ű�� ���ؼ� ���α׷� �ӽ� �ڵ忡 ������ ���� �����.

���� ���μ��������� ������ ������.

���μ����� �ӽ� �ڵ�� ����� ������ ������� ������ ���̴�. �� ����� �޸𸮸� 1����Ʈ ����Ѵ�.

��, ����� 0�� �Ǵ� �� �̻��� �Ķ���͸� ���� �� ������, �� �Ķ���͵� 1����Ʈ�� �޸𸮸� �����Ѵ�. �ӽ� �ڵ忡�� �Ķ���ʹ� ����� �ٷ� �ڿ� ���� ���´�.

�ӽ� �ڵ带 ����� �빮��, �Ķ���ʹ� �ҹ��ڷ� ��Ÿ�� �� �ִ�.

���� ���α׷��� ��� 4���� �̷���� �ִ�. ù ��° ����� �Ķ���� 3��, �� ��°�� 2��, �� ��°�� �Ķ���Ͱ� ����, �� ��°�� 4���̴�. �� ���α׷��� �޸𸮸� 13����Ʈ ����Ѵ�.

�� ���μ����� �޸𸮸� 4����Ʈ ������ �����´�. ��, ����� �ݵ�� 4�� ���������� ��ġ���� �����ؾ� �Ѵ�.

(�޸��� ù ����Ʈ�� �ּ� 0) ����, ���ο� ��� NOP(no operation)�� �߰��� ��� ����� �����ϴ� ��ġ�� 4�� ���������� ������ ����� �Ѵ�.

���� ���α׷��� �� ���μ��������� ��ȯ�� �ӽ� �ڵ�� �Ʒ��� ����.

��� A, B, C, D�� ���� ��ġ�� 0, 4, 8, 12�� ��� 4�� ������ ��������.

���� ���μ����� �ӽ� �ڵ尡 �־����� ��, �� ���μ������� �����Ű�� ���� �����ؾ� �ϴ� NOP ������ �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
���� ���μ����� �ӽ� �ڵ� ���α׷��� �־�����. ���α׷��� �ִ� 200���ڷ� �̷���� �ִ�.

���α׷��� �׻� ������� �����Ѵ�. (ù ���ڰ� �빮��) �� ����� �ӽ� �ڵ忡�� ���� �� ������ ��쿡, �׻� ���� ������ �Ķ���͸� ���´�.
--
���
�����ؾ��ϴ� NOP ������ �ּڰ��� ����Ѵ�.
--
���� �Է� 1 
Abcd
���� ��� 1 
0
--
���� �Է� 2 
EaEbFabG
���� ��� 2 
5
--
���� �Է� 3 
AbcbBccCDefgh
���� ��� 3 
4
*/

public class No1_2929 {

	static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = "";
		String regex = "([A-Z][a-z]*)";
		Pattern pattern = Pattern.compile(regex);							// �־��� ���Խ��� ���� ������ ����
		int NOPcnt = 0, start;
		
		str = br.readLine();
		Matcher matcher = pattern.matcher(str);								// ���Ͽ� ��Ī�� ���ڿ��� �Է��� Matcher�� ����

		while (matcher.find()) {
			start = matcher.start();										// matcher.find()�� ���� ã�� ���� ���� index ���� ��ȯ
			start += NOPcnt;

			if (start % 4 != 0) {
				NOPcnt += 4 - start % 4;
			}
		}
		bw.write(NOPcnt + "");
		bw.flush();
	}

}
