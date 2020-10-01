package me.gv7.woodpecker.plugin;

public interface ITarget {
    public String getAddress();
    public String getRootAddress();
    public String getProtocol();
    public String getHost();
    public int getPort();
    public String getPath();
}
