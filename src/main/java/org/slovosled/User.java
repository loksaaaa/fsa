package org.slovosled;

public abstract class User {
    private Long id;
    private String name;
    private UserRole role;

    public User(Long id, String name, UserRole role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public UserRole getRole() {
        return role;
    }
}
