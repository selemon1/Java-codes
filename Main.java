package Exception;

public class Main {
//    public static void main(String[] args) {
//        try {
//            int[] myNumbers = { 1, 2, 3 };
//            System.out.println(myNumbers[10]);
//
//        } catch (Exception e) {
//            System.out.println("Something went wrong");
//        } finally {
//            System.out.println("The 'try catch' is finished");
//        }
//
//    }
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException(
                    "Access denied - you must be at leat 18 years old.");

        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(20);//Set age to 15 (which is below 18...)
    }

}
