package sohyeon.apr30;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
// https://begin-dev-awos.tistory.com/89?category=967729
/*
 * ����
�� ���� �������� �Է¹޾� �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
ù° �ٿ� �� ���� �������� �� ĭ�� ���̿� �ΰ� �־�����. �� �������� 1 �Ǵ� 0���θ� �̷���� ������, 0���� ������ ���� �ִ�. ���� �� �������� ���̴� 80�� ���� �ʴ´�.
--
���
ù° �ٿ� ������ ���� ����� ����Ѵ�. ����� 0�� ��츦 �����ϰ�� ��µǴ� �������� �׻� 1�� �����ؾ� �Ѵ�.
--
���� �Է� 1 
1001101 10010
���� ��� 1 
1011111
*/
public class No1_1252 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        BigInteger b1 = sc.nextBigInteger();			
        BigInteger b2 = sc.nextBigInteger();

        String s1 = b1.toString();
        String s2 = b2.toString();

        // 2������ 10������ ��ȯ
        BigInteger a = new BigInteger(s1, 2);
        BigInteger b = new BigInteger(s2, 2);

        // 10������ ��ȯ�� �� ���� ���ϰ�
        BigInteger sum = a.add(b);

        // �� ���� ���� sum�� ���� 2������ �ٽ� ��ȯ
        String result = sum.toString(2);
        System.out.println(result);
        
        sc.close();
	}

}
