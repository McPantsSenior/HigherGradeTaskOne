package com.github.model;

/**
 * The SaleObserver interface used for classes that observe new sales.
 */
public interface SaleObserver
{
    public void newSaleWasMade (double priceOfTheSaleThatWasJustMade);
}
