public class Playground extends Attraction implements IRestrictable {

    public Playground(String name, int funRating){
        super(name, funRating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() < 16){
            return true;
        } else {
            return false;
        }
    }





}
