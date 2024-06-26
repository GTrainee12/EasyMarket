package com.example.EasyMarket.repositories;

import com.example.EasyMarket.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface ImageRepository extends JpaRepository<Image, Long> {
}
