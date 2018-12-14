import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AmuTeamTest {

    AmuTeam amuTeam1 = new AmuTeam("cat", "High", "Team1");
    AmuTeam amuTeam2 = new AmuTeam("Dog", "Low", "Team2");
    AmuTeam amuTeam3 = new AmuTeam("Dog", "Super", "Team3");
    AmuTeam amuTeam4 = new AmuTeam("Wolfe", "Queen", "Team4");

    @Before
    public void before() {
        AmuTeam amuTeam1 = new AmuTeam("cat", "High", "Team1");
        AmuTeam amuTeam2 = new AmuTeam("Dog", "Low", "Team2");
        AmuTeam amuTeam3 = new AmuTeam("Dog", "Super", "Team3");
        AmuTeam amuTeam4 = new AmuTeam("Wolfe", "Queen", "Team4");
    }

    @Test
    public void main() {
        assertTrue(amuTeam1.check() <= 30 && amuTeam1.check() >= 0);
        assertTrue(amuTeam2.check() <= 25 && amuTeam2.check() >= 0);
        assertTrue(amuTeam3.check() <= 75 && amuTeam3.check() >= 0);
        assertTrue(amuTeam4.check() <= 125 && amuTeam4.check() >= 100);

    }

}
