package adaptercsv;

import com.google.common.collect.Lists;
import domain.fingering.Fingering;
import domain.instrument.Instrument;
import domain.key.ClarinetKey;
import domain.note.Note;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import web.port.FingeringsPort;

@Component
@Profile("integrated")
public class FingeringsCsvAdapter implements FingeringsPort {

    @Override
    public Fingering getFingering(final Instrument instrument, final Note note) {
        return new Fingering(Lists.newArrayList(ClarinetKey.LH_thumbhole, ClarinetKey.octave_key));
    }

}
