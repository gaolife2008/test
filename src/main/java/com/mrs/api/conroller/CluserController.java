package com.mrs.api.conroller;

import com.mrs.api.domain.User;
import com.mrs.api.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CluserController {
    @Autowired
    private IService IService;

    @RequestMapping("/api/hello")
    public User getString() {

        return IService.getString();
    }

}
