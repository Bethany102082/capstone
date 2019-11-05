package org.launchcode.capstone.controllers;

import org.launchcode.capstone.models.Log;
import org.launchcode.capstone.models.data.LogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "")
public class LogController {

    @Autowired
    private LogDao logDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("title", "Please sign in");
        model.addAttribute("logs", logDao.findAll());
        return "index";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String loggedIn(Model model, @RequestParam String name, @RequestParam String church) {
        Log log = new Log(name, church);
        logDao.save(log);
        model.addAttribute("title", "Please sign in");
        model.addAttribute("logs", logDao.findAll());
        return "index";
    }
}
