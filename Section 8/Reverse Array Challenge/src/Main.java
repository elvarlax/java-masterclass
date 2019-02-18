public class Main {
    public static void main(String[] args) {
        /*
          Write a method called reverse() with an int array as a parameter.
          The method should not return any value. In other words, the method
          is allowed to modify the array parameter.
    
          In main() test the reverse() method and print the array both reversed
          and non-reversed.

          To reverse the array, you have to swap the elements, so that the first element is
          swapped with the last element and son on.

          For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
        */
        int[] array = {1, 5, 3, 7, 11, 9, 15};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        reverse(array);
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
