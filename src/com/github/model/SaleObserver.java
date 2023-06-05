package com.github.model;

/**
 * The SaleObserver interface used for classes that observe new sales.
 */
public interface SaleObserver
{
    /**
     * Updates and shows total income.
     * @param priceOfTheSaleThatWasJustMade the total sale amount.
     */
    public void newSaleWasMade (double priceOfTheSaleThatWasJustMade);
}
