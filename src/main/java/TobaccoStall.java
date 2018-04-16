public class TobaccoStall extends Stall implements IRestrictable{

    public TobaccoStall(String name, String owner_name, int parking_spot, int funRating){
        super(name, owner_name, parking_spot, funRating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() > 17){
            return true;
        }
        else {
            return false;
        }
    }
}
