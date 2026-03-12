public class prg4 {
    static void checkAge(int age) {
        if (age < 18)
            throw new ArithmeticException("Not eligible");
        else
            System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        checkAge(16);
    }
}
