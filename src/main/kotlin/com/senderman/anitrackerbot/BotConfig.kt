package com.senderman.anitrackerbot

import com.fasterxml.jackson.annotation.JsonProperty

class BotConfig {
    @JsonProperty(required = true)
    lateinit var login: String

    @JsonProperty
    lateinit var help: String

    @JsonProperty
    lateinit var anidata: String

}