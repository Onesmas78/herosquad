import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

@SuppressWarnings("ALL")
public class herotest {

    @Test
    private hero setupNewHero(){
        return new hero("Superman", 35, "Superstrength", "Kryptonite");
    }

    @Test
    public void heroInstantiatesCorrectly() {
        hero newHero = setupNewHero();
        assertTrue(newHero instanceof hero);
    }

    @Test
    public void getHeroName_true() {
        hero newHero = setupNewHero();
        assertTrue(newHero.getName() instanceof String);
    }

    @Test
    public void getHeroAge_int() {
        hero newHero = setupNewHero();
        assertEquals(35, newHero.getAge());
    }

    @Test
    public void getHeroSuperPower_true() {
        hero newHero = setupNewHero();
        assertTrue(newHero.getPower() instanceof String);
    }

    @Test
    public void getHeroWeakness_true() {
        hero newHero = setupNewHero();
        assertTrue(newHero.getWeakness() instanceof String);
    }

    @Test
    public void getHeroList_storeTwoHeroes_true() {
        hero newHero = setupNewHero();
        assertTrue(hero.getHeroList().contains(newHero));
    }

    @Test
    public void findHero_searchForHeroById_String() {
        hero newHero = setupNewHero();
        assertEquals("Superman", hero.findHero(newHero.getHeroID()).getName());
    }
}