package com.starta.pages.utils;

import org.testng.annotations.DataProvider;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class DataProviders {

    @DataProvider
    public Iterator<Object[]> regUserDataWithCsv() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                        DataProviders.class.getResourceAsStream("src/test/resources/data.csv")));
            List<Object[]> data = new ArrayList<Object[]>();
            String line = reader.readLine();

            while(line != null) {
                data.add(line.split(","));
                line = reader.readLine();
            }
            reader.close();
            return data.iterator();
        }
}

