package com.github.view;

import com.github.model.Observable;

/**
 * Used to show the total income on the user interface
 */
public class TotalRevenueView extends Observable
{
    @Override
    protected void doShowTotalIncome() throws Exception
    {
        System.out.println("Date: " + java.time.LocalDate.now() + " Total revenue: " + this.totalRevenue + "\n");
    }

    @Override
    protected void handleErrors(Exception e) {
        System.out.println("Couldnt write to console.");
    }
}
