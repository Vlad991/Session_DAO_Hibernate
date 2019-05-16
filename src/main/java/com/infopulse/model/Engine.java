package com.infopulse.model;

import lombok.*;

import javax.persistence.*;

@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "engines")
public class Engine {

    @Id
    @Basic
    @Column(name = "model")
    private String model;

    @Column(name = "power")
    private int power;
}
