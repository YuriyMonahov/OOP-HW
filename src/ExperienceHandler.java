public class ExperienceHandler {
    public void handleExperience(ExperienceHolder experienceHolder, ExperienceEvent experienceEvent) {
        int currentExperience = experienceHolder.getCurrentExperience();
        int experienceToAdd = experienceEvent.getExperience();
        int newExperience = currentExperience + experienceToAdd;

        int levelExperience = experienceHolder.getLevelExperience();
        if (newExperience >= levelExperience) {
            int currentLevel = experienceHolder.getCurrentLevel();
            experienceHolder.setCurrentLevel(currentLevel + 1);
            experienceHolder.setCurrentExperience(newExperience - levelExperience);
        } else {
            experienceHolder.setCurrentExperience(newExperience);
        }
    }
}

