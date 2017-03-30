package reusing;

/**
 * Inheritance & upcasting.
 *
 * @author Dylan
 * @version 1.00 3/30/2017
 */
public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute); // Upcasting
    }
}

class Instrument {
    public void play() {
    }

    static void tune(Instrument i) {
        // ...
        i.play();
    }
}