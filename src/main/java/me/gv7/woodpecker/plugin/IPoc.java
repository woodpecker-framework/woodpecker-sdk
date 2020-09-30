package me.gv7.woodpecker.plugin;

import java.util.List;
import java.util.Map;

public interface IPoc {
    public List<IArgs> createPocCustomArgs();
    public IScanResult doCheck(String target, Map<String, String> args);
}
