package co.smartbeam.csvparser;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class CSVService {

    // TODO add repository

    public int readCsv(String filePath) throws IOException {
        //TODO get file from path (use ClassPathResource) and convert
        InputStream is = null;
        try (Reader reader = new BufferedReader(new InputStreamReader(is))) {
            CsvToBean<Person> csvToBean = new CsvToBeanBuilder<Person>(reader)
                    .withType(Person.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            //TODO parse csvToBean and save to DB

            //TODO return number of persons
            return 0;
        }
    }
}

