package task_2;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("This","is","a","list","of","random","words");
		String oneLine=words.stream().reduce((word1, word2)->word1+" "+word2).orElse("");
		System.out.println("List of words: "+words);
		System.out.println("A sentence of these words: "+oneLine+".");
	}
}
