package mijin.std_mijin.feb_11;

import java.util.Scanner;

public class bj_1085 {

	public static void main(String[] args) {
		int x,y,w,h;
		int temp; 
		int min;
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("x y w h ют╥б");
		x=scan.nextInt();y=scan.nextInt();w=scan.nextInt();h=scan.nextInt();
		
		min = (x>=y?y:x);
		temp= ((w-x)>=(h-y)?h-y:w-x); //Math.min
		System.out.println(min>=temp?temp:min);
		scan.close();
	}

}
