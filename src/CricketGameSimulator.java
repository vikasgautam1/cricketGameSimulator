import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

public class CricketGameSimulator {

    private final List<PureBatsman> pureBatsman;
    private final List<AllRounder> allRounder;
    private final WicketKeeper wicketKeeper;
    private final CricketGameHelper cricketGameHelper;
    public CricketGameSimulator(CricketGameHelper cricketGameHelper, List<PureBatsman> pureBatsman, List<AllRounder> allRounder, WicketKeeper wicketKeeper){
        this.cricketGameHelper = cricketGameHelper;
        this.pureBatsman = pureBatsman;
        this.allRounder = allRounder;
        this.wicketKeeper = wicketKeeper;
    }

    public void simulate(){
        System.out.println("Simulation Started...");
        startBatting();
        startBowling();
        startFielding();
        startWicketKeeping();
        System.out.println("Simulation Ended...");
    }

    private void startBatting(){
        for(int i = 0; i < pureBatsman.size(); i++)
            cricketGameHelper.bat(pureBatsman.get(i));

        for(int i = 0; i < allRounder.size(); i++)
            cricketGameHelper.bat(allRounder.get(i));

        cricketGameHelper.bat(wicketKeeper);
    }

    private void startBowling(){
        for(int i = 0; i < allRounder.size(); i++){
            cricketGameHelper.bowl(allRounder.get(i));
        }
    }
    private void startFielding(){
        for(int i = 0; i < pureBatsman.size(); i++){
            cricketGameHelper.field(pureBatsman.get(i));
        }
        for(int i = 0; i < allRounder.size(); i++) {
            cricketGameHelper.field(allRounder.get(i));
        }

    }

    private void startWicketKeeping(){
        cricketGameHelper.keepWicket(wicketKeeper);
    }

    public static void main(String[] args) {
        List<PureBatsman> pureBatsman = Arrays.asList(new PureBatsman(), new PureBatsman(), new PureBatsman(), new PureBatsman());
        List<AllRounder> allRounder = Arrays.asList(new AllRounder(), new AllRounder(), new AllRounder(),new AllRounder(), new AllRounder(), new AllRounder());
        WicketKeeper wicketKeeper = new WicketKeeper();
        CricketGameHelper cricketGameHelper = new CricketGameHelper();

        CricketGameSimulator cricketGameSimulator = new CricketGameSimulator(cricketGameHelper,pureBatsman,allRounder,wicketKeeper);
        cricketGameSimulator.simulate();

//        List<Dummy> dummyList = Arrays.asList(new Dummy("Vikas","Gautam"),
//                new Dummy("Kapil","Yadav"),
//                new Dummy("Tanush","Angural"),
//                new Dummy("Kapil","Yadav"));

        List<Dummy> dummyList = new ArrayList<>();
        dummyList.add(new Dummy("Vikas","Gautam",18));
        dummyList.add(new Dummy("Vikas","Gaa",19));
        dummyList.add(new Dummy("Vikas","Gautam",20));

        Dummy dummy = new Dummy();
        fun(dummy);
        System.out.println(dummy.getFirstName()+" "+dummy.getLastName());

        int a = 22;
        System.out.println(a/10);

        System.out.println(100.0-50);

        Integer sum =  dummyList.subList(dummyList.size()-2, dummyList.size()).stream().mapToInt(Dummy::getAge).sum()/2;
        System.out.println(sum);

        Set<String> validPageNamesForNearByService = new HashSet<>(Arrays.asList("LOANS_ALL","LOANS_EASY_LOAN","LOANS_GOLD_LOAN","INSURANCE","BANKING_BP_ACCOUNT","BANKING_BP_EARN_12","BANKING_BP_CARD","PAYMENT_SWIPE","PAYMENT_QR","PAYMENT_LINK","HOME","PAYMENT_ALL"));
        String s = "INSURANCE";
        if(validPageNamesForNearByService.contains(s)){
            System.out.println("containing "+s);
        }
//        HashSet<Object> seen=new HashSet<>();
//        dummyList.removeIf(e->!seen.add(Arrays.asList(e.getFirstName(),e.getLastName())));
//
//        for (Dummy d: dummyList
//             ) {
//            System.out.println(d.getFirstName() + " " + d.getLastName());
//        }
//
//        List<String> mobile = new ArrayList<>();
//        mobile.add("38478374837");
//        mobile.add("38478374837");
//        mobile.add("38478374837");mobile.add("38478374837");mobile.add("38478374837");
//
//        Set<String> set = new HashSet<>(mobile);
//        mobile.addAll(set);
//        System.out.println(mobile);



//        Map<String,List<DummyDto>> dummyMap = new HashMap<>();
//        dummyMap = dummyList.stream().sorted(Comparator.comparing((Dummy d)-> d.getId())).collect(Collectors.groupingBy(Dummy::getFirstName,
//                Collectors.mapping((dummy)->DummyDto.from(dummy) , Collectors.toList())));
//
//        dummyMap.forEach((k,v)->{
//            System.out.println("Key is "+k);
//            for (DummyDto d: v
//                 ) {
//                System.out.println("Name "+d.getName() + " Id "+d.getId());
//            }
//        });
//
//        String s = "vikas,";
//        List<String> ans = Arrays.asList(s.split(","));
//        System.out.println(ans);
    }
    private static void fun(Dummy dummy){
        dummy.setFirstName("Vikas");
    }
}
