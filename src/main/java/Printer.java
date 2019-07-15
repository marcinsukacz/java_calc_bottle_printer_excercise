public class Printer {

    private int sheets;
    private int tonerVolume;

    public Printer(){
        this.sheets = 100;
        this.tonerVolume = 200;
    }

    public int getSheets(){
        return this.sheets;
    }

    public int getToner(){
        return this.tonerVolume;
    }

    public void addSheets(int pages){
        this.sheets += pages;
    }

    public String print(int pages, int copies){
        if((this.sheets >= pages*copies)&&(this.tonerVolume >= pages*copies)){
            this.sheets -= pages*copies;
            this.tonerVolume -= pages*copies;
            return "Printed";
        }
        else if((this.sheets < pages*copies)&&(this.tonerVolume >= pages*copies)){
            return "Not enough paper";
        }
        else if((this.sheets >= pages*copies)&&(this.tonerVolume < pages*copies)){
            return "Not enough toner";
        }
        else{
            return "Missing both: paper and toner";
        }
    }


}





//
//    Create a Printer class that has a property for number of sheets of paper left.
//        Add a method to print that takes in a number of pages and number of copies.
//        The print method will only run if the printer has enough paper. If it runs it
//        will reduce the value of the paper left by number of copies * number of pages.
//        Add a toner volume property to the class.
//        Modify the printer so that it reduces the toner by 1 for each page printed.