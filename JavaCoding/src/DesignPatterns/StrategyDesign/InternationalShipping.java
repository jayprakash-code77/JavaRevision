package DesignPatterns.StrategyDesign;

// Concrete Strategy D
class InternationalShipping implements ShippingStrategy {
    @Override
    public double calculateCost(double weight) {
        return (weight * 12.0) * 1.2;
    }
}