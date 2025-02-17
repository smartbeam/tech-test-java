package co.smartbeam.csvparser;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class CSVParserController {

    @PostMapping("/upload")
    public ResponseEntity<String> uploadCSV() throws IOException {
        //TO COMPLETE
        return null;
    }

    @GetMapping("/persons")
    public List<Person> getAllPersons() {
        //TODO : return list of persons
        return null;
    }

}
