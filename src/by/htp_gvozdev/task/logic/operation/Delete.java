package by.htp_gvozdev.task.logic.operation;

import java.util.Scanner;

import by.htp_gvozdev.task.logic.*;

public class Delete {

	@SuppressWarnings("resource")
	public static void deleteItem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line number to remove the appliance:");
		int indexCandyUser = sc.nextInt();

		if (Initialization.list.size() == 0) {
			System.out.println("**********Sorry, but the list is empty.**********");
		} else {

			Initialization.list.remove(indexCandyUser - 1);
		}
	}
}
