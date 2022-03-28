package de.meocm.test.service;

import de.meocm.test.Tax;
import de.meocm.test.repository.TaxRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TaxCalculationService {

    final private TaxRepository taxRepository;

    public TaxCalculationService(TaxRepository taxRepository) {
        this.taxRepository = taxRepository;
    }

    public BigDecimal calculatePriceWithTax(BigDecimal priceWithoutTax) {
        final Tax currentTax = taxRepository.findCurrent();
        return currentTax.getAmountInPercent().divide(new BigDecimal("10")).multiply(priceWithoutTax);
    }
}
