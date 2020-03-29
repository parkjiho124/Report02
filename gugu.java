import java.util.Scanner;

public class gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("구구단 출력하기");
		System.out.print("단 입력 : ");
		
		a = input.nextInt();
		
		System.out.println("*********");
		
		for(int i=1;i<=9;i++) {
			b = a*i;
			System.out.println(a+"x"+i+"="+b);
		}
		
		System.out.println("*********");
		System.out.println();
		System.out.println("구구단 종료");
		
		
	}

}