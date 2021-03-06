package com.github.seratch.jslack.api.methods.request.chat;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatDeleteRequest implements SlackApiRequest {

    private String token;
    private String ts;
    private String channel;
    private boolean asUser;
}