package me.gv7.woodpecker.plugin;
/*
 * @(#)IArgsUsageBinder.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */
import java.util.List;

/**
 * 该接口绑定参数列表和对应的使用说明
 */
public interface IArgsUsageBinder {
    /**
     * 设置参数列表
     *
     * @param argsList 参数列表
     */
    public void setArgsList(List<IArg> argsList);

    /**
     * 设置使用说明
     *
     * @param usage 使用说明
     */
    public void setUsage(String usage);
}
