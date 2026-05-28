// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;
import hazem.nurmontage.videoquran.model.EntityQuranTemplate;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;

public class MItemAdabterJson implements JsonSerializer, JsonDeserializer
{
    public EntityQuranTemplate deserialize(JsonElement value, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        final String str = "com.hazem.s_din12_24.model.";
        try {
            final JsonObject asJsonObject = value.getAsJsonObject();
            final JsonElement value2 = asJsonObject.get("properties");
            try {
                final StringBuilder sb = new StringBuilder(str);
                value = asJsonObject.get("type");
                try {
                    final StringBuilder append = sb.append(value.getAsString());
                    try {
                        final String string = append.toString();
                        try {
                            final Object deserialize = jsonDeserializationContext.deserialize(value2, (Type)Class.forName(string));
                            try {
                                return (EntityQuranTemplate)deserialize;
                            }
                            catch (final ClassNotFoundException ex) {
                                ex.printStackTrace();
                                return null;
                            }
                        }
                        catch (final ClassNotFoundException ex2) {}
                    }
                    catch (final ClassNotFoundException ex3) {}
                }
                catch (final ClassNotFoundException ex4) {}
            }
            catch (final ClassNotFoundException ex5) {}
        }
        catch (final ClassNotFoundException ex6) {}
    }
    
    public JsonElement serialize(final EntityQuranTemplate entityQuranTemplate, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("type", (JsonElement)new JsonPrimitive(entityQuranTemplate.getClass().getSimpleName()));
        jsonObject.add("properties", jsonSerializationContext.serialize((Object)entityQuranTemplate, (Type)entityQuranTemplate.getClass()));
        return (JsonElement)jsonObject;
    }
}
