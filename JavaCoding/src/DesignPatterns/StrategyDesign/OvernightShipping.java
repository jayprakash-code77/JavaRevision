package DesignPatterns.StrategyDesign;

// Concrete Strategy C
class OvernightShipping implements ShippingStrategy {
    @Override
    public double calculateCost(double weight) {
        return weight * 8.0 + 25;
    }
}