package com.example.shoppingcart.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "product")
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {
  @Id
  @Column(name = "pid")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long productId;

  @Column(name = "name", nullable = false) // VS @NotNull => NotNull is deprecated
  String productName;

  @Column(name = "description")
  String productDescription;

  @Column(name = "image_url")
  String imageUrl;

  @Column(name = "price", nullable = false)
  BigDecimal productPrice;

  @Column(name = "unit", nullable = false)
  Integer unitStock;
}
