package com.haise.catservices.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter @Setter @Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString @EqualsAndHashCode
public class Cat {

    @Id
    private String id;
    private String name;
    private LocalDate birthDay;
    private LocalDateTime createdAt;

}
