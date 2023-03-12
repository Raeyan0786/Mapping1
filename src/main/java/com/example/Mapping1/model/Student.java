package com.example.Mapping1.model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.Mapping1.model.Address;

//import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    private  String StudentName;
    private String studentAge;
    private String studentNumber;
    private String studentBranch;
    private String studentDepartment;
    @Embedded
    private Address address;

}
