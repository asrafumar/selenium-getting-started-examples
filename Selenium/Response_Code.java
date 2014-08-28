import org.apache.http.client.fluent.Request;


public class Response_Code {

	public static void main(String[] args) {
		String url = "http://google.com";
		
		System.out.println(checkResponse("http://gmail.com"));
		System.out.println(checkResponse("http://qtpselenium.com"));
		

	}

	public static boolean checkResponse(String url) {
		
		try{
			int resp_code = Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
			
			System.out.println("Response Code for URL " + url+ " is  -> " + resp_code);
			
			if (resp_code ==200) {
				return true;
			}else
				return false;
			
		} catch(Exception e) {
			return false;
		}
	}
}
