package sohyeon.may14;

import java.util.Scanner;

/*
 * ����
�������� � ���� 10������ ǥ���� �� �� ���� �� �κ����� ������ ��, �պκ� �ڸ����� ���� �޺κ� �ڸ����� ���� ���� ���� ���Ѵ�.

���� ���, 1221�� �������̴�. 12�� 21�� ������ ��, �պκ� �ڸ����� �� 1*2�� �޺κ� �ڸ����� �� 2*1�� ���� �����̴�.

1236�� ���������� �������̴�. ������, 1234�� �ƴϴ�. ���� ���� �� �׻� ���ӵ� �ڸ����� �������ϰ�, �� �κп� ��� ���ڸ��� �־�� �Ѵ�.

���� ���, 12345�� �� 4���� ������� ���� �� �ִ�. 1-2345, 12-345, 123-45, 1234-5 � �� N�� �־��� ��, �� ���� ���������� �ƴ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
ù° �ٿ� �� N�� �־�����. �� ���� 2,147,483,647���� �۰ų� ���� �ڿ����̴�.
--
���
ù° �ٿ� N�� �������̸� YES, �ƴϸ� NO�� ����Ѵ�.
--
���� �Է� 1 
1236
���� ��� 1 
YES
--
���� �Է� 2 
1
���� ��� 2 
NO
--
���� �Է� 3 
1221
���� ��� 3 
YES
--
���� �Է� 4 
4729382
���� ��� 4 
NO
--
���� �Է� 5 
42393338
���� ��� 5 
YES
*/

public class No1_1356 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		char[] ch = num.toCharArray();										// ���� �� �ٷ� �Է¹޾� �ϳ��� �ڸ�
		
		boolean flag = false;												// ������ �ٸ��� Ȯ�� ���
		
		for(int i = 0; i < ch.length - 1; i++) {							// ���ڸ� �� �ڸ��� �־�� �ϹǷ� length-1 ���� ����
			int sum1 = 1, sum2 = 1;											// ���ڸ� ���� ���, ���ڸ� ���� ��� ���� ����
			
			for(int j = 0; j <= i; j++) {									// i ����(���ڸ�)
				sum1 = sum1 * Character.getNumericValue(ch[j]);				// ���ڸ� �� ���
//				System.out.println("sum1:"+sum1);
			}
			
			for(int j = i+1; j < ch.length; j++) {							// i ���� �� �� �ں��� ���ڿ� ������ ����ؾ� ��(���ڸ�)
				sum2 = sum2 * Character.getNumericValue(ch[j]);				// ���ڸ� �� ���
//				System.out.println("sum2:"+sum2);
			}
			
			if(sum1 == sum2) {												// ��� ������ �� flag true�� �ٲٰ� ���� ����
				flag = true;
				break;
			}
		}
		
		System.out.println(flag?"YES":"NO");
		sc.close();
	}

}
