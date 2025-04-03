import org.example.Run;
import org.example.Utility.JsonManager;
import org.example.controller.UniversityController;
import org.example.model.University;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JsonManagerTest {
    @Test
    public void isJsonSerializationWorkCorrectly() {
        Run.createTypycalUniversity();
        University oldUniversity = UniversityController.getUniversity();

        JsonManager.saveUniversity(oldUniversity);

        University newUniversity = JsonManager.readUniversity();

        Assertions.assertEquals(oldUniversity, newUniversity);
    }
}
