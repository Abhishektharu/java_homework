public class Instrument {

    // 1. The Instrument class has five attributes, which correspond to the
    // instrument id,
    // instrument name, customer name, customer mobile number and Customer Permanent
    // Account Number No. (PAN). Instrument id is numerical variable. Instrument
    // name,
    // Customer name and customer mobile number represented as string of text. PAN
    // No.
    // represented as number.

    private int id;
    private String instrumentName;
    private String customerName;
    private String customerNumber;
    private int permanentAccountNumber;

    // The instrument name is initialized in the constructor by being assigned the
    // value of the
    // constructor's parameter. In the constructor, Instrument id set to 0.
    // Additionally, in the
    // constructor, assign Customer name, customer mobile number as an empty string,
    // PAN is
    // initialized as 0.

    /*
     * initilizing the constructor of instrument
     */

    public void instrument(int id, String instrumentName,
            String customerName, String customerNumber, int permanentAccountNumber) {
        this.id = 0;
        this.instrumentName = instrumentName;
        this.customerName = "";
        this.customerNumber = "";
        this.permanentAccountNumber = 0;

    }

    // Each attribute has a corresponding accessor method. Define setter methods to
    // all the
    // attributes.

    // getter method
    public int getId() {
        return id;
    }

    // get for instrument name;
    public String getInstrumentName() {
        return instrumentName;
    }

    // get for customer name;
    public String getCustomerName() {
        return customerName;
    }

    // get for number;
    public String CustomerNumber() {
        return customerNumber;
    }

    // get for pan number;
    public int PermanentAccountNumber() {
        return permanentAccountNumber;
    }

    /*
     * setter for all the attributes;
     */

    // setter for id;
    public void setId(int id) {
        this.id = id;
    }

    // setter of name;
    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerNumber(String customerNumbeString) {
        this.customerName = customerNumbeString;
    }

    public void setPermanentAccountNumber(int permanentAccountNumber) {
        this.permanentAccountNumber = permanentAccountNumber;
    }

    // A display method will output (suitably annotated) the Instrument ID, Instrument name. If
    // them also.
    public void display(){
        
    }
}
