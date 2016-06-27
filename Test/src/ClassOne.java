
public class ClassOne implements Tall {

	public boolean isInteger(String a) {
		boolean ret = false;
		try {

			System.out.println(Integer.parseInt(a) + " is not an integer");
			ret = true;

		} catch (Exception e) {
			System.out.println(e + " is not an integer");
			ret = false;
		}
		return ret;
	}

	public static void main(String[] args) {
		System.out.println(System.getProperty("java.runtime.version"));
		ClassOne prog = new ClassOne();
		System.out.println(prog.isInteger("a"));
		System.out.println(prog.isInteger("1"));
		System.out.println(prog.isInteger("1.3"));

	}

}