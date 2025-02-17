package co.smartbeam.csvparser;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;
import java.util.List;


public class CSVParserController {

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
