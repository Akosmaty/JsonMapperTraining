
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.catalina.mapper.Mapper;


import java.io.File;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;

public class Main {


    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JavaClasss jc = new JavaClasss();

        jc = mapper.readValue(Paths.get("K:\\kurs\\JsonMapperTraining\\src\\main\\resources\\Json.json").toFile(),JavaClasss.class);
       System.out.println(jc.toString());
    }
}
