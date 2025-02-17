package co.smartbeam.csvparser;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class CSVParserController {


    @PostMapping("/upload")
    public ResponseEntity<String> uploadCSV(@RequestParam("file") MultipartFile file) {
        //TO COMPLETE
        return null;
    }

    @GetMapping("/persons")
    public List<Person> getAllPersons() {
        return null;
    }


    }
