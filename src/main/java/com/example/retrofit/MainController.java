package com.example.retrofit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    Service service;

    @PostMapping("/createOrg")
    public String createOrg(@RequestBody OrgInput orgInput){

        service.saveOrg(orgInput);
        return "Org saved";

    }
}
