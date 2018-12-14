import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ProTeamTest {
    ProTeam proTeam1 = new ProTeam("Capgemini", "Low", "Team2");
    ProTeam proTeam2 = new ProTeam("Philips", "High", "Team3");

    @Before
    public void before() {
        ProTeam proTeam1 = new ProTeam("Capgemini", "Low", "Team2");
        ProTeam proTeam2 = new ProTeam("Philips", "High", "Team3");


    }

    @Test
    public void proTest() {
        assertTrue(proTeam1.check() <= 30 && proTeam1.check() >= 0);
        assertTrue(proTeam2.check() <= 50 && proTeam2.check() >= 0);


    }


}
