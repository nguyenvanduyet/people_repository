package com.module4.controller;



import com.module4.model.People;
import com.module4.service.IPeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("/people")
public class PeopleController {
    @Autowired
    private IPeopleService peopleService;

    @GetMapping
    public ModelAndView showAll(){
        ModelAndView modelAndView = new ModelAndView("list");
        List<People>peopleList = peopleService.findAll();
        modelAndView.addObject("people",peopleList);
        return modelAndView;
    }
    @GetMapping("/delete/{id}")
    public ModelAndView remote(@PathVariable int id){
        ModelAndView modelAndView =new ModelAndView("redirect:/people");
        peopleService.deletePeople(id);
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView create(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("people", new People());
        return modelAndView;
    }
    @PostMapping("/create")
    public ModelAndView createPeople(@ModelAttribute People people){
        peopleService.save(people);
        ModelAndView modelAndView = new ModelAndView("redirect:/people");
        return modelAndView;
    }
    @GetMapping("edit/{id}")
    public ModelAndView editPeople(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("edit");
        People people = peopleService.findById(id);
        modelAndView.addObject("people",people);
        return modelAndView;
    }
    @PostMapping("edit/{id}")
    public ModelAndView edit(@ModelAttribute People people,@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("redirect:/people");
        people.setId(id);
        peopleService.save(people);
        return modelAndView;
    }



}
