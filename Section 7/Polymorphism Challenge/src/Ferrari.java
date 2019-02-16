class Ferrari extends Car {
    public Ferrari(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Ferrari -> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("Ferrari -> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("Ferrari -> brake()");
    }
}