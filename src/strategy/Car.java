package strategy;

class Car implements Transport {

    @Override
    public String drive(String s) {
        return s + " drive";
    }
}
