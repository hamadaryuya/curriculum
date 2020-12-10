package check;

import constants.Constants;

public class Check {
	//課題①
	private static String firstName = "濱田";
	private static String lastName = "龍也";
	
	//課題②
	private void printName(String firstName, String lastName) {
		System.out.println("printNameメソッド  → " + firstName + lastName);
	}
	public static void main(String[] args) {
		Check nm = new Check();
		nm.printName(firstName,lastName);
		//課題③
		
		Pet pt = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		pt.introduce();
		rp.introduce();
	}
}

