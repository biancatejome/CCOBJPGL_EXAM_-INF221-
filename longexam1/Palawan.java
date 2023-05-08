public class Palawan implements Locations {

    int airFare = 150;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }

    public int getAirFare(){
        return airFare;
    }
}