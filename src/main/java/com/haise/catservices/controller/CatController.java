package com.haise.catservices.controller;

import com.haise.catservices.dto.CatDto;
import com.haise.catservices.entity.Cat;
import com.haise.catservices.service.CatService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cats")
@FieldDefaults( level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class CatController {

    CatService catService;
    @PostMapping
    public Cat save(@RequestBody CatDto cat){
        return catService.save(cat);
    }

    @GetMapping
    public Iterable<Cat> fetchCats(){
        return catService.getAll();
    }
}
