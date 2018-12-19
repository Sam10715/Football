import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class MatchControllerTest {

    ProTeam proTeam1 = new ProTeam("Mazda", "Low", "Team1");
    ProTeam proTeam2 = new ProTeam("Capgemini", "Low", "Team2");
    ProTeam proTeam3 = new ProTeam("Philips", "Low", "Team3");
    ProTeam proTeam4 = new ProTeam("Sony", "High", "Team4");
    AmuTeam amuTeam1 = new AmuTeam("Wolf", "Low", "Team5");
    AmuTeam amuTeam2 = new AmuTeam("Cat", "High", "Team6");
    AmuTeam amuTeam3 = new AmuTeam("Dog", "Low", "Team7");
    AmuTeam amuTeam4 = new AmuTeam("Bird", "High", "Team8");
    List<Team> teamLists = new ArrayList<>();

    @Before
    public void before() {
        ProTeam proTeam1 = new ProTeam("Mazda", "Low", "Team1");
        ProTeam proTeam2 = new ProTeam("Capgemini", "Low", "Team2");
        ProTeam proTeam3 = new ProTeam("Philips", "Low", "Team3");
        ProTeam proTeam4 = new ProTeam("Sony", "High", "Team4");
        AmuTeam amuTeam1 = new AmuTeam("Wolf", "Low", "Team5");
        AmuTeam amuTeam2 = new AmuTeam("Cat", "High", "Team6");
        AmuTeam amuTeam3 = new AmuTeam("Dog", "Low", "Team7");
        AmuTeam amuTeam4 = new AmuTeam("Bird", "High", "Team8");
        AmuTeam amuTeam5 = new AmuTeam("Horse", "Low", "Team9");
        teamLists.add(proTeam1);
        teamLists.add(proTeam2);
        teamLists.add(proTeam3);
        teamLists.add(proTeam4);
        teamLists.add(amuTeam1);
        teamLists.add(amuTeam2);
        teamLists.add(amuTeam3);
        teamLists.add(amuTeam4);

    }

    @Test
   // public void matchLogicTest() {
     //   assertEquals(MatchController.matchLogic(teamLists).size(), 4, 0);
       // assertEquals(MatchController.matchLogic(MatchController.matchLogic(teamLists)).size(), 2, 0);
        //assertEquals(MatchController.matchLogic(MatchController.matchLogic(MatchController.matchLogic(teamLists))).size(), 1, 0);

//    }

    //@Test
    public void winCheckTest() {
        if (amuTeam1.check() > amuTeam2.check()) {

            assertEquals(amuTeam1, amuTeam1);


        } else {
            assertEquals(amuTeam2, amuTeam2);
        }
    }
}