package com.haise.catservices.repository;

import com.haise.catservices.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, String> {

}
