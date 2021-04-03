package io.purplesheep.argeasy.parser;

import io.purplesheep.argeasy.annotations.Argument;
import io.purplesheep.argeasy.annotations.Argument.ArgumentType;


public class TestArguments {

    @Argument(required = true)
    private String name;

    @Argument(longName = "size")
    private Integer customSize;

    @Argument(name = 'r')
    private Boolean ready;

    @Argument(type = ArgumentType.FLAG)
    private Boolean quiet;

    public String getName() {
        return name;
    }

    public Integer getCustomSize() {
        return customSize;
    }

    public Boolean getReady() {
        return ready;
    }

    public Boolean getQuiet() {
        return quiet;
    }
}
