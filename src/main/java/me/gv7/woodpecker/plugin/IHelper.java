package me.gv7.woodpecker.plugin;

/*
 * @(#)IHelper.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */
import java.util.Map;
/**
 * 漏洞辅助接口，插件通过实现该接口，可实现对漏洞利用的辅助。
 */
public interface IHelper {
    /**
     * 框架会调用该方法获取该辅助模块的选项卡标题，推荐通过辅助具体的功能设置返回值
     *
     * @return 该辅助模块选项卡标题
     */

    public String getHelperTabCaption();
    /**
     * 框架会调用该方法获取该辅助模块自定义参数列表
     *
     * @return 该辅助模块自定义参数列表和使用说明绑定对象
     */
    public IArgsUsageBinder getHelperCutomArgs();

    /**
     * Woodpecker框架会调用该方法，执行具体的辅助操作，并将执行结果输出到界面。
     *
     * @param customArgs 自定义参数
     * @param resultOutput 输出对象，用于打印各类信息。
     */
    public void doHelp(Map<String, Object> customArgs, IResultOutput resultOutput);
}
