package by.htp_gvozdev.task.logic;

import java.util.ArrayList;

import by.htp_gvozdev.task.bean.Production;
import by.htp_gvozdev.task.logic.operation.FornatForDouble;
import by.htp_gvozdev.task.logic.MenuApp;

public class Appliances {

	
	public static void showAppliancesAfterSort(ArrayList<Production> list) {
		int i = 0;
		System.out.println("     +-----------------------------------------------------------+");
		System.out.println("     |                 REPORT ON ENERGY CONSUMPTION              |");
		System.out.println("     +----+------------+--------+-------+-----------+------------+");
		System.out.println("     | No |    Name    |  Type  | Power |Consumption|Turn(on/off)|");
		System.out.println("     +----+------------+--------+-------+-----------+------------+");
		for (Production value : list) {	
			i++;
			System.out.printf("%11s %12s %8s %7s %11s %13s \t \n", "|  " + i + " |", value.getName() + " |" , value.getType() + " |", value.getPower() + " |" , value.getConsumption() + " |" , value.isTurn() + "| ");
			System.out.println("     +----+------------+--------+-------+-----------+------------+");
		}
	}
	
	public static void getAppliancesAfterSort() {
		double sumPower = Appliances.getTotalPower(Initialization.list);
		double sumConsumption = Appliances.getTotalConsumption(Initialization.list);
		int sumTurnOffAppliance = Appliances.getTurnOffAppliance(Initialization.list);
		String sumPowerAfterFormat = FornatForDouble.getFormatForDouble(sumPower);
		String sumConsumptionAfterFormat = FornatForDouble.getFormatForDouble(sumConsumption);
		System.out.printf("%6s %26s %7s %11s \t \n","|", "TOTAL" + " |",sumPowerAfterFormat + " |",sumConsumptionAfterFormat + " |");
		System.out.println("     +--------------------------+-------+-----------+");
		System.out.println("     *Disconnected appliances: " + sumTurnOffAppliance);
		MenuApp.menuShow();
		ChoisMenu.getChoisMenu();
	}
	

	
	public static void showAppliances(ArrayList<Production> list) {
		int i = 0;
		System.out.println();
		System.out.println();
		System.out.println("     +-----------------------------------------------------------+");
		System.out.println("     |                 REPORT ON ENERGY CONSUMPTION              |");
		System.out.println("     +----+------------+--------+-------+-----------+------------+");
		System.out.println("     | No |    Name    |  Type  | Power |Consumption|Turn(on/off)|");
		System.out.println("     +----+------------+--------+-------+-----------+------------+");
		for (Production value : list) {	
			i++;
			System.out.printf("%11s %12s %8s %7s %11s %13s \t \n", "|  " + i + " |", value.getName() + " |" , value.getType() + " |", value.getPower() + " |" , value.getConsumption() + " |" , value.isTurn() + "| ");
			System.out.println("     +----+------------+--------+-------+-----------+------------+");
		}
	}
	
	public static void getAppliances() {
		ArrayList<Production> list = Initialization.setAppliances();
		Appliances.showAppliances(list);
		double sumPower = Appliances.getTotalPower(list);
		double sumConsumption = Appliances.getTotalConsumption(list);
		int sumTurnOffAppliance = Appliances.getTurnOffAppliance(list);
		String sumPowerAfterFormat = FornatForDouble.getFormatForDouble(sumPower);
		String sumConsumptionAfterFormat = FornatForDouble.getFormatForDouble(sumConsumption);
		System.out.printf("%6s %26s %7s %11s \t \n","|", "TOTAL" + " |",sumPowerAfterFormat + " |",sumConsumptionAfterFormat + " |");
		System.out.println("     +--------------------------+-------+-----------+");
		System.out.println("     *Disconnected appliances: " + sumTurnOffAppliance);
		MenuApp.menuShow();
		ChoisMenu.getChoisMenu();
	}
	
	public static void getShowRange(ArrayList<Production> list) {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("     *Sampling of power data. Range is from " + Constant.CONST_BY_PARAM_1 + " to " + Constant.CONST_BY_PARAM_2 + ".");
		System.out.println("     +-----------------------------------------------------------+");
		System.out.println("     |                 REPORT ON ENERGY CONSUMPTION              |");
		System.out.println("     +----+------------+--------+-------+-----------+------------+");
		System.out.println("     | No |    Name    |  Type  | Power |Consumption|Turn(on/off)|");
		System.out.println("     +----+------------+--------+-------+-----------+------------+");
		int i = 1;
		for (Production value : list) {
			if (Constant.CONST_BY_PARAM_1 > value.getPower() || Constant.CONST_BY_PARAM_2 < value.getPower()) {
				System.out.printf("%11s %12s %8s %7s %11s %13s \t \n", "|  " + i + " |", value.getName() + " |" , value.getType() + " |", value.getPower() + " |" , value.getConsumption() + " |" , value.isTurn() + "| ");
				System.out.println("     +----+------------+--------+-------+-----------+------------+");
			} 
			i++;
		}
	}

	public static int getTurnOffAppliance(ArrayList<Production> list) {
		int sumTurnOff = 0;
		for (Production value : list) {
			if (value.isTurn() == false) {
				sumTurnOff++;
			}
		}
		return sumTurnOff;
	}

	public static int getTurnOnAppliance(ArrayList<Production> list) {
		int sumTurnOn = 0;
		for (Production value : list) {
			if (value.isTurn() == true) {
				sumTurnOn++;
			}
		}
		return sumTurnOn;
	}


	public static double getTotalPower(ArrayList<Production> list) {
		double sumPower = 0;
		for (Production value : list) {
			if (value.isTurn() == true) {
				sumPower += value.getPower();
			}
		}
		return sumPower;
	}

	public static double getTotalConsumption(ArrayList<Production> list) {
		double sumConsumption = 0;
		for (Production value : list) {
			if (value.isTurn() == true) {
				sumConsumption += value.getConsumption();
			}
		}
		return sumConsumption;

	}

}
