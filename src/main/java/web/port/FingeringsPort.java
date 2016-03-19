package web.port;

import domain.fingering.Fingering;
import domain.instrument.Instrument;
import domain.note.Note;

public interface FingeringsPort {

    public Fingering getFingering(final Instrument instrument, final Note note);
}
