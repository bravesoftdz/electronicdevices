package by.htp_gvozdev.task.logic;

import java.util.ArrayList;

import by.htp_gvozdev.task.bean.Kettle;
import by.htp_gvozdev.task.bean.Lamp;
import by.htp_gvozdev.task.bean.Production;
import by.htp_gvozdev.task.bean.Сooker;

public class Initialization {

	public static ArrayList<Production> list = new ArrayList<Production>();

	public static void getInitialization() {
		Appliances.getAppliances();

	}

	public static ArrayList<Production> setAppliances() {

		list.add(new Kettle("LG", "Kettle", 20.00, 2.00, true));
		list.add(new Сooker("Samsung", "Cooker", 50.00, 4.00, true));
		list.add(new Lamp("Phileps", "Lamp", 10.57, 7.50, true));

		return list;
	}

}
