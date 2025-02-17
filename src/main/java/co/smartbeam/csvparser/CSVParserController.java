package co.smartbeam.csvparser;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class CSVParserController {

    // TODO add service

    @PostMapping("/upload")
    public ResponseEntity<Integer> uploadCSV() throws IOException {
        //Todo save all persons from resources/person.csv
        // Returns the number of persons
        return null;
    }

    @GetMapping("/persons")
    public List<Person> getAllPersons() {
        //TODO : return list of persons
        return null;
    }

    //TODO : return person by its Id

}
