package cb.string;

import java.util.Comparator;
public class LexiconComparator  implements Comparator<String>{
	  public int compare(String obj1, String obj2) {
	    return obj1.compareTo(obj2);
	  }
	} 