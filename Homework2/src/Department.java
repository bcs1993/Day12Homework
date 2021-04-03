import java.util.ArrayList;

public class Department <T extends Instrument> {
    private String name;
    private int numberOfInstruments = 0;
    private ArrayList<T> instrumentType = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department(String name) {
        this.name = name;
    }

    public int getNumberOfInstruments() {
        return numberOfInstruments;
    }

    public void setNumberOfInstruments(int numberOfInstruments) {
        this.numberOfInstruments = numberOfInstruments;
    }

    public ArrayList<T> getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(ArrayList<T> instrumentType) {
        this.instrumentType = instrumentType;
    }


    public void addInstrument(T instrument) {
        if (instrumentType.contains(instrument)) {
            System.out.println(instrument.getName() + " is already included");
        }
        else {
            instrumentType.add(instrument);
            System.out.println(instrument.getName() + " added to " + name);
        }

    }
}
