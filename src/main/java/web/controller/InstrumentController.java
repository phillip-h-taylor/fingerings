package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import domain.instrument.Instrument;

@Controller
public class InstrumentController {

    @RequestMapping(path="/{instrument}", method = RequestMethod.GET)
    public ModelAndView getInstrumentPage(@PathVariable(value = "instrument") final Instrument instrument) {
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(instrument.getViewName());
        return modelAndView;
    }

}
