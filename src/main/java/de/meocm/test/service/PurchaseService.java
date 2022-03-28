package de.meocm.test.service;

import de.meocm.test.Product;
import de.meocm.test.PurchaseResultDto;
import de.meocm.test.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.NoSuchElementException;

@Service
public class PurchaseService {

    final private ProductRepository productRepository;
    final private TaxCalculationService taxCalculationService;
    final private DiscountService discountService;

    public PurchaseService(ProductRepository productRepository, TaxCalculationService taxCalculationService,
                           DiscountService discountService) {
        this.productRepository = productRepository;
        this.taxCalculationService = taxCalculationService;
        this.discountService = discountService;
    }

    public PurchaseResultDto purchase(long productId, int amount, BigDecimal payment) {
        final Product product = productRepository.findProductById(productId);
        if (product == null) {
            throw new NoSuchElementException("No product found for id " + productId);
        }

        final BigDecimal totalPrice = product.calculateTotalPrice(amount);
        final BigDecimal priceWithTax = taxCalculationService.calculatePriceWithTax(totalPrice);
        final BigDecimal discountedPrice = discountService.calculateDiscountedPrice(product, priceWithTax);

        if (discountedPrice.compareTo(payment) >= 0) {
            throw new IllegalArgumentException("Insufficient funds!!!");
        }

        return new PurchaseResultDto(product, payment.min(discountedPrice));
    }

}
