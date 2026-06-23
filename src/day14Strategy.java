
    @Override
    public double apply(double fee) {
        // 30% discount
        return fee * 0.7;
    }
}

class NoDiscount implements DiscountStrategy {

    @Override
    public double apply(double fee) {
        return fee;
    }
}

class FeeCalculator {

    private DiscountStrategy discountStrategy;

    public FeeCalculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double finalFee(double fee) {
        return discountStrategy.apply(fee);
    }
}