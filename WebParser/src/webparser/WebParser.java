/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webparser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.StringTokenizer;

/**
 *
 * @author brandonedwards
 */
public class WebParser {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        HttpURLConnection connection = (HttpURLConnection) new URL("https://www.youtube.com").openConnection();

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
