import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LingAnalysis {
	public static void main(String[] args) {
		Path source = Paths.get("corpora/tester.txt");
		Path output = Paths.get("generated.txt");
		
		Map<String, Integer> freq = frequencyDist(source);
		System.out.println(freq);
	}

	/*
	 * this should make a string of length words.
	 * 
	 * pick a first word from the keyset of gram
	 * repeat length times:
	 *    get the list associated with the word
	 *    replace word with a random pick from that list
	 *    add that word to the file
	 */
	static void generate(Map<String, List<String>> gram, int length, Path out) {
		try {
			BufferedWriter file = Files.newBufferedWriter(out, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
			file.write("hello ");
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * this map should be from word length, to the number of words with that length.
	 * 
	 * for example, the output for tester.txt should be:
	 * {3=2, 5=1, 7=2} 
	 * in other words, there are two words of size three, one word of size 5, and two words of size 7
	 * 
	 */
	static Map<Integer, Integer> wordLengths(Path p) {
		return null;
	}
	
	/*
	 * This map should be from every word in the text to a list of words that can follow it.
	 * There should be multiple copies of the following words if they repeat in the text
	 * 
	 * the correct output for tester should be:
	 * 
	 * {two=[three], one=[two], testing=[testing, one]}
	 * 
	 * for each word:
	 *   if the previous word is not in the map, add it to the map with an empty list
	 *   get the previous word's list from the map, add the current word.	 * 
	 */
	static Map<String, List<String>> bigram(Path p) {
		return null;
	}

	/*
	 * this map should be from every word to the frequency in the text
	 * 
	 * for each word:
	 *   if the word is in the map, increment the value by one
	 *   if the word is not in the map, add the word with a value of one.
	 */
	static Map<String, Integer> frequencyDist(Path p) {
		Map<String, Integer> freq = new HashMap<String, Integer>();
		
		try {
			BufferedReader br = Files.newBufferedReader(p, StandardCharsets.UTF_8);
			
			for(String line = br.readLine(); line!=null; line = br.readLine()) {
				System.out.println(line);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}























