package me.gv7.woodpecker.plugin;

public interface IArgs {
    public final static int ARG_TYPE_STRING = 0;
    public final int ARG_TYPE_INT = 1;
    final int ARG_TYPE_PORT = 2;
    final int ARG_TYPE_IP = 3;
    final int ARG_TYPE_HTTP_URL = 4;
    void setName(String name);
    void setType(int type);
    void setDefaultValue(String defaultValue);
    void setMastSetup(boolean is);
    void setDescription(String desc);
}
