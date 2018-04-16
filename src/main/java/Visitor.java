public class Visitor {

    private int age;
    private int height_cm;
    private int money;

    public Visitor(int age, int height_cm, int money){
        this.age = age;
        this.height_cm = height_cm;
        this.money = money;

    }

    public int getAge() {
        return this.age;
    }

    public int getHeight(){
        return this.height_cm;
    }

    public int getMoney(){
        return this.money;
    }
}
