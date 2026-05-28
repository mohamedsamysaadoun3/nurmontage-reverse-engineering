/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
package hazem.nurmontage.videoquran.Utils;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import hazem.nurmontage.videoquran.model.EntityQuranTemplate;
import java.lang.reflect.Type;

public class MItemAdabterJson
implements JsonSerializer,
JsonDeserializer {
    public EntityQuranTemplate deserialize(JsonElement object, Type object2, JsonDeserializationContext jsonDeserializationContext) {
        String string2;
        object2 = "com.hazem.s_din12_24.model.";
        try {
            object = object.getAsJsonObject();
            string2 = "properties";
        }
        catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
            return null;
        }
        string2 = object.get(string2);
        StringBuilder stringBuilder = new StringBuilder((String)object2);
        object2 = "type";
        object = object.get((String)object2);
        object = object.getAsString();
        object = stringBuilder.append((String)object);
        object = ((StringBuilder)object).toString();
        object = Class.forName((String)object);
        object = jsonDeserializationContext.deserialize((JsonElement)string2, (Type)object);
        return (EntityQuranTemplate)object;
    }

    public JsonElement serialize(EntityQuranTemplate entityQuranTemplate, Type type, JsonSerializationContext jsonSerializationContext) {
        type = new JsonObject();
        String string2 = entityQuranTemplate.getClass().getSimpleName();
        Object object = new JsonPrimitive(string2);
        type.add("type", (JsonElement)object);
        object = entityQuranTemplate.getClass();
        entityQuranTemplate = jsonSerializationContext.serialize((Object)entityQuranTemplate, (Type)object);
        type.add("properties", (JsonElement)entityQuranTemplate);
        return type;
    }
}

