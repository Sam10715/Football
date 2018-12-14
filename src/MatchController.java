import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.ArrayList;
import java.util.List;

public class MatchController {

    //Determine which team will win
    public static Team winCheck(Team t1, Team t2) {
        while (t1.check() == t2.check()) {
            // in case of draw, repeat the match;

            t1.check();
            t2.check();
        }


        if (t1.check() > t2.check()) {


            return t1;


        } else {

            return t2;
        }
    }


    public static List<Team> matchLogic(List<Team> teamList) {
        List<Team> p1 = new ArrayList<>();
        if (teamList.size() % 2 != 0) {
            teamList.remove(teamList.get(teamList.size() - 1));
            // if the teams number is ood, kick the last team out the competition
            // it means that the team registered too late for the competition.
        }
        if (teamList.size() == 8) {
            System.out.println("The First round");
        } else if (teamList.size() == 4) {
            System.out.println("The Second round");
        } else if (teamList.size() == 2) {
            System.out.println("The Final round");
        }

        System.out.println("-------------------------------------------------------------------------");


        for (int i = 0; i < teamList.size() / 2; i++) {


            System.out.println("Match Between : " + teamList.get(i).getName() + " and " + teamList.get(teamList.size() - i - 1).getName());
            p1.add(MatchController.winCheck(teamList.get(i), teamList.get(teamList.size() - i - 1)));
            System.out.println("The winner is " + p1.get(i).getName());
            System.out.println(p1.get(i).getNameOf());
            int x = (int) Math.ceil((teamList.get(i).check() / 5));
            int y = (int) Math.ceil((teamList.get(teamList.size() - 1 - i).check() / 5));
            while (x == y) {
                x = (int) Math.ceil((teamList.get(i).check() / 5));
                y = (int) Math.ceil((teamList.get(teamList.size() - i - 1).check() / 5));

            }

            System.out.println("The score is " + x + " - " + y + " for " + p1.get(i).getName());
            System.out.println("---------------------------------------");
        }


        if (teamList.size() == 2) {
            System.out.println("Congratulations you are the winner of 2018 competition");
        }
        System.out.println("-------------------------------------------------------------------------");
        return p1;
    }
}
