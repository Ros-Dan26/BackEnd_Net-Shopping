/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.models.user;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.Objects;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

/**
 *
 * @author jft
 */
@Entity
@Table(name = "users")
public class User implements Cloneable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "genders_id")
    private int gendersId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @Column
    private String preferences;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private String mobile;

    @Column
    private String nickname;

    @Column
    private String password;

    @Column
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime created;

    @Column
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime updated;

    @Column
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime deleted;

    public User() {
        created = LocalDateTime.now();
        updated = LocalDateTime.now();
        deleted = null;
    }

    public User(
            int id,
            int gendersId,
            String firstName,
            String lastName,
            String middleName,
            String preferences,
            String email,
            String phone,
            String mobile,
            String nickname,
            String password) {
        this.id = id;
        this.gendersId = gendersId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.preferences = preferences;
        this.email = email;
        this.phone = phone;
        this.mobile = mobile;
        this.nickname = nickname;
        this.password = password;
        created = LocalDateTime.now();
        updated = LocalDateTime.now();
        deleted = null;
    }

    public int getId() {
        return id;
    }

    public int getGendersId() {
        return gendersId;
    }

    public void setGendersId(int gendersId) {
        this.gendersId = gendersId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    /**
     * Inserta un valor en updated en hora local del servidor automaticamente
     */
    public void setUpdated() {
        updated = LocalDateTime.now();
    }

    public LocalDateTime getDeleted() {
        return deleted;
    }

    /**
     * Inserta un valor en deleted en hora local del servidor automaticamente
     */
    public void setDeleted() {
        deleted = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id
                + ", gendersId=" + gendersId
                + ", firstName=" + firstName
                + ", lastName=" + lastName
                + ", middleName=" + middleName
                + ", preferences=" + preferences
                + ", email=" + email
                + ", phone=" + phone
                + ", mobile=" + mobile
                + ", nickname=" + nickname
                + ", password=" + password
                + ", created=" + created
                + ", updated=" + updated
                + ", deleted=" + deleted + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.id;
        hash = 61 * hash + this.gendersId;
        hash = 61 * hash + Objects.hashCode(this.firstName);
        hash = 61 * hash + Objects.hashCode(this.lastName);
        hash = 61 * hash + Objects.hashCode(this.middleName);
        hash = 61 * hash + Objects.hashCode(this.preferences);
        hash = 61 * hash + Objects.hashCode(this.email);
        hash = 61 * hash + Objects.hashCode(this.phone);
        hash = 61 * hash + Objects.hashCode(this.mobile);
        hash = 61 * hash + Objects.hashCode(this.nickname);
        hash = 61 * hash + Objects.hashCode(this.password);
        hash = 61 * hash + Objects.hashCode(this.created);
        hash = 61 * hash + Objects.hashCode(this.updated);
        hash = 61 * hash + Objects.hashCode(this.deleted);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.gendersId != other.gendersId) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.middleName, other.middleName)) {
            return false;
        }
        if (!Objects.equals(this.preferences, other.preferences)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.mobile, other.mobile)) {
            return false;
        }
        if (!Objects.equals(this.nickname, other.nickname)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.created, other.created)) {
            return false;
        }
        if (!Objects.equals(this.updated, other.updated)) {
            return false;
        }
        return Objects.equals(this.deleted, other.deleted);
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
    
    public String _FullName(){
        return String.format("%s %s %s", 
                getFirstName(),
                getLastName(), 
                getMiddleName());
    }
}
