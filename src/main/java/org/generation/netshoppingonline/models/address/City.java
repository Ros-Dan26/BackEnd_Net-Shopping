package org.generation.netshoppingonline.models.address;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "cities") // <-- tu tabla real
public class City implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // INT

    @Column(name = "id_state", nullable = false)
    private Integer stateId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_state", insertable = false, updatable = false)
    @JsonIgnore
    private State state;

    @Column(nullable = false, length = 120)
    private String name;

    public City() {}
    public City(Integer id, Integer stateId, String name) {
        this.id = id; this.stateId = stateId; this.name = name;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getStateId() { return stateId; }
    public void setStateId(Integer stateId) { this.stateId = stateId; }

    public State getState() { return state; }
    public void setState(State state) { this.state = state; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City that = (City) o;
        return Objects.equals(id, that.id);
    }
    @Override public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", stateId=" + stateId +
                ", name='" + name + '\'' +
                '}';
    }
}
