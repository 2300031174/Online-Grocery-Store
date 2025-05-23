package org.softuni.onlinegrocery.validation.implementations;

import org.softuni.onlinegrocery.domain.entities.Receipt;
import org.softuni.onlinegrocery.domain.models.service.ReceiptServiceModel;
import org.softuni.onlinegrocery.validation.ReceiptValidationService;
import org.springframework.stereotype.Component;

@Component
public class ReceiptValidationServiceImpl implements ReceiptValidationService {
    @Override
    public boolean isValid(Receipt receipt) {
        return receipt != null;
    }

    @Override
    public boolean isValid(ReceiptServiceModel receiptServiceModel) {
        return receiptServiceModel != null;
    }
}
