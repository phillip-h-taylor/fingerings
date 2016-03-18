package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import domain.fingering.Fingering;
import domain.instrument.Instrument;
import domain.note.Accidental;
import domain.note.Note;
import domain.note.OctaveNumber;
import domain.note.Pitch;
import web.usecase.FingeringsUseCase;

@RestController
public class FingeringsController {

    @Autowired
    private FingeringsUseCase fingeringsUseCase;

    @RequestMapping(path = "/fingering", method = RequestMethod.GET)
    public Fingering getFingering(@RequestParam(value = "instrument") final Instrument instrument,
                                  @RequestParam(value = "octave") final Integer octaveNumber,
                                  @RequestParam(value = "pitch") final Pitch pitch,
                                  @RequestParam(value = "accidental") final Accidental accidental) {
        return fingeringsUseCase.getFingering(instrument, new Note(new OctaveNumber(octaveNumber), pitch, accidental));
    }
}
