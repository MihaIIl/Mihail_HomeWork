package BasicJava;

public class Model {
    private StringBuilder sentences = new StringBuilder();

    public Model() {
    }

    public String getSentence() {
        return this.sentences.toString();
    }

    public void append(String word) {
        this.sentences.append(word);
        if (word.equals("Hello")) {
            this.sentences.append(" ");
        }

    }
}
