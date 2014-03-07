package cb.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Arrays;

public class RegexUtils {

	
	public static void main(String[] args) throws IOException { 
		String str ="J2X01X5ZGJTVL1MDZF72012-10-25 12:07:28.817Mustang CATDallasTXUSHeavy Equipment / Industrial Engine (Diesel or Natural Gas) Tech<p>Skilled Labor – Trades – Diesel – Service – Mechanic –Technician – Diesel Technician – Heavy Equipment Technician</p><p>If you are an experienced <b>Heavy Equipment / Industrial Engine (Diesel or Natural Gas) Technician</b> seeking a new opportunity, then this is the place to be!</p><p><b>Mustang CAT</b> is currently hiring <b>Heavy Equipment / Industrial Engine (Diesel or Natural Gas) Technicians</b> in <b>Houston, TX,</b>&nbsp;or surrounding area. <b><i>Relocation reimbursement available to qualified candidates from Phoenix AZ, Los Angeles CA, Atlanta GA, and Dallas TX.</i></b></p><p><u>Job Description</u></p><p>The technician performs mechanical repairs on new and used equipment in the shop or in the field. Position is responsible for troubleshooting and repairing equipment.&nbsp; Technician is also responsible for housekeeping and properly maintaining company issued vehicles, tools and equipment.</p><p><b>Responsibilities</b>:</p><ul><li> Follows strict safety protocols; using proper PPE as required.</li><li> Troubleshoots, diagnoses and repairs equipment.</li><li> Completes all required reporting for service time in an accurate and efficient manner; this includes writing service reports, properly allocating time to each job, and tracking parts charged and parts returned.</li><li> Maintains customer satisfaction by understanding customer needs and deadlines, attempting to complete scheduled repairs and service as safely, timely and accurately as possible.</li><li> Maintains company issued equipment and tools, keeping them in good working order.</li><li> Adheres to all safety rules and maintains good housekeeping (5S) in work area. </li></ul><p><b>Requirements</b>:</p><ul><li> Minimum of 3 years of Heavy Equipment/Diesel Technician experience within agricultural equipment, heavy equipment or industrial engine repair</li><li> Experience troubleshooting and repairing CAT equipment or competitive brand preferred</li><li> High School Diploma or GED required</li><li> Technical background provided through a vocational school with studies in diesel equipment repair preferred</li><li> Must be able to lift up to 50 lbs.</li><li> Must be available to work a minimum of 40 hours per week (Rotational Saturdays as needed)</li><li> Valid Driver’s License</li><li> Clean driving record</li><li> Must be willing to submit to a drug screen, background check and physical exam</li><li> Must own proper tools to perform necessary repairs on equipment</li><li> Relocate to Houston area. <b><i>Relocation reimbursement available.</i></b></li></ul><p><b>&nbsp;</b></p><p><b>&nbsp;</b></p><p><b>Benefits</b>:</p><ul><li> Competitive hourly rate</li><li> Paid Overtime</li><li> Extensive training provided</li><li> Health Insurance</li><li> Dental Insurance</li><li> Flexible Benefit Plan</li><li> Basic Life/AD&amp;D and Supplemental Life Insurance</li><li> Long Term &amp; Short Term Disability</li><li> Paid Holidays</li><li> Paid Time Off (PTO)</li><li> 401(K) Plan</li><li> Employee Assistance Program (EAP)</li><li> Other company-sponsored benefits include boot allowance, safety glass allowance, optional Credit Union membership, and educational assistance.</li><li> Low cost of living</li><li> No state income tax</li><li> Possible semi-annual merit increases for first two years of employment</li></ul><p>Company Overview</p><p>Serving Southeast Texas for 60 years, Mustang CAT is one of the leading Caterpillar equipment dealers in the United States. We have many exciting opportunities for exceptional people who want a career with an industry leader. If you are looking for a solid, growth-oriented company with a commitment to its customers and its employees, Mustang CAT is the place for you.</p>&nbsp;49-3031.0088";
		
		String sam ="J2X01X5ZGJTVL1MDZF72012-10-25 12:07:28.817Mustang CATDallasTXUSHeavy Equipment / Industrial Engine (Diesel or Natural Gas) Tech<p>Skilled Labor – Trades – Diesel – Service – Mechanic –Technician – Diesel Technician – Heavy Equipment Technician</p><p>If you are an experienced <b>Heavy Equipment / Industrial Engine (Diesel or Natural Gas) Technician</b> seeking a new opportunity, then this is the place to be!</p><p><b>Mustang CAT</b> is currently hiring <b>Heavy Equipment / Industrial Engine (Diesel or Natural Gas) Technicians</b> in <b>Houston, TX,</b>&nbsp;or surrounding area. <b><i>Relocation reimbursement available to qualified candidates from Phoenix AZ, Los Angeles CA, Atlanta GA, and Dallas TX.</i></b></p><p><u>Job Description</u></p><p>The technician performs mechanical repairs on new and used equipment in the shop or in the field. Position is responsible for troubleshooting and repairing equipment.&nbsp; Technician is also responsible for housekeeping and properly maintaining company issued vehicles, tools and equipment.</p><p><b>Responsibilities</b>:</p><ul><li> Follows strict safety protocols; using proper PPE as required.</li><li> Troubleshoots, diagnoses and repairs equipment.</li><li> Completes all required reporting for service time in an accurate and efficient manner; this includes writing service reports, properly allocating time to each job, and tracking parts charged and parts returned.</li><li> Maintains customer satisfaction by understanding customer needs and deadlines, attempting to complete scheduled repairs and service as safely, timely and accurately as possible.</li><li> Maintains company issued equipment and tools, keeping them in good working order.</li><li> Adheres to all safety rules and maintains good housekeeping (5S) in work area. </li></ul><p><b>Requirements</b>:</p><ul><li> Minimum of 3 years of Heavy Equipment/Diesel Technician experience within agricultural equipment, heavy equipment or industrial engine repair</li><li> Experience troubleshooting and repairing CAT equipment or competitive brand preferred</li><li> High School Diploma or GED required</li><li> Technical background provided through a vocational school with studies in diesel equipment repair preferred</li><li> Must be able to lift up to 50 lbs.</li><li> Must be available to work a minimum of 40 hours per week (Rotational Saturdays as needed)</li><li> Valid Driver’s License</li><li> Clean driving record</li><li> Must be willing to submit to a drug screen, background check and physical exam</li><li> Must own proper tools to perform necessary repairs on equipment</li><li> Relocate to Houston area. <b><i>Relocation reimbursement available.</i></b></li></ul><p><b>&nbsp;</b></p><p><b>&nbsp;</b></p><p><b>Benefits</b>:</p><ul><li> Competitive hourly rate</li><li> Paid Overtime</li><li> Extensive training provided</li><li> Health Insurance</li><li> Dental Insurance</li><li> Flexible Benefit Plan</li><li> Basic Life/AD&amp;D and Supplemental Life Insurance</li><li> Long Term &amp; Short Term Disability</li><li> Paid Holidays</li><li> Paid Time Off (PTO)</li><li> 401(K) Plan</li><li> Employee Assistance Program (EAP)</li><li> Other company-sponsored benefits include boot allowance, safety glass allowance, optional Credit Union membership, and educational assistance.</li><li> Low cost of living</li><li> No state income tax</li><li> Possible semi-annual merit increases for first two years of employment</li></ul><p>Company Overview</p><p>Serving Southeast Texas for 60 years, Mustang CAT is one of the leading Caterpillar equipment dealers in the United States. We have many exciting opportunities for exceptional people who want a career with an industry leader. If you are looking for a solid, growth-oriented company with a commitment to its customers and its employees, Mustang CAT is the place for you.</p>&nbsp;49-3031.0088";

		char ch ='\u0001';
		
		System.out.println(URLEncoder.encode("<strong>Division: </strong>Retail <strong>FlsaStatus: </strong>Non-Exempt <strong>EmploymentType: </strong>Regular GENERAL FUNCTION: Provide excellent customer care to customers   regarding daily transactions, addressing inquiries, and problem resolution, in accordance with Fifth Third Bank policies. Refer customers to the appropriate business partner for   products and services uncovered during business interactions and/or conversations. ESSENTIAL DUTIES & RESPONSIBILITIES: Customer Service A.Promote good customer relations by consistently providing premier customer satisfaction with a friendly demeanor, can-do attitude, and willingness to help at all times. B. Have a  developed rapport with the customer base, greet by/use name, have knowledge of account ownership, be responsive and timely with correspondence and problem resolution, and display  a caring attitude. C. Act with confidence by answering or finding the answers to customer questions and finding solutions to customerissues. D. Maintain a position of trust and responsibility by keeping all customer business confidential. E. Follow the Bancorp Code of Business Conduct and Ethics and other       related policies, maintaining ethical behavior at all times. Bank Operations/Transactions A. Perform daily office responsibilities, working with the Customer Services Manager, to  maintain the efficient operation of the office. B. Maintain personally a balancing record that is in line with policy and have the abilityto find and correct outages and to enlist help as needed for more difficult errors. C. Maintain knowledge of the bank policies and financial center procedures, and take            responsibility to keep up to date on any changes. D. Handle consumer and business customer problems with professionalism, directing more complex issues seamlessly to the Customer  Services Manager, or other management as necessary. E. Demonstrate sound judgment in decision making, abiding appropriately to establishedguidelines and procedures. Referrals A. Consistently meet or exceed sales referrals as set by management. B. Continuously increase knowledge and skills through self-motivation,    formal education, seminars and in-house training. C. Maintain a well-developed working knowledge of the complete line of products and services offered, taking responsibility to    keep up to date and request assistance for further development needs. D. Initiate conversations to uncover customer needs and be capable ofeffectively referring customers to business partners for the selling and cross-selling bank products and services to customers, so that personal and Bank goals are consistently    met and/or exceeded. SUPERVISORY RESPONSIBILITIES: N/A<hr>Experiencen++MINIMUM KNOWLEDGE, SKILLS AND ABILITIES REQUIRED: Work involves extensive cash handling, which requires      ability to perform advanced math functions. Work involves contact with the public, necessitating the ability to present a professionalimage. Must have the ability to interact comfortably and confidently with the public and demonstrate the initiative to initiate dialogue. Work requires the ability to properly     read and write well enough to communicate in both oral and written form. Position requires knowledge of retail policies and procedures in order to perform the essential duties.    Work requires the ability to take initiative and utilize sound judgment in decision-making and diplomacy and tact in problem resolution.Must be able to work in a team environment with the ability to interact well, and in a positive manner, with co-workers and management. Need to have flexibility in scheduling."));
		
	//	 String[] texts = sam.split("");
		 String[] text1s = sam.split(""+ch+"");
			 
		
	//	 System.out.println(new String("".getBytes(),"UTF8"));
		
		// printBytes("".getBytes(), "utf8Bytes");
	//	 printBytes("".getBytes(), "defBytes");
		//	 System.out.println(texts[7]);
			 System.out.println(text1s[7]);
			// checkContents();
	}

	private static void checkContents() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(new File("/Users/fjacob/dump/test.txt")));
		String text =reader.readLine();
		System.out.println(text);
		System.out.println(text.toString().split("")[7]);
		reader.close();
	}
	 public static void printBytes(byte[] array, String name) {
		    for (int k = 0; k < array.length; k++) {
		      System.out.println(name + "[" + k + "] = " + "0x"
		          + UnicodeFormatter.byteToHex(array[k]));
		    }
		  }


static class UnicodeFormatter {

  static public String byteToHex(byte b) {
    // Returns hex String representation of byte b
    char hexDigit[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
        'a', 'b', 'c', 'd', 'e', 'f' };
    char[] array = { hexDigit[(b >> 4) & 0x0f], hexDigit[b & 0x0f] };
    return new String(array);
  }

  static public String charToHex(char c) {
    // Returns hex String representation of char c
    byte hi = (byte) (c >>> 8);
    byte lo = (byte) (c & 0xff);
    return byteToHex(hi) + byteToHex(lo);
  }

} // class

}
