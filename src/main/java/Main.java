import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
//        ex4();
        ex5();
//        ex6();
//        ex7();
//        ex8();
//        ex9();
//        ex10();
    }

    private static void ex1() {
        int[] ints = {1, 2, 3};
        List<Integer> intList = new ArrayList<Integer>(ints.length);
        for (int i : ints)
        {
            intList.add(i);
        }
        System.out.println(addNumbers((ArrayList<Integer>) intList));

    }
    private static Integer addNumbers(ArrayList<Integer> numList) {
        Integer sum = 0;
        for(Integer i : numList){
            sum += i;
        }
        return sum;
    }

    private static void ex2() {
        int[] ints = {1, 2, 3};
        List<Integer> intList = new ArrayList<Integer>(ints.length);
        for (int i : ints)
        {
            intList.add(i);
        }
        System.out.println(avgNumbers((ArrayList<Integer>) intList));
    }
    private static Float avgNumbers(ArrayList<Integer> numList) {
        Integer sum = 0;
        for(Integer i : numList){
            sum += i;
        }
        Float avg = Float.valueOf(sum/numList.size());
        return avg;
    }

    private static void ex3() {
        int[] ints = {1, 2, 3};
        List<Integer> intList = new ArrayList<Integer>(ints.length);
        for (int i : ints)
        {
            intList.add(i);
        }
        doubleNumbers((ArrayList<Integer>) intList);
    }
    private static void doubleNumbers(ArrayList<Integer> numList){
        ArrayList<Integer> doubles = new ArrayList<>();
        for(Integer i : numList){
            doubles.add(i*2);
        }
        System.out.println(doubles);
    }

    private static void ex4() {
        System.out.println(createList(5));
    }
    private static ArrayList<Integer> createList(Integer maxNumber){
        ArrayList<Integer> newArray = new ArrayList<>();
        for(int i = 1; i <= maxNumber; i++){
            newArray.add(i);
        }
        return newArray;
    }

    private static void ex5() {
        int[] ints = {1, 2, 3, 5, 6, 9, 11};
        var missingNumbers = findMissingNumbers(ints);
        System.out.println(missingNumbers);
    }

    private static String findMissingNumbers(int[] ints) {

        String output = "";
        int firstNum = ints[0];
        int lastNum = ints[ints.length-1];
        ArrayList<Integer> input = new ArrayList<>();

        for(int i = 0; i < ints.length; i++){
            input.add(ints[i]);
        }

        for(int j = firstNum; j < lastNum; j++){
            if(!input.contains(j)){
                output += j + ", ";
            }
        }

        return output;
    }

    private static void ex6() {
    }

    private static void ex7() {
    }

    private static void ex8() {
    }

    private static void ex9() {
    }

    private static void ex10() {
    }
}