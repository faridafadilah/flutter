package com.example.myresto.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FoodRequest {
  private String title;
  private String description;
  private String fullDescription;
  private int price;
}