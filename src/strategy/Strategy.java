package strategy;

class Strategy {
    public static void main(String[] args) {
        Context context = new Context();
        String action = "Car";

        if (action.equals("Car"))
            context.setTransport(new Car());

        if (action.equals("Bike"))
            context.setTransport(new Bike());

        String result = context.executeTransport("Lada");
        System.out.println(result);
    }
}