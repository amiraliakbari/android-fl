package featureFinder.parser;

/**
 * 
 * @author Babak
 * @version 1.0
 * 
 */
public class JParser {
	
	final JTokenizer tokenizer;
	
	/**
	 * this class is used to simply parse the java files.
	 * @param filePath
	 */
	public JParser(String filePath) {
		tokenizer = new JTokenizer(filePath);
	}
}
