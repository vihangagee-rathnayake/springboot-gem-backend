package com.srilankagem.gembackend.gem.controller;

import com.srilankagem.gembackend.gem.service.GemStoneService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/gems")
public class GemStoneController {

    private final GemStoneService gemStoneService;


    public GemStoneController(GemStoneService gemStoneService) {
        this.gemStoneService = gemStoneService;
    }
}
