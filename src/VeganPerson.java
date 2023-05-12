public class VeganPerson extends Person{
    public VeganPerson(String name){
        super(name);
    }
    public void eat(Food food){
        if(food instanceof VeganFood)
            super.eat(food);
        else
            System.out.println(getName() + " refuses to eat " + food + " .");
    }
}
