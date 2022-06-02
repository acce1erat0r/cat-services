package com.haise.catservices.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class CatDto {
    private String name;
    private LocalDate brithDay;
}
