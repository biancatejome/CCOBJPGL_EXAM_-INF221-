public class Cebu implements Locations {

    int airFare = 200;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }

    public int getAirFare(){
        return airFare;
    }
}