package de.meocm.test.repository;

import de.meocm.test.Product;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public class ProductRepository {

    public Product findProductById(long id) {
        return new Product(id, "Some product name", BigDecimal.TEN, true, BigDecimal.TEN);
    }

}
