import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);

        printDoubled(items);

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team <FootballPlayer> adelaideCrows = new Team("Adelaide Crows");
        //player of type FootballPlayer
        adelaideCrows.addPlayer(joe);

        //won't work because they have of type BaseballPlayer
//        adelaideCrows.addPlayer(pat);

        //won't work because they have of type SoccerPlayer
//        adelaideCrows.addPlayer(beckham);
        System.out.println(adelaideCrows.numPlayers());
        Team <BaseballPlayer> chicagoCubs = new Team("Chicago Cubs");
        chicagoCubs.addPlayer(pat);

        Team <SoccerPlayer> someTeam = new Team("Some Team");
            someTeam.addPlayer(beckham);
        Team <FootballPlayer> hawthorn = new Team("Hawthorn");
        Team <FootballPlayer> fremantle = new Team("Fremantle");

        hawthorn.matchResult(fremantle, 1, 3);
        hawthorn.matchResult(adelaideCrows, 3, 0);

        //won't work because matchResult() expects type FootballPlayer chicagoCubs is of type BaseballPlayer
        //adelaideCrows.matchResult(chicagoCubs, 2, 1);

        System.out.println(someTeam.numPlayers());

        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(fremantle.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(adelaideCrows.compareTo(fremantle));
    }
    public static void printDoubled(ArrayList<Integer> n){
        for(int i: n ){
            System.out.println(i*2);
        }
    }
}
