public class WicketKeeper implements Player,Keeper{
    @Override
    public void bat() {
        System.out.println("WicketKeeper is Batting");
    }

    @Override
    public void keepWicket() {
        System.out.println("WicketKeeper is WicketKeeping");
    }
}
