class Bugatti extends Car {
    public Bugatti(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Bugatti -> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("Bugatti -> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("Bugatti -> brake()");
    }
}