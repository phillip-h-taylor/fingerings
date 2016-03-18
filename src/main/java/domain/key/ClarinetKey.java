package domain.key;

public enum ClarinetKey implements Key {

    octave_key,
    LH_thumbhole;

    @Override
    public String getName() {
        return name();
    }
}
