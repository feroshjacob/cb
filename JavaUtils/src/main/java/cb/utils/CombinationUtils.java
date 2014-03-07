package cb.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.paukov.combinatorics.Factory;
import org.paukov.combinatorics.Generator;
import org.paukov.combinatorics.ICombinatoricsVector;

public class CombinationUtils {
	
	private static int MAX=49;
	
	public static void main(String[] args) {
		Set<String> set = getAllCombinations("- UNIVERSITY OF  PORT HARCOURT");
		for(String str:set){
			System.out.println(str);
		}
		System.out.println("size:"+set.size());
	}
	public static Set<String> getAllCombinations(String text) {
		
		Set<String> set = new HashSet<String>();
		if(text.trim().length() <1) return set;
		
		set.add(text.toLowerCase());
		set.add(text.toUpperCase());
		set.add(makeFirstCaps(text));
		set.add(makeAllFirstCaps(text));
		set.add(makeAllFirstCaps(text.replaceAll("[^a-zA-Z\\s]+","")));
		set.add(makeAllFirstCapsExceptSome(text.replaceAll("[^a-zA-Z\\s]+","")));
		if(text.split("\\s").length <2  || text.split("\\s").length >6) {
			return set;
		}

		ICombinatoricsVector<String> initialVector = Factory.createVector(
				getIntialVector(text) );
	


		try {
			for ( int i=1; i<=initialVector.getSize();i++ ){
				// Create a simple combination generator to generate 3-combinations of the initial vector
				Generator<String> gen = Factory.createSimpleCombinationGenerator(initialVector, i);

				// Print all possible combinations
				
				for (ICombinatoricsVector<String> combination : gen) {
					//  System.out.println(combination);
					if(set.size() >= MAX ) 
						return set;
					set.add(makeMeCaps(text,combination));
					
				}
		
			
			}
		} catch (Exception e) {
			 System.err.println("Combinations failed "+ text +e.getMessage());
			 e.printStackTrace();
		}
		return set;
	}

	private static String[] getIntialVector(String text) {
		List<String> list = new ArrayList<String>();
		for(int i=0; i< text.split("\\s").length; i++){
			list.add(i+"");
		}
		
		return list.toArray(new String[list.size()]);
	}

	private static String  makeMeCaps(String text, ICombinatoricsVector<String> vector) {

		String[] parts = text.split("\\s");
		int len = text.split("\\s").length;
		StringBuffer buffer = new StringBuffer();
	

		for(int i =0; i< len;i++){
			if(vector.contains(""+i)){
				if(parts[i].trim().length() >0)
				buffer.append(makeFirstCaps(parts[i])); 
			}else{
				if(parts[i].trim().length() >0)
				buffer.append(parts[i].toLowerCase()); 
			}
			buffer.append(" ");
		}
		return buffer.toString().trim();
	}

	private static String makeFirstCaps(String text) {
		if(text.length() >1)
		return Character.toUpperCase(text.charAt(0)) + text.substring(1).toLowerCase();
	    
		return ""+ Character.toUpperCase(text.charAt(0));

	}
	private static String makeAllFirstCaps(String text) {
		String[] parts = text.split("\\s");
		int len = text.split("\\s").length;
		StringBuffer buffer = new StringBuffer();
	

		for(int i =0; i< len;i++){
				if(parts[i].trim().length() >0)
				buffer.append(makeFirstCaps(parts[i])+" "); 
		}
		return buffer.toString().trim();
	}
	private static String makeAllFirstCapsExceptSome(String text) {
		String[] parts = text.split("\\s");
		int len = text.split("\\s").length;
		StringBuffer buffer = new StringBuffer();
	
		Set<String> words = new HashSet<String>();
		words.add("AND");
		words.add("OF");

		for(int i =0; i< len;i++){
				if(parts[i].trim().length() >0 )
				if(words.contains(parts[i].trim().toUpperCase())){
					buffer.append(parts[i].trim().toLowerCase()+" ");
				}
				else
				buffer.append(makeFirstCaps(parts[i])+" "); 
		}
		return buffer.toString().trim();
	}

}
