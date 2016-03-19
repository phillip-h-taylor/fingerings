package web.usecase;

import domain.fingering.Fingering;
import domain.instrument.Instrument;
import domain.note.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.port.FingeringsPort;

@Component
public class FingeringsUseCase {

    @Autowired
    private FingeringsPort fingeringsPort;

    public Fingering getFingering(final Instrument instrument, final Note note) {
        return fingeringsPort.getFingering(instrument, note);
    }
}
