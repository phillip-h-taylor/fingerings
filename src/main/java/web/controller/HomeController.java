package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import web.service.CollaboratorService;

@Controller
public class HomeController {

    @Autowired
    public CollaboratorService collaboratorService;

    @RequestMapping(path="/", method = RequestMethod.GET)
    public ModelAndView index(@RequestParam(name = "name", required = false) String name) {
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", name);
        modelAndView.addObject("collaborators", collaboratorService.getCollaborators());
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
