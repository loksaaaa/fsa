package org.slovosled;

public class Sentence {
    private Long id;
    private String content;

    public Sentence(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
