class Lamborghini extends Car {
    public Lamborghini(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Lamborghini -> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("Lamborghini -> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("Lamborghini -> brake()");
    }
}