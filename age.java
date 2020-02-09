import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class age {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
			URLConnection urlc = url.openConnection();
			urlc.setRequestProperty("User-Agent", "Chrome");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(urlc.getInputStream()));
			String str = "";

			while (null != (str = br.readLine())) {
				String setOfKeys = str.split(":")[1];
			
			String[] formattedKeys = setOfKeys.substring(1, setOfKeys.length()-2).split(",");

			int age_counter = 0;

			for(int i = 0; i < formattedKeys.length; i+=2)
			{
				//System.out.println(formattedKeys[i+1].substring(5));
				if(Integer.parseInt(formattedKeys[i+1].substring(5)) >= 50 )
					age_counter+=1;
			}

				System.out.println(age_counter);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		   
	}
}
