package com.edd;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {
    private Person person = null;

    @RequestMapping("/person")
    public Person getPerson() {
        return person;
    }

    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public Person createPerson(@RequestBody Person person) {
        this.person = person;
        return this.person;
    }
}
