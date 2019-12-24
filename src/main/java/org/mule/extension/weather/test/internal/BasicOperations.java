package org.mule.extension.weather.test.internal;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;


/**
 * This class is a container for operations, every public method in this class will be taken as an extension operation.
 */
public class BasicOperations {
		
	 public void create(@MetadataKeyId(RecordKeysResolver.class) String type,
             @Config BasicConfiguration config){
	 }
}
