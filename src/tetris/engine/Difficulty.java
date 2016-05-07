package tetris.engine;

/**
 * Created by Assassik on 5. 5. 2016.
 */
public enum Difficulty {
    EASY("Lehká", 1, 350),
    MEDIUM("Střední", 2, 250),
    HARD("Těžká", 3, 200);

    final String description;
    final int scoreCoeficient;
    final int fallSpeed;    // number of ms betwean shape moves

    Difficulty(String description, int scoreCoeficient, int fallSpeed) {
        this.description = description;
        this.scoreCoeficient = scoreCoeficient;
        this.fallSpeed = fallSpeed;
    }

    public int getScoreCoeficient() {
        return scoreCoeficient;
    }

    @Override
    public String toString() {
        return description;
    }

    public Difficulty getDefault() {
        return MEDIUM;
    }

    public int getFallSpeed() {
        return fallSpeed;
    }
}