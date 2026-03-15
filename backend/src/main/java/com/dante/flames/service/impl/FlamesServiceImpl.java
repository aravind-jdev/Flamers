package com.dante.flames.service.impl;

import org.springframework.stereotype.Service;

import com.dante.flames.dto.RelationshipResponse;
import com.dante.flames.service.FlamesService;
import com.dante.flames.util.FlamesLogic;
import com.dante.flames.util.VerseGenerator;


@Service
public class FlamesServiceImpl implements FlamesService {

@Override
public RelationshipResponse getRelationship(String name1, String name2, String mode) {

    String result = FlamesLogic.calculateRelationship(name1, name2, mode);
    String verse = VerseGenerator.getRandomVerse(result);

    return new RelationshipResponse(result, verse);
    }
}

