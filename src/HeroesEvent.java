public class HeroesEvent {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("Titan");
        BattleEvent battle1 = new BattleEvent();
        ExperienceHandler experienceHandler = new ExperienceHandler();

        HeroInfoPrinter.printHeroInfo(warrior1);
        experienceHandler.handleExperience(warrior1, battle1);
        experienceHandler.handleExperience(warrior1, battle1);
        HeroInfoPrinter.printHeroInfo(warrior1);
        experienceHandler.handleExperience(warrior1, battle1);
        HeroInfoPrinter.printHeroInfo(warrior1);

        System.out.println("*********************");

        Mage mage1 = new Mage("Albus");
        BattleEvent battle2 = new BattleEvent();
        ExperienceHandler experienceHandler2 = new ExperienceHandler();

        HeroInfoPrinter.printHeroInfo(mage1);
        experienceHandler2.handleExperience(mage1, battle2);
        experienceHandler2.handleExperience(mage1, battle2);
        HeroInfoPrinter.printHeroInfo(mage1);
        experienceHandler2.handleExperience(mage1, battle2);
        HeroInfoPrinter.printHeroInfo(mage1);
    }
}

