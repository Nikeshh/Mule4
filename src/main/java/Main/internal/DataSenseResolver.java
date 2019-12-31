package Main.internal;

import java.util.HashSet;
import java.util.Set;

import org.mule.runtime.api.metadata.MetadataContext;
import org.mule.runtime.api.metadata.MetadataKeyBuilder;
import org.mule.runtime.api.metadata.MetadataKey;
import org.mule.runtime.api.metadata.resolving.TypeKeysResolver;

public class DataSenseResolver implements TypeKeysResolver {

    @Override
    public String getResolverName() {
        return DataSenseResolver.class.toString();
    }
            
    @Override
    public String getCategoryName() {
        return "createCategory";
    }

    @Override
    public Set<MetadataKey> getKeys(MetadataContext metadataContext) {
        Set<MetadataKey> keys = new HashSet<>();

        MetadataKeyBuilder key1 = MetadataKeyBuilder.newKey("Key1");
        key1.withChild(MetadataKeyBuilder.newKey("Key1").build());
        key1.withChild(MetadataKeyBuilder.newKey("Key1").build());
        key1.withChild(MetadataKeyBuilder.newKey("Key1").build());
        keys.add(key1.build());

        MetadataKeyBuilder key2 = MetadataKeyBuilder.newKey("Key2");
        key2.withChild(MetadataKeyBuilder.newKey("Key2").build());
        key2.withChild(MetadataKeyBuilder.newKey("Key2").build());
        key2.withChild(MetadataKeyBuilder.newKey("Key2").build());
        keys.add(key2.build());

        MetadataKeyBuilder key3 = MetadataKeyBuilder.newKey("Key3");
        key3.withChild(MetadataKeyBuilder.newKey("Key3").build());
        key3.withChild(MetadataKeyBuilder.newKey("Key3").build());
        key3.withChild(MetadataKeyBuilder.newKey("Key3").build());
        keys.add(key3.build());

        return keys;
    }
}