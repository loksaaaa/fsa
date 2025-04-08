package org.slovosled;

public class Main {
    public static void main(String[] args) {
        // Vytvor učiteľa
        Teacher teacher = new Teacher(1L, "Alice");
        // Učiteľ vytvorí vetu
        Sentence sentence = teacher.createSentence("I love Java");

        // Vytvor študenta
        Student student = new Student(2L, "Bob");

        // Študent sa pokúsi poskladať vetu
        Attempt attempt = student.attemptSentence(sentence, "I love Java");
        System.out.println("Is the attempt correct? " + attempt.isCorrect());

        // Pridaj attempt do PracticeSession
        PracticeSession session = new PracticeSession(1L);
        session.addAttempt(attempt);
        System.out.println("Correct answers: " + session.getCorrectAnswers());
        System.out.println("Wrong answers: " + session.getWrongAnswers());
    }
}
