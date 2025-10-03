class Instrument {
    void play() {
        System.out.println("Instrument is playing...");
    }
}

class Guitar extends Instrument {
    void strum() {
        System.out.println("Guitar is strumming...");
    }
}

class inheritance1 {
    public static void main(String[] args) {
        Guitar ge = new Guitar();
        ge.play();   
        ge.strum();  
    }
}
