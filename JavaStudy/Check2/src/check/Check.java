package check;

public class Check {
	
	private static String firstName = "濱田";
	private static String lastName = "龍也";
	
	private void printName(String firstName, String lastName) {
		String sumName = firstName + lastName;
		System.out.println("printNameメソッド  → " + sumName);
	}
	
	public static void main(String[] args) {
		Check nm = new Check();
		nm.printName(firstName,lastName);
	}
	
	
}
