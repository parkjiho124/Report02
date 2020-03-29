import java.util.Scanner;

public class leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("윤년 판별하기");
		System.out.print("년도 입력 : ");
		
		year = input.nextInt();
		
		if (year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year+"년은 윤년입니다.");
		} else
			System.out.println(year+"년은 평년입니다.");
		
	}

}