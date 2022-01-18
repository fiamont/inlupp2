public abstract class Animal {
    protected int age;
    protected int weight;
    protected String name;
    protected boolean hungry;

    public Animal(int age, int weight, String name, boolean hungry) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.hungry = hungry;
    }

    public abstract boolean eat(Object food);

}
