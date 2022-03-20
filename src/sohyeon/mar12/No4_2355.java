package sohyeon.mar12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * ����
�� ���� A�� B�� �־����� ��, �� ���� ���̿� �ִ� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ���̿� �ִ� ������ A�� B�� �����Ѵ�.
--
�Է�
ù° �ٿ� �� ���� A, B�� �־�����. (-2,147,483,648 �� A, B �� 2,147,483,647)
--
���
ù° �ٿ� ���� ����Ѵ�. (-2,147,483,648 �� �� �� 2,147,483,647)
--
���� �Է� 1 
1 2
���� ��� 1 
3
*/

public class No4_2355 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		method1();
		method2();
	}
	
	public static void method1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());			// ���ٷ� �о����
		
		int A = Integer.parseInt(st.nextToken());							// ���� A 
		int B = Integer.parseInt(st.nextToken());							// ���� B
		
		int result = 0;														// ��� ���� ����
		
		for(int i = A; i <= B; i++) {										// A���� B���� �� �������� ���鼭
			result += i;													// ����
		}
		
		System.out.println(result);
	}
	
	// https://umilove98.tistory.com/95
	public static void method2() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long A = Integer.parseInt(st.nextToken());						// ���� A
        long B = Integer.parseInt(st.nextToken());						// ���� B
        
        if(B > A) {														// A���� B�� Ŭ ��� �ڸ� �ٲٱ�? �ٵ� �� �ϴ��� �𸣰���
            long temp = B;
            B = A;
            A = temp;
        }
        
        long result = (A + B) * (A - B + 1) / 2;
        
        System.out.println(result);
 
	}
}
