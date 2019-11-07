public class InvertString {

    public static void main(String[] args) {

	String phrase = args[0]; //read input from terminal
	String words[] = phrase.split(" ");
	int l = words.length;

	for (int i = 0; i < l; i++){
	    System.out.println(words[l-i] + " ");
	}
    }
}
