package goeuro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class jsonparser {

	//Below fields also be picked up from property file.
	static String NEW_LINE_SEPARATOR = "\n";
	static String DELIMITER = ",";
	static String ApiURL = "http://api.goeuro.com/api/v2/position/suggest/en/";
	static String outputFileName = "\\output.csv";

public static void main(String[] args) throws Exception {
		
		// Check number of parameters
		try{
			if(args.length != 1){
				System.out.println("Error - Incorrect number of parameters. Please provide country name.");
				return;
			}
			
			
			String countryName = args[0];
			String outputFilePath = System.getProperty("user.dir") + outputFileName;
			System.out.println("Info - Country Name : " + countryName);
			System.out.println("Info - Requesting Api Query at : " + ApiURL + countryName);
			String json = getAPIQueryResult(ApiURL + countryName);
			System.out.println("Info - Json Data received");
			Type listType = new TypeToken<ArrayList<Record>>(){}.getType();
	
			//Using GSON library converting JSON array to list of Record Class objects.
			//Record and GeoPosition class are generated from JSON schema. 
			List<Record> listOfRecords = new Gson().fromJson(json, listType);
			System.out.println("Info - Number of records received : " + listOfRecords.size());
			
			if(listOfRecords.size() > 0){
				//Selecting required fields from Record class and populating into Result.
				List<Result> output = listOfRecords.stream().map(e -> new Result(e.getId(), e.getName(), e.getType(), e.getGeoPosition().getLongitude(), e.getGeoPosition().getLatitude())).collect(Collectors.toList());
				
				//This can be done in multiple ways.  
				//1. Using reflection we can get class field names and object values. 
				//But reflection is very expensive operation for large number of records. 
				//2. Manually generating CSV by selecting fields.
				//3. Using third party library like  Super CSV or Jackson
				//writeToCSV(output, outputFilePath);
				//convertToCSV(output, outputFilePath);
				CSVWriter wt = new CSVWriter(Result.class);
				wt.ToCSV(output, outputFilePath);
				System.out.println("Info - CSV file is generated successfully at '" + outputFilePath + "'");
			}else{
				System.out.println("Info - No records received.");
			}
			
			
		}catch(IOException io){
			System.out.println("Error occured while getting the json records. Incorrect URL - " + io.getMessage());
		}
		catch(Exception e){
			System.out.println("Error Occured :" + e.getMessage());
		}
	}
	
	
	//This method will query the URL and returns the result as a string.
	private static String getAPIQueryResult(String urlString) throws IOException {
	    BufferedReader bReader = null;
	    try {
	        URL url = new URL(urlString);
	        
	        //Open the stream and read the buffer by character length and return JSON string
	        bReader = new BufferedReader(new InputStreamReader(url.openStream()));
	        StringBuffer buffer = new StringBuffer();
	        int numberOfCharacters;
	        char[] chars = new char[1024];
	        while ((numberOfCharacters = bReader.read(chars)) != -1)
	            buffer.append(chars, 0, numberOfCharacters); 

	        return buffer.toString();
	    }
	    finally {
	        if (bReader != null)
	        	bReader.close();
	    }
	    
	}
	
	

}
