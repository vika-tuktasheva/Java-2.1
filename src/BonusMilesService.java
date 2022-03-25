public class BonusMilesService {
    public int calculate(int price) {
        int amountOfRubles = 20;
        int miles = price / amountOfRubles;
        return miles;
    }
}
