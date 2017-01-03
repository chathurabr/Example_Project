package com.frame;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by janesh on 7/14/2015.
 */
public class WriteToXLFile {


    public static void main(String[] args) {
        String fileName= "C:\\Users\\Chathura\\IdeaProjects\\Selenium_Example_Full_Project\\Example_Project\\excel.xls";

        try {
            File file = new File(fileName);
            FileInputStream fileInputStream = new FileInputStream(file);
            Workbook workbook = new HSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheet("Sheet1");
            sheet.getRow(0).getCell(0).setCellValue("Hello Selenium ");
            fileInputStream.close();

            FileOutputStream outputStream = new FileOutputStream(file);
            workbook.write(outputStream);
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}



