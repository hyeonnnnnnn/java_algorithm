package mijin.std_mijin.y_2022.apr_23;

import java.util.Scanner;

public class bj_1157 {

	public static void main(String[] args) {
		String st;
		Scanner s = new Scanner(System.in); //BufferReader br = new BufferedReader(new InputStreamReader(System.iin)
		
		st= s.next();
		st=st.toUpperCase(); //�빮�ڷ� �����
	
		int max=0; //�ִ밪 ����
		char ch='?'; //��� ��� 
		int [] arr = new int[26];
		
		
		for(int i=0;i<st.length();i++) {
			arr[st.charAt(i)-'A']++;
		}
	
		for(int t =0;t<26;t++) {
			if(arr[t] >max) {
				max = arr[t];
				ch = (char) (t+65);
				
			}else if (arr[t] == max) {
				ch ='?';
			}
		}
		
		System.out.println(ch);
		
		

	}

}
