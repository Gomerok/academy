package by.academy.homework.homework2;

public class Task2 {

	 private static int diffWords(String st){ // ����� ���������� ��������
	        StringBuffer u = new StringBuffer(); // ������, � ������� ������ ������ ����� ����������� ���� �������
	        String c; // ������� ������ � ������
	        for (int i=0;i<st.length();i++) { // ����� ������
	            c = String.valueOf(st.charAt(i)); // �������� ������� ������
	            if (u.indexOf(c)==-1) // ������ ��� �� ����������
	                u.append(c); // ���������
	        }
	 
	        return u.length(); // ���������� ����� ������������ ������
	    }
	    
	    public static void main(String[] args) {
	        String[] a = {"Something", "abcdefghijklmnopq", "aaattaa","WHATEVER","..t"};
	        String goal = a[0]; // ������� �����
	        System.out.println("������: ");
	        for (int i=1;i<a.length;i++){
	            System.out.print(a[i]+", "); // ������� ��������� �������
	            if ( diffWords(a[i])<diffWords(goal))
	                    goal = a[i]; // ����� ���.��
	        }
	        System.out.println("");
	        System.out.println("������� �����: "+goal+", ����� ������ ��������: "+diffWords(goal));
	    }
}
