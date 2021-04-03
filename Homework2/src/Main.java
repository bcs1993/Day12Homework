public class Main {
    public static void main(String[] args) {
        Department<Wind> windType = new Department<>("Wind");
        Department<StringType> stringType = new Department<>("String");
        Department<Percussion> percussionType = new Department<>("Percussion");

        windType.addInstrument(new Wind("Flute"));
        stringType.addInstrument(new StringType("Guitar"));
        percussionType.addInstrument(new Percussion("Drums"));

    }
}
