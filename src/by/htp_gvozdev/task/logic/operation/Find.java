package by.htp_gvozdev.task.logic.operation;

import java.util.Scanner;

import by.htp_gvozdev.task.logic.*;

public class Find {

	static Scanner scanner = new Scanner(System.in);

	public static void getFind() {
		Appliances.showAppliances(Initialization.list);
		Appliances.getAppliances();
	}

}
