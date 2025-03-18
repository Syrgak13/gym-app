package com.gymmanagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Gym {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;
    private String phone;


    @OneToMany
    private Collection<Subscription> subscriptions;
}

