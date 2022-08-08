package com.example.daowithhibernate.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.TemporalType.TIMESTAMP;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @CreatedDate
    @Temporal(TIMESTAMP)
    Date date;

    @ManyToOne(optional = false)
    Customers customer;

    @Column
    String productName;

    @Column
    double amount;



}
