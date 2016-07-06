package com.github.seratch.jslack.api.methods.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GroupsKickRequest {

    private String token;
    private String channel;
    private String user;
}