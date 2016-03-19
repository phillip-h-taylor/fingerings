package domain.note;

public class Note {

    private final OctaveNumber octaveNumber;
    private final Pitch pitch;
    private final Accidental accidental;

    public Note(final OctaveNumber octaveNumber, final Pitch pitch, final Accidental accidental) {
        this.octaveNumber = octaveNumber;
        this.pitch = pitch;
        this.accidental = accidental;
    }

    public OctaveNumber getOctaveNumber() {
        return octaveNumber;
    }

    public Pitch getPitch() {
        return pitch;
    }

    public Accidental getAccidental() {
        return accidental;
    }
}
