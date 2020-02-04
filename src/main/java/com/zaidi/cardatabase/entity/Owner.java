package com.zaidi.cardatabase.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ownerId;
    private String firstName;
    private String lastName;
    // one owner can have different car
    // cascading define how cascade affects entities
    // all attribute means that if the owner is deleted, car linked to the owner is deleted as well
    // mapped by owner mean the car class has owner field which is foreign key for this relationship
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    @JsonIgnore
    private List<Car> cars;
//    @ManyToMany(cascade = CascadeType.MERGE)
//    @JoinTable(name = "car_owner", joinColumns = {@JoinColumn(name = "ownerId")}, inverseJoinColumns = {@JoinColumn(name = "id")})
//    private Set<Car> cars = new HashSet<>(0);

    public Owner() {
    }

    public Owner(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
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

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
