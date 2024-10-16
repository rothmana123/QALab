import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    public static void main(String args[]) {
        // create an object of superclass (QA) and use it
        QA qa = new QA("How many states are there?", "50");
        qa.displayQuestion();
        // create an object of subclass and use it.
        ArrayList<String> choices = new ArrayList<String>();
        choices.add("a. Sacramento");
        choices.add("b. San Francisco");
        QA cqa = new ChoiceQA("What is the capital of California?", "a", choices);
        cqa.displayQuestion();
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (cqa.checkAnswer(answer)) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
            cqa.displayAnswer();
        }
        QA nrqa = new NumberRangeQA("How old is David Wolber", 50, 3);
        nrqa.displayQuestion();
        answer = scanner.next();
        if (nrqa.checkAnswer(answer)) {
            System.out.println("your answer is within the range of " + + ((NumberRangeQA) nrqa).getRange());
        } else {
            System.out.println("incorrect");
            nrqa.displayAnswer();
        }


    }
}
