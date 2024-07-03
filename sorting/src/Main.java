
public class Main {

    public static void main(String[] args) {

        int[] array = new int[] { 4, 1, 3, 2, 5, 10, 6, 7, 9, 8 };

        insertionSort(array);

        for(int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }

    private static void insertionSort(int[] array) {

        // loop through the entire array
        for (int i = 0; i < array.length; i++) {

            int check = array[i];
            int j = i - 1;

            // loop through the previously looked at numbers
            while(j >= 0 && check < array[j]) {

                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = check;
        }
    }

    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int smallest = i;

            for(int j = i + 1; j < array.length; j++) {

                if(array[j] < array[smallest]) {

                    smallest = j;
                }
            }

            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
    }
}