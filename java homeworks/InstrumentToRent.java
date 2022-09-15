public class InstrumentToRent extends Instrument {
    // 2. The InstrumentToRent class is a subclass of the Instrument class and has
    // three
    // attributes:
    // chargePerDay - a whole number
    // dateOfRent - a string of characters
    // dateOfReturn - a string of characters
    // noOfDays - a whole number
    // isRented - Either true or false

    private int chargePerDay;
    private String dateOfRent;
    private String dateOfReturn;
    private int noOfDays;
    private boolean isRented;

    // The constructor accepts two parameters, which are instrument name and
    // chargePerDay.
    // A call is made to the superclass constructor with one parameter, instrument
    // name. The
    // chargePerDay is assigned with the corresponding parameters values.
    // Additionally,
    // dateOfRent, dateOfReturn to empty string. noOfDays are set to 0 and isRented
    // is set to
    // false.

    public InstrumentToRent(String instrumentName, int chargePerDay) {
        super(instrumentName);
        this.chargePerDay = chargePerDay;
        this.dateOfRent = "";
        this.dateOfReturn = "";
        this.noOfDays = 0;
        this.isRented = false;
    }

    // Each attribute has a corresponding accessor method. Define setter methods to
    // all the
    // attributes
    // getter

    public int getChargePerDay() {
        return chargePerDay;
    }

    public String getDateOfRent() {
        return dateOfRent;
    }

    public String getDateOfReturn() {
        return dateOfReturn;
    }

    public int NoOfDays() {
        return noOfDays;
    }

    public boolean getIsRented() {
        return isRented;
    }

    // setter
    public void setChargePerDay(int chargePerDay) {
        this.chargePerDay = chargePerDay;
    }

    public void setDateOfRent(String dateOfRent) {
        this.dateOfRent = dateOfRent;
    }

    public void setDateOfReturn(String dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public void setIsRented(boolean isRented) {
        this.isRented = isRented;
    }

    // There is a method to rent out the Instrument to a customer. The method
    // accepts six
    // parameters, a new customer's name, phone, pan no, the date on which the
    // instrument is
    // rented, the date on which the Instrument is to be returned and no of days to
    // be rented. If
    // the Instrument is not available in the store, an appropriate message will be
    // shown with
    // customer name, phone and return date.

    public void toRentOut(String customerName, String customerNumber, int permanentAccountNumber,
            String dateOfRent, String dateOfReturn, int noOfDays) {
        if (isRented == false) {
            System.out.println("The name is " + customerName);
            System.out.println("The phone number is " + customerNumber);
            System.out.println("The return date is " + dateOfReturn);
        }

        else {
            super.setCustomerName(customerName);
            super.setCustomerNumber(customerNumber);
            super.setPermanentAccountNumber(permanentAccountNumber);
        }
        // If the Instrument is available, the methods to set
        // super class. The rented date, the return date and no. of days are all updated
        // by the
        // parameter values input to the method. .
        this.dateOfRent = dateOfRent;
        this.dateOfReturn = dateOfReturn;
        this.noOfDays = noOfDays;

        // Set isRented status to true.
        this.isRented = true;

        // After successfully
        // renting the instruments, customer details, rented quantity, return date, date
        // of renting, no
        // of days and total charge will be displayed in console.
        // Total charge will be calculated by
        // multiplying the no. of days and charges per day

        System.out.println("customer details " + customerName +
                "\n return date" + dateOfReturn +
                "\n date of renting " + dateOfRent +
                "\n no of days " + noOfDays +
                "\n total charge " + (noOfDays * chargePerDay));
    }

    // There is a method to return the instruments. Inside this method, if the
    // instrument is not in
    // rent, a suitable message is output.

    public void returnInstrument() {
        if (isRented == false) {
            System.out.println("The instrument is not rented.  ");
        }
        // If the instrument is in the r
        // phone, pan, return date, rent date to empty string, the number of renting
        // days to 0.
        // isRented status is set to false.
        else {
            super.setCustomerName("");
            super.setCustomerNumber("");
            // super.setPermanentAccountNumber("");
            this.dateOfReturn = "";
            this.dateOfRent = "";
            this.noOfDays = 0;
            this.isRented = false;

        }
    }

    // A method to display the details of the instrument is required. It must have
    // the same
    // signature as the display method in the Instruments class. It will call the
    // method in super
    // class to display the instrument id, instrument name. If the instrument has
    // rented already
    // then customer details, renting date and return date should also be displayed.
    // Each output
    // must be suitably annotated

    public void display() {
        super.display();
        if (isRented == true) {
            System.out.println("The date of rent name is: " + dateOfRent);
            System.out.println("The date of return name is: " + dateOfReturn);

        }
    }
}
