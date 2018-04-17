package week3day1;

public class PasswordValidation {

	public static void main(String[] args) {

		String pass = "Poii233412399";
		validatePassword(pass);
	}

	private static boolean validatePassword(String password) {
		System.out.println(password.length());
		if(password.length()>10) {
			if(validationType(password)) {
				System.out.println("txstagjh");
				return true;
			}
		}
		else {
			System.err.println("Minimum Length should be 10 digits");
		}
		return false;

	}

	private static boolean validationType(String password) {
		//boolean hasCapitalLetter= false;
		int cnt1=0;
		char temp;
		for(int i=0;i<password.length()-1;i++)
		{
			temp = password.charAt(i);

			if(Character.isAlphabetic(temp))
				cnt1++;
		}
		if(cnt1>2)

		{System.out.println("Has more than two digits and condition satidfied");}
		return false;
	}

}

	