package DesignPatterns.StrategyDesign;

public class ShippingCalculator {
    // Holds a reference to the strategy object (Composition)
    private ShippingStrategy strategy;

    // Constructor Injection: The client specifies the strategy
    public ShippingCalculator(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    // Setter Injection: Allows changing the strategy at runtime
    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    // The method now delegates the work to the strategy.
    // It's simple, stable, and knows nothing about the actual calculation.
    public double executeCalculation(double weight) {
        return strategy.calculateCost(weight);
    }
}