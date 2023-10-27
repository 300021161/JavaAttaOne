import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class WriteInJson {

    public void serializeList(Object[] array, String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(new File(filePath), array);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}