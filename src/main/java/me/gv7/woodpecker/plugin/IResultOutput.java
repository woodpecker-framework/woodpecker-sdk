package me.gv7.woodpecker.plugin;

/*
 * @(#)IResultOutput.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */

/**
 * 本接口用于打印信息到框架信息显示处。
 */
public interface IResultOutput {
    /**
     * 打印原始字符串
     *
     * @param msg 原始信息
     */
    public void rawPrintln(String msg);

    /**
     * 打印调试信息，会在信息前面添加"[D] "。
     *
     * @param msg 调试信息
     */
    public void debugPrintln(String msg); // [D]

    /**
     * 打印普通信息，会在信息内容前面添加"[*] "
     *
     * @param msg 普通信息
     */
    public void infoPrintln(String msg); // [*]

    /**
     * 打印成功信息，会在信息内容前面添加"[+] "
     *
     * @param msg 成功信息
     */
    public void successPrintln(String msg); // [+]

    /**
     * 打印失败信息，会在失败信息前面添加"[-] "
     *
     * @param msg 失败信息
     */
    public void failPrintln(String msg); // [-]

    /**
     * 打印提示信息，会在提示信息前面添加"[!] "
     *
     * @param msg 提示信息
     */
    public void warningPrintln(String msg); // [!]

    /**
     * 打印错误信息，会在错误信息前面添加"[x] "
     *
     * @param msg 错误信息
     */
    public void errorPrintln(String msg); // [x]

    /**
     * 打印开始信息，会在开始信息添加"[>] "。一般用于某个模块开始执行时打印的信息。
     *
     * @param msg 开始信息
     */
    public void startPrintln(String msg); // [>]

    /**
     * 打印结束信息，会在结束信息添加"[=] "。一般用于某个模块执行完毕时打印的信息。
     *
     * @param msg 结束信息
     */
    public void stopPrintln(String msg); // [=]
}
