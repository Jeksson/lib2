package com.jekss.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Жека on 17.07.2015.
 */
@Entity
@Table(name = "role_users")
public class RoleUsers implements Serializable {

    public RoleUsers(int id, String role, User user) {
        this.id = id;
        this.role = role;
        this.user = user;
    }

    public RoleUsers(int id) {
        this.id = id;
    }

    private int id;
    private String role;
    private User user;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "user_id", nullable = false)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoleUsers)) return false;

        RoleUsers roleUsers = (RoleUsers) o;

        if (id != roleUsers.id) return false;
        if (role != null ? !role.equals(roleUsers.role) : roleUsers.role != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }
}
