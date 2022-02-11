package L9Z5;

public class BubbleSort {
    public static void main(String[] args) {
        int[] test = {9, 5, 2, 7, 1};

        bubbleSort(test);
        for (int a = 0; a < test.length; a++) {
            System.out.print(test[a] + " ");
        }
    }

    public static void bubbleSort(int[] tab) {
        int tmp;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    tmp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = tmp;
                }

            }
        }

    }
}
