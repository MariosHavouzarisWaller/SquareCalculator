public class SquareCalculator {

    // This exercise is approached with the assumption that width is w, height is h, perimeter is P and area is A in the necessary formulas
    public static void main(String[] args) {
        // Declare variables
        double width = 13.5;
        double height = 25.3;
        double perimeter = (height + width) * 2;    // Uses the formula P = 2(h + w)
        double area = height * width;   // Uses the formula A = hw

        // Outputs
        System.out.println("Width: " + width + " Height: " + height);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
