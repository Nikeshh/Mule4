package Main.internal;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import java.util.Map;

import org.mule.runtime.extension.api.annotation.metadata.MetadataKeyId;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.metadata.TypeResolver;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;

/**
 * This class is a container for operations, every public method in this class
 * will be taken as an extension operation.
 */
public class MuletestOperations {

  /**
   * Example of an operation that uses the configuration and a connection instance
   * to perform some action.
   */
  @MediaType(value = ANY, strict = false)
  public String retrieveInfo(@Config MuletestConfiguration configuration, @Connection MuletestConnection connection) {
    return "Using Configuration [" + configuration.getConfigId() + "] with Connection id [" + connection.getId() + "]";
  }

  /**
   * Example of a simple operation that receives a string parameter and returns a
   * new string message that will be set on the payload.
   */
  @MediaType(value = ANY, strict = false)
  public String sayHi(String person) {
    return buildHelloMessage(person);
  }

  @OutputResolver(output = MyDataSenseResolver.class) 
  public void create(@TypeResolver(MyDataSenseResolver.class) String type,
      @ParameterGroup(name = "Operation Name") @MetadataKeyId(DataSenseResolver.class) SelectorGroup selector) {
  }

  /**
   * Private Methods are not exposed as operations
   */
  private String buildHelloMessage(String person) {
    return "Hello " + person + "!!!";
  }
}
