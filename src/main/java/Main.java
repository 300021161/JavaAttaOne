import java.util.List;

public class Main {

    public static void main(String[] args) {
        Generator generator = new Generator();

        Restaurant[] restaurants = generator.generator(1_00_000);

        WriteInJson writeInJson = new WriteInJson();

        writeInJson.serializeList(restaurants, "player.json");

        ReadFromJson readFromJson = new ReadFromJson();

        List<Restaurant> listRes = readFromJson.deserializer("player.json");

        System.out.println(listRes.size());
    }
}