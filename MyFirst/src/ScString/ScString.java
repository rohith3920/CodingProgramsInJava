package ScString;

public class ScString {

	public static void main(String[] args) {
			int b = 10110101;
			String c = "AKcsdvcDJD2323";
			String date = "30/09/2000";
			String specialCharacter = "a!B@c#1$2%3";
			String spaces = "asd    adf    rew wewe ";
			String str = String.valueOf(b);
			String str1 = String.valueOf(c);
			String str2 = String.valueOf(date);
			System.out.println(str.matches("[0,1]+"));
			System.out.println(str1.matches("[0-9,A-Z]*"));
			System.out.println(str2.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
			System.out.println(specialCharacter.replaceAll("[^a-zA-Z0-9]",""));
			System.out.println(spaces.replaceAll("\\s+"," "));

	}

}
