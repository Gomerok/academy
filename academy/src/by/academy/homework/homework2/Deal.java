package by.academy.homework.homework2;

import java.util.Scanner;
import java.util.Random;

public class Deal {

	private static final Scanner scan = new Scanner(System.in);
	private static final Random rand = new Random();

	public static void main(String[] args) {
//
		int cards = 5;
		String suits[] = { "�����", "����", "����", "���" };
		String rank[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "�����", "��������", "������", "���" };
		int n = suits.length * rank.length;

		String deck[] = new String[n];
		for (int i = 0, k = 0; i < suits.length; i++) {
			for (int j = 0; j < rank.length; j++, k++) {
				deck[k] = suits[i] + "/" + rank[j];
			}
		}

		System.out.println("������� ���������� ������� �� 2 �� 10:");
		int players = scan.nextInt();

		while (players < 2 || players > 10) {
			System.out.println("������� �������� ���������� �������, ������� ������:");
			players = scan.nextInt();
		}

		String temp;
		for (int i = 0; i < n; i++) {
			int r = rand.nextInt(n);
			temp = deck[i];
			deck[r] = deck[i];
			deck[i] = temp;
		}

		for (int i = 0; i < cards * players; i++) {
			System.out.println(deck[i]);
			if ((i+1) % cards == 0) {
				System.out.println();
			}
		}
		scan.close();
	}

}