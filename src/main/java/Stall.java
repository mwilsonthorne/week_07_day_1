public abstract class Stall implements IChargeable, IEnjoyable {

    private String name;
    private String owner_name;
    private int parking_spot;
    private int funRating;

    public Stall(String name, String owner_name, int parking_spot, int funRating){
        this.name = name;
        this.owner_name = owner_name;
        this.parking_spot = parking_spot;
        this.funRating = funRating;
    }

    public double priceFor(Visitor visitor){
        return 20;
    }

    public String getName() {
        return this.name;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public int getParking_spot() {
        return parking_spot;
    }

    public int getFunRating() {
        return funRating;
    }
}

