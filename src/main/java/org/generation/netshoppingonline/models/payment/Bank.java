package org.generation.netshoppingonline.models.payment;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;
/*
@Entity
@Table(name = "banks")
public class Bank implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // INT

    @Column(nullable = false, length = 120)
    private String name;

    @Column(nullable = false, length = 512)
    private String url;

    public Bank() {}

    public Bank(Integer id, String name, String url) {
        this.id = id; this.name = name; this.url = url;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bank)) return false;
        Bank that = (Bank) o;
        return Objects.equals(id, that.id);
    }
    @Override public int hashCode() { return Objects.hash(id); }
}*/