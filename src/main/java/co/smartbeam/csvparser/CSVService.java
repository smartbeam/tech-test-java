package co.smartbeam.csvparser;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class CSVService {


    public Boolean readCsv(String filePath) throws IOException {
        //TODO get file from path and convert
        InputStream is = null;
        try (Reader reader = new BufferedReader(new InputStreamReader(is))) {
            CsvToBean<Person> csvToBean = new CsvToBeanBuilder<Person>(reader)
                    .withType(Person.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            //TODO save to DB
        }
        return true;
    }
}

