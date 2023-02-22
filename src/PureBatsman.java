public class PureBatsman implements Player, Fielder {
    @Override
    public void bat() {
        System.out.println("PureBatsman is Batting");
    }

    @Override
    public void field() {
        System.out.println("PureBatsman is Fielding");
    }
}
