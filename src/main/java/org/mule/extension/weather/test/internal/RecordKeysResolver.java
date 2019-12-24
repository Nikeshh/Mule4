package org.mule.extension.weather.test.internal;

public class RecordKeysResolver implements TypeKeysResolver {

	  @Override
	  public String getCategoryName() {
	    return "Records";
	  }

	  @Override
	  public Set<MetadataKey> getKeys(MetadataContext context) throws MetadataResolvingException, ConnectionException {
	     // First we need to obtain the key IDs that will be used.
	     // This is where you'd normally use `context.getConfig()`
	     // or `context.getConnection()` to obtain the entity id's
	     // from a remote service, for this demo the keys will be fixed
	     List<String> keyIds = Arrays.asList("Author_id", "BookList_id", "Book_id");

	     HashSet<MetadataKey> keys = new HashSet<>();
	     for (String id: keyIds){
	       // For each possible if, we create a new MetadataKey with that ID
	       MetadataKeyBuilder builder = MetadataKeyBuilder.newKey(id);

	       // Then, we add a DisplayName to that MetadataKey,
	       // this will be the name shown in the UI
	       builder.withDisplayName(StringUtils.removeEnd(id, "_id"));

	       //finally, add the key to the Set of known MetadataKeys
	       keys.add(builder.build());
	     }

	     return keys;
	  }

	}
