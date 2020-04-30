package by.ld.unit03;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите текущий курс: ");
		double kurs = scanner.nextDouble();
		System.out.print("Введите количество: ");
		double amount = scanner.nextDouble();
		System.out.println("В рублях это: " + kurs * amount);

	}

}
