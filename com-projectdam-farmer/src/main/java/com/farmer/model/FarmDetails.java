package com.farmer.model;/*
 *@created 22-12-2021/12/2021 - 03:18 PM
 *@project IntelliJ IDEA
 *@author  ArunSaiSurapaneni
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="farmdetails")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FarmDetails {
    @Id
    @Column(length = 20, name = "farmid")
    @GeneratedValue(generator = "farm_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "farm_seq", sequenceName = "farm_sequence", initialValue = 1, allocationSize = 1)
    private Integer farmId;

    private  double acres;

    private String soil;

    private String city;

    private  int zipcode;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Produce> produces;
}
