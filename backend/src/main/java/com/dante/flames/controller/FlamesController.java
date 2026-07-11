package com.dante.flames.controller;

import com.dante.flames.dto.ApiResponse;
import com.dante.flames.dto.RelationshipRequest;
import com.dante.flames.dto.RelationshipResponse;
import com.dante.flames.service.FlamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"https://flamers.vercel.app", "https://flamers.aravindg.me", "http://localhost:5500", "http://127.0.0.1:5500"})
public class FlamesController {

    @Autowired
    private FlamesService flamesService;

    @PostMapping("/relationship")
    public ApiResponse<RelationshipResponse> calculate(
        @RequestBody RelationshipRequest request
    ) {
        RelationshipResponse response = flamesService.getRelationship(
            request.getName1(),
            request.getName2(),
            request.getMode()
        );

        return new ApiResponse<>(true, response);
    }
}
