package com.avin.MailSending.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.avin.MailSending.Model.MailStructure;
import com.avin.MailSending.service.MailService;

@RestController
@RequestMapping("/sending")
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping("/{mail}")
    public String sendMail(@PathVariable String mail, @RequestBody MailStructure mailStructure) {
        mailService.sendMail(mail, mailStructure);
        return "Successfully sent the mail !!";
    }
}