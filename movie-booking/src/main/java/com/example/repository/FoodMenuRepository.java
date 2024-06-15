package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.moviebooking.FoodMenu;

public interface FoodMenuRepository extends JpaRepository<FoodMenu, Long> {}

