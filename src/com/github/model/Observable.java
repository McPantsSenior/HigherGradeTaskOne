package com.github.model;

public abstract class Observable implements SaleObserver
{
    protected double totalRevenue;

    /**
     * Updates and shows total income.
     * @param priceOfTheSaleThatWasJustMade the total sale amount.
     */
    public void newSaleWasMade (double priceOfTheSaleThatWasJustMade)
    {
        priceOfSale(priceOfTheSaleThatWasJustMade);
        showTotalIncome();
    }
    
    private void showTotalIncome () 
    {
        try
        {
            doShowTotalIncome ();
        } 
        catch (Exception e) 
        {
            handleErrors (e);
        }
    }

    private void priceOfSale (double totalPrice)
    {
        totalRevenue += totalPrice;
    }
    
    protected abstract void doShowTotalIncome () throws Exception;
    
    protected abstract void handleErrors (Exception e);
}
