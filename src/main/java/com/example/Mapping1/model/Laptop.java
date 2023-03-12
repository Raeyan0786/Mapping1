package com.example.Mapping1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
//import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer laptopId;
    private String laptopName;
    private String laptopBrand;
    private Integer laptopPrice;

    @OneToOne
    private Student student;
}
