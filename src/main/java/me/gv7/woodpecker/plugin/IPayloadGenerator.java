package me.gv7.woodpecker.plugin;

import java.util.List;
import java.util.Map;

public interface IPayloadGenerator {
    public String getPayloadTabCaption();
    public List<IArgs> getCutomArgs();
    public void generatorPayload(Map<String, String> customArgs, IResultOutput resultOutput);
}
