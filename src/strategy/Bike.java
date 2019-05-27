package strategy;

class Bike implements Transport {

    @Override
    public String drive(String s) {
        return s +" drive";
    }
}