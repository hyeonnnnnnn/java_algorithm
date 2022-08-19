package mijin.std_mijin.y_2022.aug_20;

import java.util.Scanner;


/*문제
동혁이는 새로운 이미지 문자 인식 프로그램을 만들었다. 이 프로그램은 종이에 쓰여 있는 글자를 스캔한 뒤, 텍스트 파일로 저장한다. 동혁이는 밤을 새며 열심히 프로그램을 만들었지만, 프로그램의 신뢰도는 100%가 아니며, 어떤 글자는 인식하지 못했다. 결국 동혁이는 100%가 아니라는 점에서 실망하였고, 대전으로 도망가게 되었다.

대전으로 도망가버린 동혁이를 대신해서, 동혁이가 만든 이미지 문자 인식 프로그램의 인식률을 계산하는 프로그램을 작성하시오.

인식률은 인식한 문자의 수를 R, 전체 문자의 수를 A라고 했을 때, R/A이다. 줄바꿈 문자는 문자로 세지 않는다.

입력
입력은 N개의 테스트 케이스로 구성되어 있다. 첫째 줄에 테스트 케이스의 개수 N이 주어진다. 각 테스트 케이스는 적어도 한 줄이고, 인식하지 못한 문자는 '#'로 표시한다. 각 테스트 케이스의 다음에는 빈 줄이 한 칸씩 있다. 각 줄은 100글자를 넘지 않고, 줄의 수도 200줄을 넘지 않는다.

출력
각 테스트 케이스에 대해서 인식률을 계산한 뒤 다음과 같이 출력한다. 각 줄은 "Efficiency ratio is X%."와 같은 형태로 출력해야 한다. X는 인식률을 퍼센트로 표시한 것이고, 소수점 두자리 이상인 경우에는 둘째 자리에서 반올림해서 출력한다. 단, 반올림 결과가 정수이면 정수 부분만 출력한다.

예제 입력 1 
3
Pr#nt ex##tly one##ine for#eac# te#t c#se.

None.

The i#put consists of
N test ca#es. The number
of th#m (N) is given on
the first #ine
of the#input#file.

예제 출력 1 
Efficiency ratio is 78.6%.
Efficiency ratio is 100%.
Efficiency ratio is 94%.*/

public class bj_3448 {

	public static void main(String[] args) {
		int i=0,N;
		int A=0,R=0; //전체,인식
		String str="",tmp="";
		double tmp2;
		Scanner s=  new Scanner(System.in);
		
		N=s.nextInt();
		str = s.nextLine();
		while(i<N) {
			tmp=s.nextLine();
			if(tmp.length()==0) {
				A+=str.length();
				R+=str.replaceAll("#", "").length();
				
				if(R>0) {
					tmp2=(double)R/A*100;
					if( tmp2%1==0.0) {
						System.out.printf("Efficiency ratio is %d%%" , (int)tmp2); //(R/A)*100 안뜸 ㅠㅠ
					}
					else {
						System.out.printf("Efficiency ratio is %.1f%%" ,tmp2);
						System.out.println(2);
					}
						i++;
						A=0;R=0;
					
				}else {
					
					str =s.nextLine();
				}
			}else {
				str+=tmp;
			}
		}
		
		

	}

}
