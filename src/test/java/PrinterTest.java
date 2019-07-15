import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void hasSheets(){
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void canAddSheets(){
        printer.addSheets(200);
        assertEquals(300, printer.getSheets());
    }

    @Test
    public void canPrint__True(){
        assertEquals("Printed", printer.print(20, 3));
    }

    @Test
    public void canPrint__False_1(){
        assertEquals("Not enough paper", printer.print(20, 10));
    }

    @Test
    public void canPrint__False_2(){
        printer.addSheets(200);
        assertEquals("Not enough toner", printer.print(25, 10));
    }

    @Test
    public void canPrint__False_3(){
        assertEquals("Missing both: paper and toner", printer.print(25, 10));
    }

    @Test
    public void reducesSheetsAfterPrinting(){
        printer.print(20, 2);
        assertEquals(60, printer.getSheets());
    }

    @Test
    public void reducesTonerAfterPrinting(){
        printer.print(20, 2);
        assertEquals(160, printer.getToner());
    }
}


//
//    Create a Printer class that has a property for number of sheets of paper left.
//        Add a method to print that takes in a number of pages and number of copies.
//        The print method will only run if the printer has enough paper. If it runs it
//        will reduce the value of the paper left by number of copies * number of pages.
//        Add a toner volume property to the class.
//        Modify the printer so that it reduces the toner by 1 for each page printed.