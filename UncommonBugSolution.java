public class UncommonBugSolution {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i != 5) {
                System.out.println(i);
            }
        }
    }
}
//The use of a for loop clarifies the intention and makes the code more readable and less prone to misinterpretations related to the continue statement's behavior.