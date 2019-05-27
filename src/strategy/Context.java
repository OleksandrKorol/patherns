package strategy;

class Context {
    private Transport strategy;

    void setTransport(Transport strategy) {
        this.strategy = strategy;
    }

    String executeTransport(String a) {
        return strategy.drive(a);
    }
}