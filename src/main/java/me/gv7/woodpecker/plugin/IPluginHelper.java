package me.gv7.woodpecker.plugin;

public interface IPluginHelper {
    public IArgs createArgs();
    public IScanResult createScanResult();
    public String getThrowableInfo(Throwable e);
}
