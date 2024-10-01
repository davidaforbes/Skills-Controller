package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping("/")
    public String homepage() {
        return "<html>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li> Java </li>" +
                "<li> JavaScript </li>" +
                "<li> Python </li>" +
                "</ol>" +
                "</html>";
    }
    @GetMapping("form")
    public String form() {
        return "<html>" +
                "<form action='/submit-form' method='POST'>" +
                    "<label for='name'> Name: </label><br>" +
                        "<input type='text' id='name'> </input><br>" +
                    "<label for='first'> My favorite language: </label><br>" +
                        "<select name='options' id='options'>" +
                            "<option value='Java'> Java </option>" +
                            "<option value='Javascript'> JavaScript </option>" +
                            "<option value='Python'> Python </option>" +
                        "</select><br>" +
                    "<label for='second'> My second favorite language: </label><br>" +
                        "<select name='options' id='options'>" +
                            "<option value='Java'> Java </option>" +
                            "<option value='Javascript'> JavaScript </option>" +
                            "<option value='Python'> Python </option>" +
                        "</select><br>" +
                    "<label for='third'> My third favorite language: </label><br>" +
                        "<select name='options' id='options'>" +
                            "<option value='Java'> Java </option>" +
                            "<option value='Javascript'> JavaScript </option>" +
                            "<option value='Python'> Python </option>" +
                        "</select><br>" +
                "<input type='submit'> </input>";

    }
    @PostMapping("form")
    public String results(@RequestParam String name){

        return name;
    }
}

