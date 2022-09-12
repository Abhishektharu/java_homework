public class InstrumentToRent extends Instrument{
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

    public void instrumentToRent(String instrumentName, int chargePerDay){
        // super.getInstrumentName();
        // this.chargePerDay = chargePerDay;
        
    }
}
