package com.example.shoppingcart.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import jakarta.persistence.*;
import lombok.*;

@ToString
@Entity
@Setter
@Getter
@Table(name = "cart_item")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CartItem implements Serializable {

  @Id
  @Column(name = "cid")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long cartId;

  @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE},
      fetch = FetchType.LAZY)
  @JoinColumn(name = "pid", nullable = true)
  private Product product;

  @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE},
      fetch = FetchType.LAZY)
  @JoinColumn(name = "uid", nullable = false)
  private UserEntity user;

  @Column(nullable = false)
  private BigDecimal quantity;

}
