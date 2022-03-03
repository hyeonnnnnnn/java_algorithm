package mijin.std_mijin.y_2022.mar_5;

import java.util.Scanner;

public class bj_1284 {

	public static void main(String[] args) {
		int num [] = new int[999]; //입력
		int out [] = new int[999];
		int i =0; //인덱스 값
		
		Scanner s = new Scanner(System.in);
		
		for (i=0;i<99999;i++) {
			//표지판 수 입력받기
			num[i] = s.nextInt();
			out[i] = printwd( Integer.toString(num[i]) );
			if ( num[i] ==0) {
				break;
			}
		}
		
		for (int j= 0;j<i;j++) {
			System.out.println(out[j]);
		}

	}	


 static int printwd (String num) {
	int len =0; 
	//int i=0;
	String [] arr = num.split("");
	for (String s:arr){
		//숫자 검사
		switch (s) {
			case "1":
				len += 2;
				//System.out.println(s+" 2추가됨");
				break;
			case "0" :
				len += 4;
				//System.out.println(s+" 4추가됨");
				break;
			default:
				len +=3;
				//System.out.println(s+" 3추가됨");
		}
	}
	//숫자 사이 간격
	len += num.length()+1;
	return len;
 }
}
