package org.example.Utility;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.University;

import java.io.File;
import java.io.IOException;

public class JsonManager {
    private static final String FILE_PATH = "data/university.json";

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void saveUniversity(University university) {
        try {
            objectMapper.writeValue(new File(FILE_PATH), university);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static University readUniversity() {
        try {
            return objectMapper.readValue(new File(FILE_PATH), University.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
