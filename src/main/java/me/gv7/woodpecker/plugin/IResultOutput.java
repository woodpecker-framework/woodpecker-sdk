package me.gv7.woodpecker.plugin;

public interface IResultOutput {
    public void rawPrintln(String str);
    public void debugPrintln(String str); // [D]
    public void infoPrintln(String str); // [*]
    public void successPrintln(String str); // [+]
    public void failPrintln(String str); // [-]
    public void warningPrintln(String str); // [!]
    public void errorPrintln(String str); // [x]
    public void startPrintln(String str); // [>]
    public void stopPrintln(String str); // [=]
}
