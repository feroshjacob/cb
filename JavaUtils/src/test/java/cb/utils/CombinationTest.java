package cb.utils;

import java.util.Set;

public class CombinationTest {
	
	public static void main(String[] args) {
		Set<String> set = CombinationUtils.getAllCombinations("World is such a small ");
		for(String str:set){
			System.out.println(str);
		}
		System.out.println("size:"+set.size());
	}
	



}
