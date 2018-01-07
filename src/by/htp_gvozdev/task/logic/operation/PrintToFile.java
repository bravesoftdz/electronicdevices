package by.htp_gvozdev.task.logic.operation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import by.htp_gvozdev.task.bean.Production;
import by.htp_gvozdev.task.logic.Appliances;
import by.htp_gvozdev.task.logic.Initialization;

public class PrintToFile {

	static Date date = new Date();

	public static void printFile() {
		try {
			File file = new File("src/by/htp_gvozdev/task/report/Report.txt");

			FileWriter fileWriter = new FileWriter(file);
			PrintWriter printWriter = new PrintWriter(fileWriter);

			printWriter.println("");
			printWriter.println(date.toString());
			printWriter.println("");
			printWriter.println("     +-----------------------------------------------------------+");
			printWriter.println("     |                 REPORT ON ENERGY CONSUMPTION              |");
			printWriter.println("     +----+------------+--------+-------+-----------+------------+");
			printWriter.println("     | No |    Name    |  Type  | Power |Consumption|Turn(on/off)|");
			printWriter.println("     +----+------------+--------+-------+-----------+------------+");

			int i = 1;
			for (Production value : Initialization.list) {
				i++;
				printWriter.printf("%11s %12s %8s %7s %11s %13s \t \n", "|  " + i + " |", value.getName() + " |",
						value.getType() + " |", value.getPower() + " |", value.getConsumption() + " |",
						value.isTurn() + "| ");
				printWriter.println("     +----+------------+--------+-------+-----------+------------+");
			}

			double sumPower = Appliances.getTotalPower(Initialization.list);
			double sumConsumption = Appliances.getTotalConsumption(Initialization.list);
			int sumTurnOffAppliance = Appliances.getTurnOffAppliance(Initialization.list);
			String sumPowerAfterFormat = FornatForDouble.getFormatForDouble(sumPower);
			String sumConsumptionAfterFormat = FornatForDouble.getFormatForDouble(sumConsumption);
			printWriter.printf("%6s %26s %7s %11s \t \n", "|", "TOTAL" + " |", sumPowerAfterFormat + " |",
					sumConsumptionAfterFormat + " |");
			printWriter.println("     +--------------------------+-------+-----------+");
			printWriter.println("     *Disconnected appliances: " + sumTurnOffAppliance);

			fileWriter.flush();
			fileWriter.close();

			ClearConsole.ClearCons();

			Appliances.showAppliancesAfterSort(Initialization.list);
			Appliances.getAppliancesAfterSort();
			System.out.println("*The print was a success.");

			printWriter.close();
		} catch (IOException e) {
			ClearConsole.ClearCons();
			e.printStackTrace();
			System.out.println("*The print failed.");
		}

	}
}
