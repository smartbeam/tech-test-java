package co.smartbeam.csvparser;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;

public class CSVService {


    public Boolean readCsv(String path) throws IOException {
        //TODO get file from path and convert
        InputStream is = null;
        try (Reader reader = new BufferedReader(new InputStreamReader(is))) {
            CsvToBean<Person> csvToBean = new CsvToBeanBuilder<Person>(reader)
                    .withType(Person.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        }
        return true;
    }
}

