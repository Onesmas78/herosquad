import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

@SuppressWarnings("ALL")
public class squadtest {

    @Test
    private hero setupNewHero() {
        return new hero("Superman", 35, "Superstrength", "Kryptonite");
    }

    @Test
    private squad setupNewSquad(hero hero) {
        return new squad("Justice League", "Save Humanity", hero);
    }

    @Test
    public void squadInstanciatedCorrectly() {
        squad squad = setupNewSquad(setupNewHero());
        assertTrue(squad instanceof squad);
    }

    @Test
    public void getSquadName() {
        squad squad = setupNewSquad(setupNewHero());
        assertTrue(squad.getName() instanceof String);
    }

    @Test
    public void getSquadCause() {
        squad squad = setupNewSquad(setupNewHero());
        assertTrue(squad.getCause() instanceof String);
    }
}