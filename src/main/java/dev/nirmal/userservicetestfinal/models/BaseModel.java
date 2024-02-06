package dev.nirmal.userservicetestfinal.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class BaseModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // NOTE 12: id generated by IDENTITY strategy
  private Long id;
}