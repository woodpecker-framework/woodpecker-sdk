package me.gv7.woodpecker.plugin;

import java.io.OutputStream;
import java.util.List;

public interface IExtenderCallbacks {
    void setPluginName(String name);
    void setPluginVersion(String version);
    public void setPluginPath(String path);
    public void setPluginAutor(String autor);
    public void setVulName(String autor);
    public void setVulId(String vid);
    public void setVulCVSS(double cvss);
    public void setVulAutor(String autor);
    public void setVulSeverity(String severity);
    public void setVulCategory(String category);
    public void setVulProduct(String product);
    public void setVulScope(String scope);
    public void setVulDescription(String description);
    public void setVulDisclosureTime(String disclosureTime);
    public IPluginHelper getPluginHelper();
    public OutputStream getResultStdout();
    public void registerPoc(IPoc poc);
    public void registerExploitCommand(IExploitCommand expCommand);
    public void registerExploitUpload(IExploitUpload expUpload);
    public void registerExploitRead(IExploitRead expRead);
    public void registerExploitRevShell(IExploitReverseShell expRevShell);
    public void registerExploitBindShell(IExploitBindShell expBindShell);
    public void registerExploitCodeExec(IExploitCodeExec expCodeExec);
    public void registerExploitGetShell(IExploitGetShell expGetShell);
    public void registerExploitJNDInject(IExploitJNDInject expJNDInject);
    public void registerPayloadGenerator(List<IPayloadGenerator> payloadGeneratorList);
}
