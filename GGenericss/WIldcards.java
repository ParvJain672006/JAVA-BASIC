package GGenericss;

import java.util.List;

public class WIldcards {

    public void PrintList(List<?> mylist) {
        for (Object item : mylist) {
            System.out.println(item);
        }
    }

    public double sumList(List<? extends Number> mylist) {
        double sum = 0.0;
        for (Number num : mylist) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public class One {
        public static void main(String[] args) {

            // in the List i have predefined ki list data structure mei konse elements aakr
            // store honge
            // woh sbhi ke sbhi numbers hone wale hai - they cn be float, integer, double
            // but not string, bool, char

        }
    }
}
