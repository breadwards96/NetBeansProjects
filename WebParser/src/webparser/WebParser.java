package webparser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.StringTokenizer;

/* @Author Brandon Edwards 
 * Date 1/29/18 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
public class WebParser {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        HttpURLConnection connection = (HttpURLConnection) new URL(
                "https://www.youtube.com").openConnection();

        int responseCode = connection.getResponseCode();

        InputStream in;

        if (200 <= responseCode && responseCode <= 299) {
            in = connection.getInputStream();
        } else {
            in = connection.getErrorStream();
        }

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(in));

        StringBuilder response = new StringBuilder();
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            response.append(currentLine);
        }
        StringTokenizer token = new StringTokenizer(response.toString(), "<", false);
        in.close();
        while(token.hasMoreTokens()){
            String result = token.nextToken();
            if(result.contains("/watch")){
                System.out.println(result);
            }
            
        }
        
        
        
    }
}
