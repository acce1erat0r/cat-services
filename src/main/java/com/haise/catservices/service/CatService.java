package com.haise.catservices.service;

import com.haise.catservices.dto.CatDto;
import com.haise.catservices.entity.Cat;
import com.haise.catservices.repository.CatRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class CatService {
    CatRepository catRepository;

    public Cat save(CatDto catDto){

        Cat cat = Cat
                .builder()
                .birthDay(catDto.getBrithDay())
                .name(catDto.getName())
                .id(UUID.randomUUID().toString())
                .createdAt(LocalDateTime.now())
                .build();
        return catRepository.saveAndFlush(cat);
    }

    public Iterable<Cat> getAll(){
        return catRepository.findAll();
    }
}
