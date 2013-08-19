
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Whatever {

	public static void main(String[] args) throws JsonProcessingException {
		if (args.length < 1) {
			System.out.println("Usage: <this> blabla.json");
			System.exit(1);
		}
		
		ObjectMapper om = new ObjectMapper();
		try {
			JsonNode tree = om.readTree(new File(args[0]));
			System.out.println(tree.path("Common").path("Timestamp"));
		
		} catch (IOException e) {
			// NODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
