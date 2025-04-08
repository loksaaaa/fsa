package org.slovosled;

public class Attempt {
    private Long id;
    private String selectedOrder;
    private boolean isCorrect;
    private Sentence sentence;

    public Attempt(Long id, String selectedOrder, boolean isCorrect, Sentence sentence) {
        this.id = id;
        this.selectedOrder = selectedOrder;
        this.isCorrect = isCorrect;
        this.sentence = sentence;
    }

    public boolean evaluate() {
        // Overíme, či sa selectedOrder == sentence.getContent()
        return sentence.getContent().equals(selectedOrder);
    }

    public void setIsCorrect(boolean correct) {
        this.isCorrect = correct;
    }

    public boolean isCorrect() {
        return isCorrect;
    }
}
