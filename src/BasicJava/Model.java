package BasicJava;

public class Model {
    private StringBuilder sentences = new StringBuilder();

    public String getSentence() {
        return sentences.toString();
    }
    public void append(String word){
        sentences.append(word);
        if(word.equals("Hello")){
            sentences.append(" ");
        }
    }
}
