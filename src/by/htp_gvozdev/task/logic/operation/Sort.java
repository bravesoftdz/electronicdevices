package by.htp_gvozdev.task.logic.operation;

import java.util.Collections;
import java.util.Comparator;

import by.htp_gvozdev.task.bean.Production;
import by.htp_gvozdev.task.logic.Initialization;

public class Sort {
	
	public static void sortByType() {
		Collections.sort(Initialization.list, new Comparator<Production>() {
			@Override
			public int compare(Production o1, Production o2) {
				return o1.getType().compareTo(o2.getType());
			}
		});
	}
	
	public static void sortByName() {
		Collections.sort(Initialization.list, new Comparator<Production>() {
			@Override
			public int compare(Production o1, Production o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
	}
	
	
	public static void sortByPower() {
		Collections.sort(Initialization.list, new Comparator<Production>() {
			public int compare(Production o1, Production o2) {
				if (o1.getPower() >= o2.getPower()) {
					return 1;
				} else {
					return -1;
				}
			}
		});
	}

	public static void sortByConsumption() {
		Collections.sort(Initialization.list, new Comparator<Production>() {
			public int compare(Production o1, Production o2) {
				if (o1.getConsumption() >= o2.getConsumption()) {
					return 1;
				} else {
					return -1;
				}
			}
		});
	}
}
