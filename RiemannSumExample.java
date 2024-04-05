public class RiemannSumExample {

    // Function to integrate
    public static double f(double x) {
        return x * x; // Example function: f(x) = x^2
    }

    // Method to approximate the area under the curve using a Riemann sum
    public static double riemannSum(int intervals) {
        double area = 0.0;
        double delta = 1.0 / intervals; // Width of each interval
        for (int i = 0; i < intervals; i++) {
            double x = i * delta;
            area += f(x) * delta; // Height * width for each rectangle
        }
        return area;
    }

    public static void main(String[] args) {
        int intervals = 1000; // Number of intervals to use
        double approximateArea = riemannSum(intervals);
        System.out.println("Approximate area under the curve: " + approximateArea);
    }
}
