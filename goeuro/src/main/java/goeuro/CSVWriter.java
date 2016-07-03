package goeuro;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class CSVWriter<T>
{
	private Class<T> type;
	public CSVWriter(Class<T> type) { 
		this.type = type; 
	}

	//Generic class which takes any type of list of objects and convert it into CSV. 
	//Using Jackson library, converting list of objects into CSV file.
	public int ToCSV (List<T> output, String outputPath) {
		
		try {
		    CsvMapper mapper = new CsvMapper();
		    CsvSchema schema = mapper.schemaFor(type).withHeader();
		    
		    FileWriter fw = new FileWriter(outputPath);
		    fw.append(mapper.writer(schema).writeValueAsString(output));
			fw.flush();
			fw.close();
		    return 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error - Failed to write into CSV : " + e.getMessage());
			return 0;
		}
	}
	
}