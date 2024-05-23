package com.example.shoppingcart.exception.setting;

import lombok.Getter;

// SysCode
@Getter
public enum Code {
  OK(20000, "OK"), SUCCESS(20001, "success"),
  // 40000 - 49999
  NOT_FOUND(40000, "Resource NOT FOUND."), //
  // Shop
  SHOP_NOT_ENOUGH_PRODUCT(41002, "Shop has not enough product."), //
  PRODUCT_NOT_EXIST(41003, "Product not exist."), //
  INSUFFICIENT_STOCK_EXCEPTION(41004,
      "Can't add more items to the cart than the available stock."), //
  CART_ITEM_NOT_FOUND_EXCEPTION(41005, "Item is not found in the cart."), //
  USER_NOT_FOUND(41006, "User not exists."), //
  CART_IS_EMPTY(41007, "Cart is empty"), //
  OUT_OF_STOCK(41008, "Out of Stock"), //
  PRODUCT_OFF_SALE_OR_DELETE(41009,
      "Product off sale Or delete"), ON_SALE(41010, "On sale"),
  // Server
  SERVER_TIMEOUT(50000, "Server Timeout."), //
  THIRD_PARTY_SERVER_UNAVAILABLE(50001, "Third Party Service Unavailable."), //
  REDIS_SERVER_UNAVAILABLE(50002, "Redis unavailable."), INTERNAL_SERVER_ERROR(
      50003, "Internal Server Error."), //
  // Stripe
  STRIPE_TOKEN_ALREADY_USED(60001, "Token already used."), //
  PAYMENT_METHOD_IS_REQUIRED(60002, "Payment method is required"), //
  PAYMENT_CONFIRMATION_IS_REQUIRED(60003, "Payment confirmation is required"), //
  PAYMENT_CAPTURE_IS_REQUIRED(60004, "Payment capture is required"), //
  PAYMENT_ACTION_IS_REQUIRED(60005,
      "Additional action is required to complete payment"), //
  PAYMENT_IS_FAILED(60006, "Payment processing error"), //
  PAYMENT_IS_PROCESSING(60007, "Payment in processing"), //
  PAYMENT_IS_CANCELED(60008, "Payment is canceled"), //
  PAYMENT_IS_SUCCEEDED(60009, "Payment is succeeded"),
  // Redis
  SHOP_CART_SKU_TYPE_COUNT_FULL(70000, "SHOP_CART_SKU_TYPE_COUNT_FULL"), //
  SKU_IS_NOT_EXISTS(70100, "SKU_IS_NOT_EXISTS"), //
  SKU_IS_OFF_THE_SHELVES(70101, "SKU_IS_OFF_THE_SHELVES"), //
  REDIS_ADD_ITEM_TO_CART_FAIL(70200, "REDIS_ADD_ITEM_TO_CART_FAIL"), //
  REDIS_GET_ITEM_FROM_CART_FAIL(70201, "REDIS_GET_ITEM_FROM_CART_FAIL"), //
  REDIS_DELETE_ITEM_FROM_CART_FAIL(70202, "REDIS_DELETE_ITEM_FROM_CART_FAIL"), //
  REDIS_SET_EXPIRE_TIME_FAIL(70203, "REDIS_SET_EXPIRE_TIME_FAIL"), //
  // RuntimeException: 90000 - 99999
  IAE_EXCEPTION(90000, "Illegal Argument Exception."), //
  ENTITY_NOT_FOUND(90001, "Entity Not Found."), //
  VALIDATOR_FAIL(90002, "Validator Fail.");

  private final int code;
  private final String desc;

  private Code(int code, String desc) {
    this.code = code;
    this.desc = desc;
  }

  public static Code fromCode(int code) {
    for (Code c : Code.values()) {
      if (c.code == code) {
        return c;
      }
    }
    throw new IllegalArgumentException(
        "No matching constant for code: " + code);
  }

}
