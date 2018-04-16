public class Dodgems extends Attraction implements IChargeable {


    public Dodgems(String name, int funRating){
        super(name, funRating);
    }

    public double priceFor(Visitor visitor){
        if(visitor.getAge() < 12){
            return 5.50;
        }
        else {
            return 11.00;
        }
    }


}
