package org.slovosled;

public class Student extends User {

    public Student(Long id, String name) {
        super(id, name, UserRole.STUDENT);
    }

    public Attempt attemptSentence(Sentence sentence, String selectedOrder) {
        // Vytvor nový Attempt
        Attempt attempt = new Attempt(1L, selectedOrder, false, sentence);
        // Vyhodnoť, či je správny
        boolean result = attempt.evaluate();
        attempt.setIsCorrect(result);
        return attempt;
    }
}
