class Panagram {

	// Check if the input is pangram or not. (A pangram is a sentence that contains
	// all the alphabets from A to Z)

	public static boolean containAllLetters(String string) {

		string = string.toLowerCase();
		boolean allLetterPresent = true;

		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!string.contains(String.valueOf(ch))) {
				allLetterPresent = false;
				break;
			}
		}

		return allLetterPresent;
	}

	public static void main(String[] args) {
		String string = "Abcdefghijklmnopqrstuvwxyz12";

		boolean result = containAllLetters(string);

		if (result == true)
			System.out.println("Pangram String");
		else
			System.out.println("Not a Pangram String");

	}
}
