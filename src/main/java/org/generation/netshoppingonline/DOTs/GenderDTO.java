package org.generation.netshoppingonline.DOTs;

import jakarta.persistence.*;
import org.generation.netshoppingonline.models.user.User;

import java.util.List;

@Entity
@Table (name = "genders")

public class GenderDTO {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    // Constructor vacio

    public GenderDTO() {
    }

    // getters % setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
     }

    // to string

        @Override
        public String toString() {
        return "GenderDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
        }

   //  hashCode() & equals


    //Relación con la tabla users

        @OneToMany(mappedBy = "gender") // campo en User que tiene la relación
        private List<User> users;

        // Getters & setters
        public List<User> getUsers() {
            return users;
        }

        public void setUsers(List<User> users) {
            this.users =users;
            }
    }

