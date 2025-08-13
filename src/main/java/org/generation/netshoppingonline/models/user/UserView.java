/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.models.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Objects;

/**
 *
 * @author JesusFloresTemahuay
 */
@Entity
@Table(name = "users_view")
public class UserView extends UserAbs {

    @Column
    private String avatar;

    @Column
    private String gender;

    public UserView() {
    }

    public UserView(
            String avatar,
            String gender,
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
        super(id,
                gendersId,
                firstName,
                lastName,
                middleName,
                preferences,
                email,
                phone,
                mobile,
                nickname,
                password);
        this.avatar = avatar;
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.avatar);
        hash = 41 * hash + Objects.hashCode(this.gender);
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
        final UserView other = (UserView) obj;
        if (!Objects.equals(this.avatar, other.avatar)) {
            return false;
        }
        return Objects.equals(this.gender, other.gender);
    }
}
