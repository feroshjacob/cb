package cb.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cb.string.IStringCompare;
import cb.string.StringComparison;

public class CompareUtils {
	
	public List<String> sortStrings(List<String> strings, IStringCompare compare) {
		if(strings.size() < 2) return strings;
		List<String> sortedList = new ArrayList<String>();
		sortedList.add(0, strings.get(0));
		List<String> candidates = getAllExcept(strings, strings.get(0));
		String string = strings.get(0);
		 String closestString =null;
		 for(int i =1; i<strings.size();i++){
			 
			 closestString = getClosestMatch(compare, string, candidates);
			 sortedList.add(i,closestString);
			 string = closestString;
			 candidates = getAllExcept(candidates, string);
		 }
		return sortedList;
	}

	private String getClosestMatch(IStringCompare compare, String string,
			List<String> candidates) {
		float max =0.0f;
		int selectedIndex=0;
		if(candidates.isEmpty()) return null;
		for(int i=0;i<candidates.size(); i++){
			float cur = compare.compare(candidates.get(i), string);
			if (cur >max) {
				max =cur;
				selectedIndex=i;
				
			}
		}
		return candidates.get(selectedIndex);
		
	}

	private List<String> getAllExcept(List<String> sortedList, String string) {
		
		List<String> list = new ArrayList<String>();
		boolean isFirst = true;
		for(String str : sortedList) {
			if(str.equals(string) && isFirst) isFirst= false;
			else 
			list.add(str);
		}
		return list;
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("third");
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("tee");
		list.add("two");
		list.add("four");
		list.add("five");	
		CompareUtils utils = new CompareUtils();
		List<String> list1=utils.sortStrings(list, StringComparison.getLuceneLevensteinDistance());
		for(String str: list1)
		System.out.println(str);
//	/	System.out.println(utils.getClosestMatch(StringComparison.getLuceneLevensteinDistance(), "one",list));
		
	}
}
