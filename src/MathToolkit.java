
public class MathToolkit {
    public static void main(String[] args) {

        // 1. Hypotenuse of legs 6 and 8
        double hypotenuse = Math.sqrt(Math.pow(6, 2) + Math.pow(8, 2));
        System.out.println("Hypotenuse: " + hypotenuse);

        // 2. Distance between (1, 2) and (4, 6)
        double distance = Math.sqrt(Math.pow(4 - 1, 2) + Math.pow(6 - 2, 2));
        System.out.println("Distance: " + distance);

        // 3. Absolute differences
        System.out.println("Difference 1: " + Math.abs(12 - 30));
        System.out.println("Difference 2: " + Math.abs(7.5 - 9.25));

        // 4. Random capital letter
        char letter = (char) ('A' + (int) (Math.random() * 26));
        System.out.println("Random capital: " + letter);

        // 5. Random year from 1990 to 2010 inclusive
        // n = 21 (number of possible years)
        // min = 1990 (smallest possible year)
        int n = 21;
        int min = 1990;
        int year = min + (int) (Math.random() * n);
        System.out.println("Random year: " + year);
    }
}
