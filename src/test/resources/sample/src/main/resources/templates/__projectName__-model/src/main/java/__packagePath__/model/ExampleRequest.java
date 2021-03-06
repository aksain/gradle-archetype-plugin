package @packageName@.model;

public class ExampleRequest {

  String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @postmapping
  public ResponseEntity createProduct(@requestbody @Valid ProductDetail product) {
    log.info("REST[createProduct] Rx[{}]", toStringHelper.asString(product));

    ProductDetail productDetail = productDetailService.create(product);

    log.info("REST[createProduct] Tx[{}]", toStringHelper.asString(productDetail));
    return new ResponseEntity<>(productDetail, HttpStatus.OK);
  }

  @Override
  public String toString() {
    return name;
  }
}
