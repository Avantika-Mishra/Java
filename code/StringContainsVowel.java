public class StringContainsVowel {

	public static void main(String[] args) {

		System.out.println(stringContainsVowel("Hello"));//true
		System.out.println(stringContainsVowel("Dry"));//false
	}
	
	public static boolean stringContainsVowel(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}

}
