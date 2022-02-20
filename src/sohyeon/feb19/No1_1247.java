package sohyeon.feb19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// https://umilove98.tistory.com/57
/*
 * ����
N���� ������ �־�����, �� �������� �� S�� ��ȣ�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�� 3���� �׽�Ʈ ���� �־�����. �� �׽�Ʈ ���� ù° �ٿ��� N(1 �� N �� 100,000)�� �־�����, ��° �ٺ��� N���� �ٿ� ���� �� ������ �־�����.

�־����� ������ ������ 9223372036854775807���� �۰ų� ����.

--
�� 3���� �ٿ� ���� �� �׽�Ʈ �¿� ���� N���� �������� �� S�� ��ȣ�� ����Ѵ�. S=0�̸� "0"��, S>0�̸� "+"��, S<0�̸� "-"�� ����ϸ� �ȴ�.
--
���� �Է� 1 
3
0
0
0

10
1
2
4
8
16
32
64
128
256
-512

6
9223372036854775807
9223372036854775806
9223372036854775805
-9223372036854775807
-9223372036854775806
-9223372036854775804
--
���� ��� 1 
0
-
+
 */
public class No1_1247 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        BigInteger zero = new BigInteger("0");
        
        for(int i = 0; i < 3; i++) {		// ������ �� 3��
        	
            int n = Integer.parseInt(br.readLine());		// �Է¹��� �� ����
            BigInteger s = zero;
            
            for(int j = 0; j < n; j++) {
                BigInteger now = new BigInteger(br.readLine());		// n�� �Է¹޾�
                s = s.add(now);										// ����
                
            }
            
            if(s.compareTo(zero) == 0) {    // ������� 0�̸� 
                System.out.println(0);
                
            }else if(s.compareTo(zero) == 1) {    // ������� ����̸�
                System.out.println("+");
                
            }else {                            // ������� �����̸�
                System.out.println("-");
                
            }
        }
	}

}
