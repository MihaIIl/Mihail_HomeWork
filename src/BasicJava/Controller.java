package BasicJava;

import java.io.IOException;
import java.util.Scanner;

public class Controller implements words {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.model = model;
        this.view = view;
    }

    public void startProcess() throws IOException {
        Scanner scanner1 = new Scanner(System.in);
        String word1;

        while (!(word1 = scanner1.nextLine()).equals("Hello")) {
            view.printMistake(NOT_THAT_WORD);
        }
        model.append(word1);
        String word2;
        while (!(word2 = scanner1.nextLine()).equals("world!")) {
            view.printMistake(NOT_THAT_WORD);
        }
        model.append(word2);

        view.printResult(model.getSentence());
    }

}


