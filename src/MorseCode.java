import java.util.HashMap;

public class MorseCode {

	public static void main(String[] args) {

		System.out.println(morseDecoder(
				".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--"));
	}

	public static HashMap<String, String> morseKeyInit() {
		HashMap<String, String> code = new HashMap<>();

		code.put(".-", "a");
		code.put("-...", "b");
		code.put("-.-.", "c");
		code.put("-..", "d");
		code.put(".", "e");
		code.put("..-.", "f");
		code.put("--.", "g");
		code.put("....", "h");
		code.put("..", "i");
		code.put(".---", "j");
		code.put("-.-", "k");
		code.put(".-..", "l");
		code.put("--", "m");
		code.put("-.", "n");
		code.put("---", "o");
		code.put(".--.", "p");
		code.put("--.-", "q");
		code.put(".-.", "r");
		code.put("...", "s");
		code.put("-", "t");
		code.put("..-", "u");
		code.put("...-", "v");
		code.put(".--", "w");
		code.put("-..-", "x");
		code.put("-.--", "y");
		code.put("--..", "z");
		code.put(".----", "1");
		code.put("..---", "2");
		code.put("...--", "3");
		code.put("....-", "4");
		code.put(".....", "5");
		code.put("-....", "6");
		code.put("--...", "7");
		code.put("---..", "8");
		code.put("----.", "9");
		code.put("-----", "0");
		return code;

	}

	public static String morseDecoder(String input) {
		HashMap<String, String> code = morseKeyInit();
		String phrase = "";
		String[] words = input.split(" / ");

		for (int i = 0; i < words.length; i++) {
			String[] letters = words[i].split(" ");

			for (int j = 0; j < letters.length; j++) {
				phrase += code.get(letters[j]);
				// System.out.print(code.get(letters[j]));
			}

			phrase += " ";
			// System.out.print(" ");
		}

		// System.out.println("");
		return phrase = phrase.substring(0, phrase.length() - 1);
	}

}
