package org.slovosled;

public class Teacher extends User {

    public Teacher(Long id, String name) {
        super(id, name, UserRole.TEACHER);
    }

    public Sentence createSentence(String content) {
        // tu neskôr môžeme vytvárať vetu a ukladať ju do repozitára
        return new Sentence(1L, content); // 1L je len príklad, skutočné ID budeš generovať
    }
}
