import java.util.Arrays;

public class PirateTranslator {

    String[] phrases = {"hello", "hi", "is", "pardon me", "excuse me",
			"my", "friend", "sir", "madam",
			"stranger", "officer",
			"where", "you", "tell",
			"know", "how far", "old", "happy"};
    String[] piratetalk = {"ahoy", "yo-ho-ho", "be", "avast", "arrr",
			   "me", "me bucko", "matey", "proud beauty",
			   "scurvy dog", "foul blaggart",
			   "whar", "ye", "be tellin'",
			   "be knowin'", "how many leagues",
			   "barnacle-covered", "grog-filled"};

    String[] positiveWords = {"adore", "enjoy", "love"};
    String[] negativeWords = {"hate", "despise", "dislike"};

    String[] lastTranslations = new String[25];
    int s = 0;

    /**
    * _Part 1: Implement this method_
    *
    * Translate the input string and return the resulting string

	 split every word within the input string, check if each word is in english phrase list, if word is in the list
	 take its index, use that index to determine what the word will be replaced with from the pirate talk list
	 with final list generated convert all characters to lowercase


    */

    public String translate(String input) {
		// TODO: implement this

		String[] split = input.split(" ");
		int count = 0;

		for (String i : split) {
			count++;
			String word = phrases[count-1];
			//System.out.println(i);
			System.out.println(count);
			System.out.println(word);
		}



		return input;


	}
 }

