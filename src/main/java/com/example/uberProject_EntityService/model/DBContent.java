package com.example.uberProject_EntityService.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dbconstant")
public class DBContent extends BaseModel{

    @Column(unique = true, nullable = false)
    private String name;

    private String value;
}
