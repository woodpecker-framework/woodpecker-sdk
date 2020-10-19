package me.gv7.woodpecker.plugin;

/*
 * @(#)IExtenderCallbacks.java
 *
 * Copyright woodpecker framework. All rights reserved.
 *
 * This code may be used to extend the functionality of woodpecker framework,
 * provided that this usage does not violate the license terms for those products.
 */

import java.util.List;

/**
* 这个接口被woodpecker框架用来传递一组回调给漏洞插件
* 漏洞插件可以通过该回调对框架进行某种操作。
*
* 当一个漏洞插件被加载时，woodpecker框架调用IVulPlugin#VulPluginMain方法，并传递实例
* <code>IVulPluginCallbacks</code>，供插件设置插件信息，漏洞信息和注册相关组件。
*/
public interface IVulPluginCallbacks {
    /**
     * 低危漏洞等级
     */
    public final static int VUL_SEVERITY_LOW = 0;
    /**
     * 中危漏洞等级
     */
    public final static int VUL_SEVERITY_MEDIUM = 1;
    /**
     * 高危漏洞等级
     */
    public final static int VUL_SEVERITY_HIGH = 2;
    /**
     * 远程命令执行或者远程代码执行漏洞类型
     */
    public final static String VUL_CATEGORY_RCE = "RCE";
    /**
     * 模版注入漏洞类型
     */
    public final static String VUL_CATEGORY_SSTI = "SSTI";
    /**
     * JNDI注入漏洞类型
     */
    public final static String VUL_CATEGORY_JNDI_INJECT = "JNDI inject";
    /**
     * XXE漏洞类型
     */
    public final static String VUL_CATEGORY_XXE = "XXE";
    /**
     * SSRF漏洞类型
     */
    public final static String VUL_CATEGORY_SSRF = "SSRF";
    /**
     * SQL注入漏洞类型
     */
    public final static String VUL_CATEGORY_SQL_INJECT = "SQL Inject";

    /**
     * 设置插件名称
     *
     * @param name 插件名称
     */
    void setVulPluginName(String name);

    /**
     * 设置插件版本
     *
     * @param version 插件版本
     */
    void setVulPluginVersion(String version);

    /**
     * 设置插件路径
     *
     * @param path 插件路径
     */
    public void setVulPluginPath(String path);

    /**
     * 设置插件作者
     *
     * @param author 插件作者
     */
    public void setVulPluginAuthor(String author);

    /**
     * 设置漏洞名称
     *
     * @param vulName 漏洞名称
     */
    public void setVulName(String vulName);

    /**
     * 设置漏洞编号，比如CVE编号，CNVD编号
     *
     * @param vid 漏洞编号
     */
    public void setVulId(String vid);

    /**
     * 设置漏洞CVSS分数
     *
     * @param cvss CVSS分数
     */
    public void setVulCVSS(double cvss);

    /**
     * 设置漏洞作者
     *
     * @param author 漏洞作者
     */
    public void setVulAuthor(String author);

    /**
     * 设置漏洞危害等级，分别有high(高危)，medium(中危)，low(低危)。woodpecker原则上只编写高危漏洞。
     *
     * @param severity 漏洞危害等级
     */
    public void setVulSeverity(String severity);

    /**
     * 设置漏洞类型，比如RCE,JNDI inject,SSTI
     *
     * @param category 漏洞类型
     */
    public void setVulCategory(String category);

    /**
     * 设置漏洞涉及的产品，比如Weblogic
     *
     * @param product 产品
     */
    public void setVulProduct(String product);

    /**
     * 设置漏洞影响的版本范围
     *
     * @param scope 影响范围
     */
    public void setVulScope(String scope);

    /**
     * 设置漏洞描述，可描述漏洞的原理和需要注意的地方
     *
     * @param description 漏洞描述
     */
    public void setVulDescription(String description);

    /**
     * 设置漏洞披露时间
     *
     * @param disclosureTime 漏洞披露时间
     */
    public void setVulDisclosureTime(String disclosureTime);

    /**
     * 获取插件辅助器,即<code>IPluginHelper</code>实例
     *
     * @return <code>IPluginHelper</code>实例
     */
    public IPluginHelper getPluginHelper();

    /**
     * 注册漏洞精准检测模块
     *
     * @param poc 漏洞精准检测实例，即<code>IPoc</code>实现类
     */
    public void registerPoc(IPoc poc);

    /**
     * 注册漏洞深度利用模块
     *
     * @param exploitList 漏洞深度利用实例列表，即<code>IExploit</code>实现类列表
     */
    public void registerExploit(List<IExploit> exploitList);

    /**
     * 注册荷载生成器模块
     *
     * @param payloadGeneratorList 荷载生成器列表，即<code>IPayloadGenerator</code>实现类列表
     */
    public void registerPayloadGenerator(List<IPayloadGenerator> payloadGeneratorList);
}
