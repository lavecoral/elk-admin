package me.lavecoral.elk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lave
 */
@RestController
public class HealthController {

    @GetMapping("/check")
    public String check() {
        return "OK";
    }
}
