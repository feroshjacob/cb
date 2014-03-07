package cb.utils;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;


public class RandomizeFile  {
	public static void main(String[] args) throws IOException {
		String fileName ="/Users/fjacob/projects/schools/results/1-6.txt";
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String line =reader.readLine();
		List<String> lines = new ArrayList<String>();
		while(line!=null){
			lines.add(line);
			line = reader.readLine();
		}
		reader.close();
		writeRandomLines(lines, 800, args[1]);
	}

	private static void writeRandomLines(List<String> lines, int length, String fileName) throws IOException {

	    Random generator = new Random();
	   BufferedWriter writer = new BufferedWriter(new FileWriter(new File(fileName), false));
	    for(int i=0;i<length;i++){
	    	//System.out.println(i+")"+lines.get(generator.nextInt(length)));
	    	int index=generator.nextInt(length);
	    	writer.write(lines.get(index)+"\n");
	    	lines.remove(index);
	    }
	    writer.close();
		
	}

}