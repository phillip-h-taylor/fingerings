package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClarinetController {

    @RequestMapping(path="/clarinet", method = RequestMethod.GET)
    public ModelAndView getClarinetPage() {
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("clarinet");
        return modelAndView;
    }

}
