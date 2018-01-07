package by.htp_gvozdev.task.logic.operation;

public class ClearConsole {
	public static void ClearCons() {
		for (int q = 0; q < 100; q++)
			System.out.println();

		System.out.print("");

		for (int q = 0; q < 32; q++) {
			for (long i = 0; i < 99999999; i++)

				;
			System.out.print((char)8 + "" + (char)8);
		}

		System.out.println();

	}
}
