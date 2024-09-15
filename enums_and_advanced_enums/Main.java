package enums_and_advanced_enums;

public class Main {
    public static void main(String[] args) {
        Difficulty gameDifficulty = Difficulty.MEDIUM;
        gameDifficulty = Difficulty.HARD;

        if(gameDifficulty == Difficulty.EASY) {

        }

        ToolTier tier = ToolTier.DIAMOND;
        System.out.println(tier.getAttackMultiplier());
    }
}
