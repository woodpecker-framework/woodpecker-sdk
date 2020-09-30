package me.gv7.woodpecker.plugin;

public interface IScanResult {
    public void setTarget(String target);
    public void setExists(boolean exists);
    public void setMsg(String msg) ;
    public void setTime(String time);
    public boolean isExists();
}
