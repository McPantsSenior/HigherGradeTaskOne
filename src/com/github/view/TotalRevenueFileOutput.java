package com.github.view;
import com.github.model.Observable;
import com.github.model.SaleObserver;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/* Source for TotalIncomeFileOutput() inspiration:
 Lindbäck, L. (2023). A First Course in Object Oriented Development. Creative Commons
 Attribution 4.0 International License.
*/

/**
 * Used to print the total income to a file.
 */
public class TotalRevenueFileOutput extends Observable 
{
    private PrintWriter OutputFile;

    /**
     * Creates a new file .
     */
    public TotalRevenueFileOutput() 
    {
        try
        {
            OutputFile = new PrintWriter (new FileWriter("totalIncome.txt"), true); 
        }
        catch (IOException IOe)
        {
           System.out.println("Failed to make file");
           IOe.printStackTrace();
        }
    }

    @Override
    protected void doShowTotalIncome() throws Exception
    {
        OutputFile.println("Date: " + java.time.LocalDate.now() + " Total revenue: " + this.totalRevenue + "\n");
    }

    @Override
    protected void handleErrors(Exception e) 
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'handleErrors'");
    }
}
