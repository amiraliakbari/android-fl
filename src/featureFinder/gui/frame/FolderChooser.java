package featureFinder.gui.frame;

import javax.swing.JFileChooser;

/**
 * 
 * @author Babak
 * @version 1.1
 *
 */
public class FolderChooser extends JFileChooser{
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public FolderChooser() {
		super();
		setDialogTitle("Choose the parent directory:");
		setCurrentDirectory(new java.io.File("."));
	    setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	    setAcceptAllFileFilterUsed(false);
	}
	
//	public static void main(String[] args) {
//		FolderChooser fc = new FolderChooser();
//		fc.showOpenDialog(null);
//	}

}
