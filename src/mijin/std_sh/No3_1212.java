package mijin.std_sh;

import java.util.Scanner;

/*
 * ����
8������ �־����� ��, 2������ ��ȯ�ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
ù° �ٿ� 8������ �־�����. �־����� ���� ���̴� 333,334�� ���� �ʴ´�.
--
ù° �ٿ� �־��� ���� 2������ ��ȯ�Ͽ� ����Ѵ�. ���� 0�� ��츦 �����ϰ�� �ݵ�� 1�� �����ؾ� �Ѵ�.
--
���� �Է� 1 
314
���� ��� 1 
11001100
*/
public class No3_1212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
//		System.out.println(str.length());
		
		StringBuilder sb = new StringBuilder();
		
		if(str.length() <= 333334) {
			for (int i = 0; i < str.length(); i++) {
	        	
	            char c = str.charAt(i);		// i��° ���ڸ� ������
	            
	            switch (c){
	                case '0': sb.append("000"); break;
	                case '1': sb.append("001"); break;
	                case '2': sb.append("010"); break;
	                case '3': sb.append("011"); break;
	                case '4': sb.append("100"); break;
	                case '5': sb.append("101"); break;
	                case '6': sb.append("110"); break;
	                case '7': sb.append("111"); break;
	            }
	            
	        }
	        
	        if (sb.charAt(0)=='0') {	sb.deleteCharAt(0);		}		// ������ ���� ���ڸ��� 0�� �� �ش� ���ڿ� ����
	        if (sb.charAt(0)=='0') {	sb.deleteCharAt(0);		}
	        
	        System.out.println(sb);
	        
		} else {
			System.out.println("�Է� ���� 333334 �ʰ�");
		}
        
        
        sc.close();
	}
	

}
