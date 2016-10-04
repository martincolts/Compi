package Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Vector;

public class WordsFileLoader {
	
	private Properties properties = new Properties();
	private InputStream  inputFile ;
	private Vector<String> vec = new Vector<>();

	public Vector<String> loadReservedWords () throws IOException{
		try {
			
			inputFile = new FileInputStream("reservedWords.properties");
			properties.load(inputFile);
			System.out.println();
			String palabras [] = properties.getProperty("reservedWords").toString().split(",");
			for (String palabra : palabras){
				vec.add(palabra);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
	        if (inputFile != null) {
	            try {
	                inputFile.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
		
		return vec ;
	}
	
}
