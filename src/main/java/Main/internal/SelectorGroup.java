package Main.internal;

import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.metadata.MetadataKeyPart;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

public class SelectorGroup {

    @Parameter
    @Alias("FirstSelector")
    @DisplayName("First Selector")
    @MetadataKeyPart(order = 1)
    private String service;

    @Parameter
    @Alias("SecondSelector")
    @DisplayName("Second Selector")
    @MetadataKeyPart(order = 2)
    private String action;

    public SelectorGroup() {

    }

    public SelectorGroup(String service, String action) {
        this.service = service;
        this.action = action;
    }

    public String getService() {
        return service;
    }

    public String getAction() {
        return action;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setAction(String action) {
        this.action = action;
    }
}