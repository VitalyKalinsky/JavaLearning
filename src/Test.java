import java.util.Arrays;

public class Test {
    static int[] array = { 1, 4, 7, 3, 5, 6, 2, 8, 9, 0 };

    public static void main(String[] args) {
        System.out.println(Arrays.toString(array));
        del(array, 3);
        addIn(array, 3, 3);
        System.out.println(Arrays.toString(array));
    }

    static int search(int[] arr, int el) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el)
                return i;
        }
        return -1;
    }

    static void del(int[] arr, int el) {
        int index = search(arr, el);
        arr[index] = 0;
        try {
            for (int i = index; i < arr.length; i++) {
                arr[i] = arr[i + 1];
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }

    static void addIn(int[] arr, int el, int index) {
        for (int i = arr.length - 1; i > index; i--) {
            System.out.println(Arrays.toString(arr));
            System.out.println("yes");
            arr[i] = arr[i - 1];
        }
        arr[index] = el;
    }

    static int get(int[] arr, int index) {
        return arr[index];
    }
}
