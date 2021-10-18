import java.util.Arrays;

public class HarmonikOrtalama {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};
        double harmonic = 0;
        for (int i = 0; i < numbers.length; i++) {
            harmonic += (1/numbers[i]);
        }

        System.out.print("Dizi : ");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Harmonik ortalaması : "+numbers.length / harmonic );
    }
}
