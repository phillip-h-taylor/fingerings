package stubadapter;

import com.google.common.collect.Lists;
import domain.fingering.Fingering;
import domain.instrument.Instrument;
import domain.note.Note;
import org.springframework.stereotype.Component;
import web.port.FingeringsPort;

@Component
public class StubFingeringsAdapter implements FingeringsPort {

    @Override
    public Fingering getFingering(final Instrument instrument, final Note note) {
        return new Fingering(Lists.newArrayList());
    }
}