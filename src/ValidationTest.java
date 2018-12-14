import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ValidationTest {


    ProTeam proTeam1 = new ProTeam("Mazda", "Low", "Team1");
    AmuTeam amuTeam1 = new AmuTeam("Wolf", "Low", "Team5");

    @Test
    public void validateTest() {
        assertTrue(Validation.proValidation(proTeam1) == true);
        assertTrue(Validation.amuValidation(amuTeam1) == true);


    }


}
