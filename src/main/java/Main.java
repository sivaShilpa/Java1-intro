import java.util.*;

public class Main {

    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
//        ex4();
//        ex5();
//        ex6();
//        ex7();
        ex8();
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

        int[] ints = {0,1,1,1,0,0,1,0,0,1,0,0,0};
        String output = "";

        ArrayList<Integer> ones = new ArrayList<>();
        ArrayList<Integer> zeros = new ArrayList<>();
        ArrayList<Integer> input = new ArrayList<>();

        for(int i = 0; i < ints.length; i++){
            input.add(ints[i]);
        }

        for(int i : input){
            if(i == 0){
                zeros.add(i);
            }
            else{
                ones.add(i);
            }
        }

        for(int i : zeros){
            output += i;
        }

        for(int i : ones){
            output += i;
        }

        System.out.println(output);
    }

    private static void ex7() {
        ArrayList<Integer> someArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter some numbers: ");

        while(scanner.hasNextInt()){
            num = Integer.parseInt(scanner.next());

            if(!Character.isLetter(num)){
                someArray.add(num);
            }
            else{
                break;
            }
        }

        System.out.println(randomNumberGenerator(someArray));
    }

    private static int randomNumberGenerator(ArrayList<Integer> someArray) {
        int randomIndex;
        int randomNumber;
        Random random = new Random();

        randomIndex = random.nextInt(someArray.size());
        randomNumber = someArray.get(randomIndex);

        return randomNumber;
    }

    private static void ex8() {
        ArrayList<Float> shoppingCart = new ArrayList<>();
        float sum = 0.00F;
        float TAX = 10/100;
        float shipAndHandle = 0.00F;
        Scanner scanner = new Scanner(System.in);
        float eachItem = 0.00F;

        System.out.println("Enter a few item prices for the shopping cart:");

        while(scanner.hasNextFloat()){
            eachItem = scanner.nextFloat();

            if(!Character.isLetter((char) eachItem)){
                shoppingCart.add(eachItem);
            }
            else{
                break;
            }
        }

        for(int i = 0; i < shoppingCart.size(); i++){
            sum += shoppingCart.get(i);
        }
        sum += sum*TAX;

        if(sum < 10.00){
            sum += 5.00;
        }
        else if(sum > 10.00 && sum < 20.00){
            sum += 4.00;
        }

        System.out.println("the total is: " + sum);
    }

    private static void ex9() {
    }

    private static void ex10() {
    }
}
