package cb.utils;


import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public class CommandLineOptions {
	

	public static final String OPTION_VERIFY_FLAG = "verifyFile";
	public static final String OPTION_ALGORITHM_FLAG = "a";
	public static final String OPTION_DB_FLAG = "dbFile";
	public static final String OPTION_INPUT_FLAG = "input";
	public static final String OPTION_CLASSIFIER_PATH="c";
	
	public static final String OPTION_TYPE="type";
	public static final String OPTION_VERBOSE_FLAG = "v";
	public static final String OPTION_HELP_FLAG = "h";
	public static final String OPTION_LUCENE_INDEX_LOCATION = "l";
	public static final String OPTION_SCORE_THRESHOLD="t";
	
	

	public static Options getOptions () {

		// create the Options
		Options options = new Options();
		options.addOption(OPTION_INPUT_FLAG, true, "Input File");
		options.addOption(OPTION_DB_FLAG, true, "Db File");
		options.addOption(OPTION_ALGORITHM_FLAG, true, "Algorithm Index");		
		options.addOption(OPTION_VERIFY_FLAG, true, "Verify file");		
	
		options.addOption(OPTION_VERBOSE_FLAG, false, "Verbose ");		

		options.addOption(OPTION_INPUT_FLAG, true, "Input File");
		options.addOption(OPTION_CLASSIFIER_PATH, true, "Classifier Path");
		options.addOption(OPTION_LUCENE_INDEX_LOCATION, true, "Lucene Index Path");
		options.addOption(OPTION_TYPE, true, "Type of Service");
		options.addOption(OPTION_SCORE_THRESHOLD, true, "Scoring threshold");		
		options.addOption(OPTION_HELP_FLAG, false, "Help");
		return options;
	}

}
