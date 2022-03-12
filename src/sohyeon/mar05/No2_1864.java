package sohyeon.mar05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * ����
�ط��� �ſ� ������ �ٴ��� ���ٴϴ� ������ ���� �ٴ� �عٴڿ����� �߰ߵǴ� �ܹ��� ������ ��ü�� �������� �ؾ����ڵ鿡�� ������������.

������ �ֱ��� ���� ������ ���� ����� �о߿� �ϴ� ������ �ҷ��Դ�. �� ������ ��ü�� �ٷ� ��� ���ڸ� ���� ����̶�� ���� �ؾ� �������ڵ鿡 ���� ������ ���̴�.

���ڵ��� ��� ������ ���� �������� ���� �� �� ������, �� ǥ����� �ص��ϴ� ������ �����ߴ�.

�� ���� ��� �̵鿡�Դ� ��� ���� ���ڿ� �׸� ǥ���ϴ� �ܹ��� ���̰� �ſ� ���� ���ۿ� ����. ���� �����ڵ��� ������ ���� ��ȣ�� �ܹ��� ���̸� ����� �����ߴ�.

�� ��ȣ�� �����ϴ� ���ڴ� ������ ����.

-�� 0�� �����Ѵ�.
\�� 1�� �����Ѵ�.
(�� 2�� �����Ѵ�.
@�� 3�� �����Ѵ�.
?�� 4�� �����Ѵ�.
>�� 5�� �����Ѵ�.
&�� 6�� �����Ѵ�.
%�� 7�� �����Ѵ�.
/�� -1�� �����Ѵ�.

�ؾ� �Ű����ڵ��� Ư�� ������ ��Ÿ���� ��ȣ�� �ִٴ� ��ǿ� ����ϸ鼭, ���� ������ �ܰ��� ������ �Ű����� �� �߰��� ���� ũ�� �����ϱ⸦ ����ϰ� �ִ�.

�翬�� ������ �� ü��� 8������ ����Ѵ�. ���� ��� ������ ����.

(@&�� 2 �� 82 + 3 �� 8 + 6 = 158�̴�.

?/--�� 4 �� 83 + -1 �� 82 + 0 �� 8 + 0 = 1984�̴�.
/(\�� -1 �� 82 + 2 �� 8 + 1 = -47�̴�.

��ſ��� �־��� ������ ���� ���ڸ� �Է� �޾� �������� ��Ÿ���� ���̴�.
--
�Է�
�� �ٿ� �ϳ��� ���� ���ڰ� �Է����� �־�����. �� ���ڴ� �ּ� �� ��, �ִ� ���� ���� ���� ���� ��ȣ�� �̷�����ִ�. �Է����� '#'�� ������ �Է��� �����Ѵ�.
--
���
�Է� ���� ���� ���ڿ� �����ϴ� �������� �� �ٿ� �ϳ��� ����Ѵ�.
--
���� �Է� 1 
(@&
?/--
/(\
?
#
���� ��� 1 
158
1984
-47
4

*/

public class No2_1864 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		// read
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		// write
        
        int cnt = 0;
        int sum = 0;
        
        while(true) {
        	
            String input = br.readLine();			// ���ٷ� �о�ͼ�
            
            if(input.equals("#")) {		// # �Է� �� ����
                break;
            }
            
            else {
            	
                for(int i = 0; i < input.length(); i++) {
                	
                    int tmp = 0;
                    
                    switch(input.charAt(i)) {			// �� ���ڿ� ��ġ�ϴ°� ã�Ƽ�
                        case '-': tmp = 0; break;
                        case '\\': tmp = 1; break;
                        case '(': tmp = 2; break;
                        case '@': tmp = 3; break;
                        case '?': tmp = 4; break;
                        case '>': tmp = 5; break;
                        case '&': tmp = 6; break;
                        case '%': tmp = 7; break;
                        case '/': tmp = -1; 
                        
                    }
                    sum += tmp * Math.pow(8, input.length()-1-cnt);			// 8������ �������Ѽ� ����
                    
                    cnt++;
                }
            }
            
            bw.write(sum + "\n");		// ��� ���
            
            cnt=0;			// �ʱ�ȭ
            sum=0;			// �ʱ�ȭ
        }
        bw.flush();
        bw.close();


	}

}
