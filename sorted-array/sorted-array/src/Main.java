import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Integer[] x(Integer[] arr) {
        if (arr.length == 0) {
            return new Integer[0];
        }
        List<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        int lastItem = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (lastItem != arr[i]) {
                lastItem = arr[i];
                result.add(lastItem);
            }
        }
        return result.toArray(Integer[]::new);


    }

    public static void main(String[] args) {
        Integer[] a={1,2,2,2,3,4,4,5};
        x(a);

    }
}