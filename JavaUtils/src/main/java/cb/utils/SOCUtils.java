package cb.utils;

public class SOCUtils {
	
	private static String[] occupations=	new String[] {
		"00-0000  All Occupations",
		"11-0000  Management Occupations",
		"13-0000  Business and Financial Operations Occupations",
		"15-0000  Computer and Mathematical Occupations",
		"17-0000  Architecture and Engineering Occupations",
		"19-0000  Life, Physical, and Social Science Occupations",
		"21-0000  Community and Social Service Occupations",
		"23-0000  Legal Occupations",
		"25-0000  Education, Training, and Library Occupations",
		"27-0000  Arts, Design, Entertainment, Sports, and Media Occupations",
		"29-0000  Healthcare Practitioners and Technical Occupations",
		"31-0000  Healthcare Support Occupations",
		"33-0000  Protective Service Occupations",
		"35-0000  Food Preparation and Serving Related Occupations",
		"37-0000  Building and Grounds Cleaning and Maintenance Occupations",
		"39-0000  Personal Care and Service Occupations",
		"41-0000  Sales and Related Occupations",
		"43-0000  Office and Administrative Support Occupations",
		"45-0000  Farming, Fishing, and Forestry Occupations",
		"47-0000  Construction and Extraction Occupations",
		"49-0000  Installation, Maintenance, and Repair Occupations",
		"51-0000  Production Occupations",
		"53-0000  Transportation and Material Moving Occupations"
		};

	public static String[] getAllOccupations() {
		return occupations;
	}
	public static String getSOCTitle(int num) {
		for(String occupation: occupations){
			if(occupation.startsWith(num+"")) return occupation.split("0000")[1].trim();
		}
		return "Unknown SOC";
	}
	
 }
