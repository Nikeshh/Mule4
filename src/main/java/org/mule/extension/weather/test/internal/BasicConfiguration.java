package org.mule.extension.weather.test.internal;

import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.Optional;

/**
 * This class represents an extension configuration, values set in this class are commonly used across multiple
 * operations since they represent something core from the extension.
 */
@Operations(BasicOperations.class)
@ConnectionProviders(BasicConnectionProvider.class)
public class BasicConfiguration {
  
    /**
     * Greeting message
     */
	@Parameter
	@Optional(defaultValue="Hello")
    private String greeting;

    /**
     * Reply message
     */
	@Parameter
	@Optional(defaultValue="How are you?")
    private String reply;
	
	@Parameter
	@Optional(defaultValue="How are you?")
    private String newvariable;

    /**
     * Set greeting message
     *
     */
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    /**
     * Get greeting message
     */
    public String getGreeting() {
        return this.greeting;
    }

    /**
     * Set reply
     *
     */
    public void setReply(String reply) {
        this.reply = reply;
    }

    /**
     * Get reply
     */
    public String getReply() {
        return this.reply;
    }
}
