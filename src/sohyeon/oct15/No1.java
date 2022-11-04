package sohyeon.oct15;
import java.util.Scanner;
/*
 * ���� ����
��ȣ�� �ٸ��� ¦�������ٴ� ���� '(' ���ڷ� �������� �ݵ�� ¦��� ')' ���ڷ� ������ �Ѵٴ� ���Դϴ�. ���� ���

"()()" �Ǵ� "(())()" �� �ùٸ� ��ȣ�Դϴ�.
")()(" �Ǵ� "(()(" �� �ùٸ��� ���� ��ȣ�Դϴ�.
'(' �Ǵ� ')' �θ� �̷���� ���ڿ� s�� �־����� ��, ���ڿ� s�� �ùٸ� ��ȣ�̸� true�� return �ϰ�, �ùٸ��� ���� ��ȣ�̸� false�� return �ϴ� solution �Լ��� �ϼ��� �ּ���.
--
���ѻ���
���ڿ� s�� ���� : 100,000 ������ �ڿ���
���ڿ� s�� '(' �Ǵ� ')' �θ� �̷���� �ֽ��ϴ�.
--
����� ��
s	answer
"()()"	true
"(())()"	true
")()("	false
"(()("	false
--
����� �� ����
����� �� #1,2,3,4
������ ���ÿ� �����ϴ�.

*/
import java.util.Stack;

public class No1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		boolean result = true;
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(c == '('){						// ���� ��ȣ�� ��
                stack.push(c);
            }
            
            if(c == ')'){						// �ݴ� ��ȣ�� �� 
                if(stack.size() == 0){
                	result = false;
                }
                else stack.pop();
            }
        }
        if(stack.size() != 0) {
        	result = false;
        }
        
        sc.close();

        System.out.println(result);
	}

}
