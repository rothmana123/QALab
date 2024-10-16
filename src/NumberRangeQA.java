//Define NumberRangeQA as:
//
// extending QA
//- with integer data members for intAnswer*and range*
//- with a constructor which accepts a question, an answer of type int, and parameter for how close the answer must be.
// The constructor should use super to call QA's constructor.
//- Overriding the*checkAnswer*method of QA so that it checks if the answer is within the specified range.
//- Overriding the*displayQuestion*method of QA. so that when displaying the question, it lets the user know the "within" range.
// The displayQuestion method should call super.displayQuestion, then add the additional part.


public class NumberRangeQA extends QA{
    private int intAnswer;
    private int range;

    public NumberRangeQA(String question, int answer, int range){
        super(question, String.valueOf(answer));
        this.intAnswer = answer;
        this.range=range;
    }
    @Override
    public boolean checkAnswer (String userAnswer) {
        int userAnswerInt = Integer.parseInt(userAnswer);
        return ((userAnswerInt<=intAnswer+range)&&(userAnswerInt>=intAnswer-range));
    }

    public int getRange() {
        return range;
    }

    @Override
    public void displayAnswer() {
        super.displayQuestion();
        System.out.println("The correct answer is:"+ answer+ " with a plus/minus of " + range);
    }


}
