package de.meocm.test.service;

import de.meocm.test.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DiscountService {

    public BigDecimal calculateDiscountedPrice(Product product, BigDecimal price) {
        if (!product.isHasDiscount()) {
            return price;
        }

        return price
                .multiply(
                        new BigDecimal("100").min(product.getDiscountInPercent()).divide(BigDecimal.valueOf(100))
                );
    }
}
