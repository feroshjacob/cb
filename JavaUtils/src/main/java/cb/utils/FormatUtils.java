package cb.utils;

import java.text.DecimalFormat;

public class FormatUtils {
	public static String format(int total, int values, String name) {
	
		DecimalFormat df = new DecimalFormat("#.##");
		
		return name+": Answered=" + values + "("
				+ df.format(((double) values / total) * 100) + "%)";

	}

}
