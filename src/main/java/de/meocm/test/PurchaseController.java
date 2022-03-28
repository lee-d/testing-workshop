package de.meocm.test;

import de.meocm.test.service.PurchaseService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class PurchaseController {

    final private PurchaseService purchaseService;

    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @PutMapping("/{productId}/purchase")
    public PurchaseResultDto purchase(@PathVariable long productId, @RequestBody PurchaseDto purchaseDto) {
        return purchaseService.purchase(productId, purchaseDto.getAmount(), purchaseDto.getPayment());
    }
}
