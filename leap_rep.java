import java.util.Scanner;

public class leap_rep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� �Ǻ��ϱ�");
		System.out.print("�⵵ �Է� : ");
		
		year = input.nextInt();
		
		while (year>=1) {
		
			if (year%4==0 && year%100!=0 || year%400==0) {
				System.out.println(year+"���� �����Դϴ�.");
			} else
				System.out.println(year+"���� ����Դϴ�.");
			
			System.out.print("�⵵ �Է� : ");
			year = input.nextInt();
			
		}
			
		System.out.println("���α׷� ����");
	}

}