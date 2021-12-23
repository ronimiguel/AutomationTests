package methods;

public class OsChecker {
	String os;
	public String OsName() {
		String getOsName = System.getProperty("os.name");

		if (getOsName.toLowerCase().contains("linux")) {
			this.os = "linux";

		} else if (getOsName.toLowerCase().contains("windows")) {
			this.os = "windows";

		} else {
			System.out.println("Only Windows and Linux supported");
			this.os = "O.S. not supported";
		}
		return this.os;
	}
}
