package by.academy.classwork.lesson4;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "��� ������ �� �������� � ����� Java ������������ ������ String, StringBuilder, String Buffer";
		
		int i = 0, t = 0;

		t = str.indexOf('S');
		do {
			i++;

		} while (str.indexOf('S', t + 1) == -1);
		System.out.println(i);
	}

}
