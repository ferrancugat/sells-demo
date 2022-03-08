package org.example.shopping.domain.comission;

import org.example.shopping.domain.model.ProductType;

public class ComissionStrategyMethodFactory {

    private final static TypeAComissionStrategy typeAComissionStrategy = new TypeAComissionStrategy();
    private final static TypeBComissionStrategy typeBComissionStrategy = new TypeBComissionStrategy();
    private final static TypeCComissionStrategy typeCComissionStrategy = new TypeCComissionStrategy();

    public static ComissionStrategy getComissionStrategy(ProductType productType) {
        switch (productType) {
            case TYPEA:
                return typeAComissionStrategy;
            case TYPEB:
                return typeBComissionStrategy;
            case TYPEC:
                return typeCComissionStrategy;
        }
        throw new IllegalArgumentException();
    }
}
