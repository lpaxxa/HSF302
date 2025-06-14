package com.lpaxxa.superapp.entity.unione;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

//@Entity
//@Table(name = "Student")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Student {
    @Id
    @Column(name="Id", columnDefinition = "VARCHAR(50)")//  mã chuyên ngành 2 kí tự
    private String id;
    @Column(name = "Name", columnDefinition = "NVARCHAR(50)",nullable = false)
    private String name;
    @Column(name = "Yob",nullable = false)
    private int yob;
    @Column(name = "Gpa")
    private double gpa;
}
