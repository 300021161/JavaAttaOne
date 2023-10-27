import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFromJson {

    public List<Restaurant> deserializer(String nameFile) {
        ObjectMapper objectMapper = new ObjectMapper();

        List<Restaurant> restaurants;

        try {
            String json = new String(Files.readAllBytes(Paths.get(nameFile)));

            restaurants = objectMapper.readValue(json, new TypeReference<>() {});

            return restaurants;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
