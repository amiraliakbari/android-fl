package featureFinder.parser;

import java.io.File;

/**
 * 
 * @author Babak
 * @version 1.0
 * 
 */
public class JTokenizer {

	final File file;

	/**
	 * 
	 * @param filePath
	 */
	public JTokenizer(String filePath) {
		// TODO maybe there is still more to do with the constructor
		file = new File(filePath);
	}

	/**
	 * 
	 * @return next token of the given file.
	 */
	public String nextToken() {
		// TODO
		return "";
	}

	/**
	 * 
	 * @return true if there is another token, false if there is not.
	 */
	public boolean haveNext() {
		// TODO
		return false;
	}

}
