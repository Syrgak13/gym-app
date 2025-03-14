package com.gymmanagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

public class Subscription {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String startDate;
    private String endDate;

    @ManyToOne
    private Gym gym;

    @ManyToOne
    private Category categoryOfSubscription;
}
