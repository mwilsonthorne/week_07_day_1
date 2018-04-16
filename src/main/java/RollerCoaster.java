public class RollerCoaster extends Attraction implements IRestrictable, IChargeable {

    public RollerCoaster(String name, int funRating){
        super(name, funRating);
    }

    public boolean isAllowedTo(Visitor visitor){
        boolean result;
        if(visitor.getHeight() > 145  && visitor.getAge() > 12 ){
            result = true;
        }
        else {
            result = false;
        }

        return result;
    }

    public double priceFor(Visitor visitor){
        if(visitor.getAge() < 12){
            return 7.50;
        }
        else {
            return 15.00;
        }
    }



}
