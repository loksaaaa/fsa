package org.slovosled;

import java.util.ArrayList;
import java.util.List;

public class PracticeSession {
    private Long id;
    private int correctAnswers;
    private int wrongAnswers;
    private List<Attempt> attempts;

    public PracticeSession(Long id) {
        this.id = id;
        this.correctAnswers = 0;
        this.wrongAnswers = 0;
        this.attempts = new ArrayList<>();
    }

    public void addAttempt(Attempt attempt) {
        attempts.add(attempt);
        if (attempt.evaluate()) {
            correctAnswers++;
        } else {
            wrongAnswers++;
        }
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public int getWrongAnswers() {
        return wrongAnswers;
    }

    public List<Attempt> getAttempts() {
        return attempts;
    }
}
