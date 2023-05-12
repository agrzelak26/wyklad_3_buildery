public class Main {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Oven oven = new Oven();
        Person alice = new Person("Alice");
        Lettuce lettuce = new Lettuce();
        alice.eat(chicken);
        //Chicken chicken2 = (Chicken) new chicken.clone();
        Chicken chicken2 = chicken;
        oven.cook(chicken);
        alice.eat(chicken);
        alice.eat(lettuce);

        VeganPerson bob = new VeganPerson("Bob");
        bob.eat(lettuce);
        bob.eat(chicken);

        Person charlie = new Person("Charlie");
        charlie.eat(chicken2);
        charlie = null;

        Cake cake = new Cake.Builder()
            .flour(20)
            .berry()
            .sugar(5)
            .build();

        alice.eat(cake);
    }
}