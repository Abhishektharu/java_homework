// The InstrumentToSell class is also a subclass of the Instrument class and it has
// three attributes:
// price - a whole number
// sellDate - a string of characters
// discountPercent - a whole number
// isSold - either true or false (Boolean)

public class InstrumentToSell extends Instrument {

    private double price;
    private String sellDate;
    private double discountPercent;
    private boolean isSold;

    // The constructor accepts two parameters, which are instrument name and price.
    // A call is
    // made to the superclass constructor with one parameter, instrument name. The
    // price is
    // assigned with the corresponding parameters values. Additionally, sellDate and
    // discount
    // percentage are set to empty string and 0 respectively. And isSold is set to
    // false.

    public InstrumentToSell(String instrumentName, double price) {
        super(instrumentName);
        // TODO Auto-generated constructor stub
        this.price = price;
        this.sellDate = "";
        this.discountPercent = 0;
        this.isSold = false;
    }

    // Each attribute has a corresponding accessor method. Define setter methods to
    // all the
    // attributes. While defining the setter method for price, if the instrument has
    // not sold out yet,
    // the new value is assigned to the price attribute. If the instrument is
    // already sold, then a
    // suitable message is output to the user indicating that it is therefore not
    // possible to change
    // the price

    // getter

    public double getPrice() {
        return price;
    }

    public String getSellDate() {
        return sellDate;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public boolean getIsSold() {
        return isSold;
    }

    // setter
    public void setPrice(double price) {
        if (isSold == false) {
            this.price = price;
        } else {
            System.out.println("The item is already sold out Sorry!! price can't be changed");
        }
    }

    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }

    public void setGetDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public void setIsSold(boolean isSold) {
        this.isSold = isSold;
    }

    // There is a method to sell the instruments. The method accepts, as parameters,
    // customer
    // name, phone, pan no, sellDate and discount percentage.

    public void toSellInstrument(String customerName, String customerNumber, int permanentAccountNumber,
            String sellDate,
            double discountPercent) {
        {
            // If the instrument is
            // already sold
            // out, an appropriate message including the customer details is displayed
            if (isSold == true) {
                System.out.println("Customer Details \n" +
                        "customer name " + customerName +
                        "customer mobile number " + customerNumber);
            }

            // If the Instrument
            // is available, customer details, sell date and discount percentage are
            // required to update
            // by the parameter values input to the method and the isSold status of the
            // Instrument is
            // changed to true.
            else {
                this.sellDate = sellDate;
                this.discountPercent = discountPercent;
                this.isSold = true;
            }

            // setting up customer name, pan from parents class with the parameters
            super.setCustomerName(customerName);
            super.setCustomerNumber(customerNumber);
            super.setPermanentAccountNumber(permanentAccountNumber);

            // price is calculated by price - discount amount;

            this.price = price - discountPercent;
        }

    }
    // A method to display the details of the instrument is required. It must have
    // the same
    // signature as the display method in the Instrument class.

    public void display() {
        super.display();
        if (isSold == true) {
            System.out.println("sold date is " + sellDate);
        }

        else {
            System.out.println("");
        }
    }

}