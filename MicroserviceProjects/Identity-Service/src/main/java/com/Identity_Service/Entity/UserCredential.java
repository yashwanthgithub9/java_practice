package com.Identity_Service.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
public class UserCredential {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonProperty("name")      // FORCE mapping to "name"
    private String name;

    @JsonProperty("email")     // FORCE mapping to "email"
    private String email;

    @JsonProperty("password")  // FORCE mapping to "password"
    private String password;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        System.out.println("INSIDE SETTER: Setting email to " + email); // <--- Add this
        this.email = email;
    }

    public void setPassword(String password) {
        System.out.println("DEBUG CHECK: Spring is asking for password. I am returning:" + password); // <--- Add this
        this.password = password;
    }

    public UserCredential(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public UserCredential() {
    }

    @Override
    public String toString() {
        return "UserCredential{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
