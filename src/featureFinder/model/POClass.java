package featureFinder.model;

public class POClass extends SimpleParsedObject {
	private String _package;
	
	public POClass() {
	}
	
	@Override
	public String toString() {
		String p = _package;
		if (!p.isEmpty())
			p += '.';
		return "class:" + p + name;
	}
	
	/** Reverse of toString
	 * 
	 * @param str a class identifier, e.g. 'class:a.b.Class'
	 */
	public POClass(String str) {
		String[] p = str.split("[:.]");
		if (p.length < 2 || !p[0].equals("class")) {
			throw new IllegalArgumentException();
		}
		name = p[p.length - 1];
		_package = str.substring(6, str.lastIndexOf('.'));
	}
}
