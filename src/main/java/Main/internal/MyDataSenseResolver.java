package Main.internal;

import org.mule.metadata.api.builder.BaseTypeBuilder;
import org.mule.metadata.api.model.MetadataFormat;
import org.mule.metadata.api.model.MetadataType;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.metadata.MetadataContext;
import org.mule.runtime.api.metadata.MetadataResolvingException;
import org.mule.runtime.api.metadata.resolving.AttributesTypeResolver;
import org.mule.runtime.api.metadata.resolving.InputTypeResolver;
import org.mule.runtime.api.metadata.resolving.OutputTypeResolver;

public class MyDataSenseResolver
        implements InputTypeResolver<String>, OutputTypeResolver<String>{

    @Override
    public String getResolverName() {
        return MyDataSenseResolver.class.toString();
    }

    @Override
    public String getCategoryName() {
        return "createCategory";
    }

    @Override
    public MetadataType getInputMetadata(MetadataContext metadataContext, String entityKeyId) {
        return new BaseTypeBuilder(MetadataFormat.JAVA).numberType().build();
    }

    @Override
    public MetadataType getOutputType(MetadataContext metadataContext, String entityKeyId) {
        return metadataContext.getTypeLoader().load(MyCustomObject.class);
    }
}