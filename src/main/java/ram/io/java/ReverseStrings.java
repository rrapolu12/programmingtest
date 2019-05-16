package ram.io.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStrings {

    public static void main(String[] args) {
        reverse_bytes_lambda(Arrays.asList(1, 2, 3));
    }

    public static void reverse_bytes_lambda(List<Integer> numbers) {

        String numbersToBinaryStrings = numbers.stream()
                        .map(number -> String.format("%8s", Integer.toBinaryString(number)).replace(" ", "0"))
                        .collect(Collectors.joining(""));
        System.out.println(numbersToBinaryStrings);
        String reversedBinaryString = new StringBuilder(numbersToBinaryStrings).reverse().toString();
        System.out.println(reversedBinaryString);
        List<Integer> reversedByteNumbers = new ArrayList<Integer>();
        for (int i = 0; i < reversedBinaryString.length(); i += 8) {
            reversedByteNumbers.add(Integer.parseInt(reversedBinaryString.substring(i, i + 8), 2));
        }
        System.out.println(reversedByteNumbers);
    }



}
