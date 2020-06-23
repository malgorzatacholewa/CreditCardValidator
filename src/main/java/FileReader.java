import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileReader {

    public List<IssuerRule> readData(String filePath){
        List<IssuerRule> list = new ArrayList<>();
        try {

            FileInputStream fileInputStream = new FileInputStream(new File(filePath));
            Workbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.rowIterator();
            rowIterator.next();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                IssuerRule issuerRule = new IssuerRule(row.getCell(0).toString(),row.getCell(1).toString(), row.getCell(2).toString());
                list.add(issuerRule);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;

    }
}
