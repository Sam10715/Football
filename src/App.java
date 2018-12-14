import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {


        ProTeam proTeam1 = new ProTeam("Mazda", "Low", "Team1");
        ProTeam proTeam2 = new ProTeam("Capgemini", "Low", "Team2");
        ProTeam proTeam3 = new ProTeam("Philips", "Low", "Team3");
        ProTeam proTeam4 = new ProTeam("Sony", "High", "Team4");
        AmuTeam amuTeam1 = new AmuTeam("Wolf", "High", "Team5");
        AmuTeam amuTeam2 = new AmuTeam("Cat", "High", "Team6");
        AmuTeam amuTeam3 = new AmuTeam("Dog", "Low", "Team7");
        AmuTeam amuTeam4 = new AmuTeam("Bird", "High", "Team8");
        // team 9 registered for the competition when it was too late, Sorry.
        AmuTeam amuTeam5 = new AmuTeam("Horse", "Low", "Team9");


        Validation.proValidation(proTeam1);
        Validation.proValidation(proTeam2);
        Validation.proValidation(proTeam3);
        Validation.proValidation(proTeam4);

        Validation.amuValidation(amuTeam1);
        Validation.amuValidation(amuTeam2);
        Validation.amuValidation(amuTeam3);
        Validation.amuValidation(amuTeam4);


        List<Team> teamLists = new ArrayList<>();


        teamLists.add(proTeam1);
        teamLists.add(proTeam2);
        teamLists.add(proTeam3);
        teamLists.add(proTeam4);
        teamLists.add(amuTeam1);
        teamLists.add(amuTeam2);
        teamLists.add(amuTeam3);
        teamLists.add(amuTeam4);
        teamLists.add(amuTeam5);


        MatchController.matchLogic(MatchController.matchLogic(MatchController.matchLogic(teamLists)));


    }
}

