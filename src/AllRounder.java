public class AllRounder implements Player,Bowler,Fielder{
    @Override
    public void bat() {
        System.out.println("AllRounder is Batting");
    }

    @Override
    public void field() {
        System.out.println("Allrounder is Fielding");
    }

    @Override
    public void bowl() {
        System.out.println("Allrounder is Bowling");
    }
}
