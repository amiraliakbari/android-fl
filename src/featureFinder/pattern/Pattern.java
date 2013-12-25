package featureFinder.pattern;

import java.io.File;

import featureFinder.parser.JParser;

/**
 * 
 * @author Babak
 * @version 1.0
 *
 */
public class Pattern {
	
	private File XmlFile;
	
	JParser parser;
	
	/**
	 * 
	 */
	public Pattern() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 */
	void saveXML()
	{
		
	}
	
	/**
	 * <li><b>getXmlFile</b></li>
	 * <br/><br/>
	 * <code>public File getXmlFile()</code>
	 * <br/><br/>
	 * @return generated XML <code>File</code> object of the pattern
	 */
	public File getXmlFile()
	{
		return XmlFile;
	}
	
}
