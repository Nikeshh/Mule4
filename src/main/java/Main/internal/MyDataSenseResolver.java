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
        implements InputTypeResolver<String>, OutputTypeResolver<String>, AttributesTypeResolver<String> {

    @Override
    public String getResolverName() {
        return "MyDataSenseResolver";
    }

    @Override
    public String getCategoryName() {
        return "MyDataSenseResolver";
    }

    @Override
    public MetadataType getInputMetadata(MetadataContext metadataContext, String entityKeyId) {
        return new BaseTypeBuilder(MetadataFormat.JAVA).numberType().build();
    }

    @Override
    public MetadataType getOutputType(MetadataContext metadataContext, String entityKeyId) {
        return metadataContext.getTypeLoader().load(MyCustomObject.class);
    }

    @Override
    public MetadataType getAttributesType(MetadataContext metadataContext, String entityKeyId)
            throws MetadataResolvingException, ConnectionException {
        if ("Book_id".equals(entityKeyId)) {
            return metadataContext.getTypeLoader().load(MyCustomObject.class);
        }

        return metadataContext.getTypeBuilder().nullType().build();
    }
}