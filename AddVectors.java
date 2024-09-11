import java.util.Arrays;

public class AddVectors {
    interface Vector {
        int[] add(int x1, int y1, int x2, int y2);
    }

    public static void main(String[] args) {
        Vector instance = (x1, y1, x2, y2) -> {
            int[] out = { (x1 + x2), (y1 + y2) };
            return out;
        };

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(Arrays.toString(instance.add(i, j, i + 1, j + 1)));
            }
        }
    }
}
