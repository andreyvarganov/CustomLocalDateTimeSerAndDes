import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDateTime;

//"date" : "2020-10-20 12:45:30"

public class Application {
    public static void main(String[] args) throws IOException, ParseException {

        LocalDateTime currentDateTime = LocalDateTime.now();

        Event event = new Event(currentDateTime);

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("C:\\Users\\a.varganov\\IdeaProjects\\LearnJSON\\src\\main\\resources\\input.json"), event);

        Event receiveEvent = mapper.readValue(new File("C:\\Users\\a.varganov\\IdeaProjects\\LearnJSON\\src\\main\\resources\\input.json"), Event.class);
        System.out.println(receiveEvent.toString());
    }
}
