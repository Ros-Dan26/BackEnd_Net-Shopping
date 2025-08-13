package org.generation.netshoppingonline.models.address;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "types") // <-- tu tabla real
public class AddressType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // INT

    @Column(nullable = false, length = 120)
    private String name;

    public AddressType() {}

    public AddressType(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddressType)) return false;
        AddressType that = (AddressType) o;
        return Objects.equals(id, that.id);
    }
    @Override public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AddressType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}