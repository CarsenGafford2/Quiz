public class QuizGame {
    
    public QuizGame() {

    }

    public boolean choice(AnswerButton[] Array, int chosenIndex) {
        if (!(chosenIndex > Array.length - 1)) {
            for (int x = 0; x < Array.length; x++) {
                if (Array[x].isCorrect() == true && Array[x] == Array[chosenIndex]) {
                    return true;
                }
            }
        }
        return false;
    }
}
