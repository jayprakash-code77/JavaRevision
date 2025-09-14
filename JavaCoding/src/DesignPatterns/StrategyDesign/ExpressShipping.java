package DesignPatterns.StrategyDesign;
import DesignPatterns.StrategyDesign.ShippingStrategy;

// Concrete Strategy B
class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculateCost(double weight) {
        return weight * 5.0 + 10;
    }
}