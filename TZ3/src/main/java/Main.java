public class Main {
    public static void main(String[] args) {
    int[] wholeNumbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int i=0; i<wholeNumbers.length; i++) {
        if (wholeNumbers[i] % 2 == 0) {
            System.out.println("Четное число "+wholeNumbers[i]);
        }
    }
    }
                }