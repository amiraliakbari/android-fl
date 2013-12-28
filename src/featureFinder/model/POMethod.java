package featureFinder.model;

public class POMethod extends SimpleParsedObject {
	private POClass _class;
	
	public POMethod() {
	}
	
	@Override
	public String toString() {
		String s = get_class().toString() + '.' + name;
		return s.replaceFirst("^class:", "method:");
	}
	
	/** Reverse of toString
	 * 
	 * @param str a class identifier, e.g. 'method:a.b.Class.x'
	 */
	public POMethod(String str) {
	}

	public POClass get_class() {
		return _class;
	}

	public void set_class(POClass _class) {
		this._class = _class;
	}
}
