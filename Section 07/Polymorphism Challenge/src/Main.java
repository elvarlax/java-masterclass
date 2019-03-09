public class Main {
    public static void main(String[] args) {
        /*
        We are going to go back to the car analogy.
        Create a base class called Car
        It should have a few fields that would be appropriate for a generice car calss.
        engine, cylinders, wheels, etc.
        Constructor should initialize cylinders (number of) and name, and set wheels to 4
        and engine to true. Cylinders and names would be passed parameters.
        Create appropriate getters
        Create some methods like startEngine, accelerate, and brake
        show a message for each in the base class
        Now create 3 sub classes for your favorite vehicles.
        Override the appropriate methods to demonstrate polymorphism in use.
        put all classes in the one java file (this one).
         */
        Bugatti bugatti = new Bugatti("Bugatti Chiron", 16);
        Lamborghini lamborghini = new Lamborghini("Lamborghini Aventador", 12);
        Ferrari ferrari = new Ferrari("LaFerrari", 12);

        System.out.println(bugatti.getName());
        System.out.println(bugatti.getCylinders());
        bugatti.startEngine();
        bugatti.accelerate();
        bugatti.brake();

        System.out.println(lamborghini.getName());
        System.out.println(lamborghini.getCylinders());
        lamborghini.startEngine();
        lamborghini.accelerate();
        lamborghini.brake();

        System.out.println(ferrari.getName());
        System.out.println(ferrari.getCylinders());
        ferrari.startEngine();
        ferrari.accelerate();
        ferrari.brake();
    }
}
