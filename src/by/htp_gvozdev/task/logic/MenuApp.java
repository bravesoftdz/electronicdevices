package by.htp_gvozdev.task.logic;

public class MenuApp {

	public static void menuShow() {
		System.out.println();
		System.out.println();
		System.out.println("     +---------------------------------+");
		System.out.println("     |                MENU             |");
		System.out.println("     +---------------------------------+");
		System.out.println("     |     1 Operation                 |");
		System.out.println("     |          1.0 View list          |");
		System.out.println("     |          1.1 Add                |");
		System.out.println("     |          1.2 Delete             |");
		System.out.println("     |     2 Sort >                    |");
		System.out.println("     |          2.1 by name            |");
		System.out.println("     |          2.2 by type            |");
		System.out.println("     |          2.3 by power           |");
		System.out.println("     |          2.4 by onsumption      |");
		System.out.println("     |          2.5 by turn            |");
		System.out.println("     |     3 Find range                |");
		System.out.println("     |     4 Switch                    |");
		System.out.println("     |          4.1 On                 |");
		System.out.println("     |          4.2 Off                |");
		System.out.println("     |     5 Print to file             |");
		System.out.println("     |     6 Exit                      |");
		System.out.println("     +---------------------------------+");
		System.out.println();
		System.out.println();
		System.out.println("Enter the action code from the menu:");
		ChoisMenu.getChoisMenu();
	}

}
