import java.util.Scanner;

public class leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� �Ǻ��ϱ�");
		System.out.print("�⵵ �Է� : ");
		
		year = input.nextInt();
		
		if (year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year+"���� �����Դϴ�.");
		} else
			System.out.println(year+"���� ����Դϴ�.");
		
	}

}