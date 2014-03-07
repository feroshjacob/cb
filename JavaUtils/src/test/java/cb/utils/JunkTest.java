package cb.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class JunkTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("/Users/fjacob/git/JobClassifier/raw/params.ini"));

        String vector_location = props.getProperty("vector_location");
        String newLexicon = props.getProperty("new_lexicon_file");

        boolean compact = "true".equals(props
                .getProperty("compact.attribute.nums"));

        String format = props.getProperty("format");

   
        String weightingScheme = props.getProperty(
                "classification_weight_scheme", "tfidf");
        
        System.out.println("T"+weightingScheme+"Hola");

	}

}
