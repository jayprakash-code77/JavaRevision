package DesignPatterns.StrategyDesign;

public class Application {
    public static void main(String[] args) {
        double packageWeight = 10;
        String userSelectedMethod = "EXPRESS"; // This would come from user input

        // The conditional logic for choosing the strategy is now here.
        // This could be encapsulated in a Factory class for even cleaner separation.
        ShippingStrategy strategy;
        switch (userSelectedMethod) {
            case "STANDARD" -> strategy = new StandardShipping();
            case "EXPRESS" -> strategy = new ExpressShipping();
            case "OVERNIGHT" -> strategy = new OvernightShipping();
            case "INTERNATIONAL" -> strategy = new InternationalShipping();
            default -> throw new IllegalArgumentException("Unknown method");
        }

        // Inject the chosen strategy into the context
        ShippingCalculator calculator = new ShippingCalculator(strategy);
        double cost = calculator.executeCalculation(packageWeight);
        System.out.println("Shipping cost: " + cost);
    }
}
