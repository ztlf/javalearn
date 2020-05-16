import java.io.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;


public class IOStreamReadWriteJson {
    public static void main(String[] argus) throws IOException {
        InputStream inputStream = new FileInputStream(System.getProperty("user.dir")+"/src/data.json");
        byte[] buffer = new byte[200];
        int length = 0;

        while (-1 != (length = inputStream.read(buffer, 0, 200))) {
            String each = new String(buffer, 0, length);//now should know why need length variable
            System.out.println(each);
        }
        inputStream.close();
        inputStream = new FileInputStream(System.getProperty("user.dir")+"/src/data.json");



        JsonReader reader = new JsonReader(new InputStreamReader(inputStream, "UTF-8"));
        Gson gson = new GsonBuilder().create();
        JsonObject J_Object = gson.fromJson(reader,JsonObject.class);

        String order_time = J_Object.get("service").getAsJsonObject()
                .get("serviceBody").getAsJsonObject()
                .get("serviceRequest").getAsJsonObject()
                .get("order").getAsJsonObject()
                .get("orderTimeStamp").getAsString();
        System.out.print(order_time);

        JsonObject name = J_Object.get("service").getAsJsonObject()
                .get("serviceBody").getAsJsonObject()
                .get("serviceRequest").getAsJsonObject()
                .get("order").getAsJsonObject()
                .get("billingName").getAsJsonObject();

        String email = J_Object.get("service").getAsJsonObject()
                .get("serviceBody").getAsJsonObject()
                .get("serviceRequest").getAsJsonObject()
                .get("order").getAsJsonObject()
                .get("contact").getAsJsonObject().get("email").getAsString();

        JsonObject billingAddress = J_Object.get("service").getAsJsonObject()
                .get("serviceBody").getAsJsonObject()
                .get("serviceRequest").getAsJsonObject()
                .get("order").getAsJsonObject()
                .get("billingName").getAsJsonObject();


        JsonObject res = new JsonObject();
        res.add("name", name);
        res.addProperty("email", email);
        res.add("address",billingAddress);

        JsonWriter writer = new JsonWriter(new FileWriter(new File("output.json")));
        gson.toJson(res, writer);
        writer.close();
        reader.close();
        inputStream.close();
    }
}
