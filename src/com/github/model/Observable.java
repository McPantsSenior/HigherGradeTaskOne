package com.github.model;

public abstract class Observable implements SaleObserver
{
    protected double totalRevenue;

    // This is the method defined in the observer interface.
    public void newSaleWasMade (double priceOfTheSaleThatWasJustMade)
    {
        priceOfSale(priceOfTheSaleThatWasJustMade); // Calculate
        // the total amount paid since the program started .
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
