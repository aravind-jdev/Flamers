package com.dante.flames.service;

import com.dante.flames.dto.RelationshipResponse;

public interface FlamesService {
RelationshipResponse getRelationship(String name1, String name2, String mode);

}
