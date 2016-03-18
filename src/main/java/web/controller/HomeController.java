package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import domain.note.OctaveNumber;

@Controller
public class HomeController {

    @RequestMapping(path="/", method = RequestMethod.GET)
    public ModelAndView index(@RequestParam(name = "name", required = false) String name) {
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", name);
        modelAndView.setViewName("index");


        final OctaveNumber octaveNumber = new OctaveNumber(4);
        System.out.println(octaveNumber);





        return modelAndView;
    }

}
