package sohyeon.oct15;

import java.util.Scanner;

/*
 * ���� ����
�ڿ��� n�� �־����� ��, n�� ���� ū ���ڴ� ������ ���� ���� �մϴ�.

���� 1. n�� ���� ū ���ڴ� n���� ū �ڿ��� �Դϴ�.
���� 2. n�� ���� ū ���ڿ� n�� 2������ ��ȯ���� �� 1�� ������ �����ϴ�.
���� 3. n�� ���� ū ���ڴ� ���� 1, 2�� �����ϴ� �� �� ���� ���� �� �Դϴ�.
���� �� 78(1001110)�� ���� ū ���ڴ� 83(1010011)�Դϴ�.

�ڿ��� n�� �Ű������� �־��� ��, n�� ���� ū ���ڸ� return �ϴ� solution �Լ��� �ϼ����ּ���.
--
���� ����
n�� 1,000,000 ������ �ڿ��� �Դϴ�.
--
����� ��
n	result
78	83
15	23
--
����� �� ����
����� ��#1
���� ���ÿ� �����ϴ�.
--
����� ��#2
15(1111)�� ���� ū ���ڴ� 23(10111)�Դϴ�.
*/
public class No3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int answer = 0;
        
        String str = Integer.toBinaryString(n);								// n�� 2������ ��ȯ
        int cnt = 0;														// n�� 1�� ��Ʈ�� ����
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1') cnt++;									// 1�� ��Ʈ �� ī����
        }
        
        for(int i = n+1; i < 1000000; i++){									// n+1���� �ݺ�
            String temp = Integer.toBinaryString(i);
            int tCnt = 0;
            
            for(int j = 0; j < temp.length(); j++){
                if(temp.charAt(j) == '1') tCnt++;
            }
            
            if(tCnt == cnt) {												// 1�� ��Ʈ�� ���� ��ġ�ϸ� �ش� ���� ��� �ݺ��� ����
                answer = i;
                break;
            }
        }
        
        sc.close();
        System.out.println(answer);
        
	}

}
