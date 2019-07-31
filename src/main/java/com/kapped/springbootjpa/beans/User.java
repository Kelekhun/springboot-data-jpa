package com.kapped.springbootjpa.beans;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class User {
    @Id
    @Generated
    private long id;
    private String name;
    private String role;
}
