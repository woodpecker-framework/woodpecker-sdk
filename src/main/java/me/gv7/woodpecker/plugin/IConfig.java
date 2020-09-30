package me.gv7.woodpecker.plugin;

public interface IConfig {
    public String getDefaultLng();
    public boolean isDEBUG();
    public int getHttpSleepTime() ;
    public String getHttpProxyHost();
    public int getHttpProxyPort();
    public String getHttpProxyUsername();
    public String getHttpProxyPassword();
    public String getSock5ProxyHost();
    public int getSock5ProxyPort();
    public String getSock5ProxyUsername();
    public String getSock5ProxyPassword();
}
