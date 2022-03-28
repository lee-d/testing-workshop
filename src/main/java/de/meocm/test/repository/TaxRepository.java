package de.meocm.test.repository;

import de.meocm.test.Tax;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public class TaxRepository {

    public Tax findCurrent() {
        return new Tax(1, new BigDecimal("19"));
    }
}
