package livrOkaz;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.SQLException;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import connection.AccesBD;

public class GoogleBooksFinder {

    public static void main(String[] args) throws JSONException, MalformedURLException, IOException, ClassNotFoundException, SQLException {
      
        String url = "https://www.googleapis.com/books/v1/volumes?q=cooking&maxResults=40&key=AIzaSyAPOsreRHHdYcdZ4pX7YNXBujTndpGJF9k";
       // String url = "file:///C:/simplon/volumes.json"; 
        String jsonText = IOUtils.toString(new URL(url), Charset.forName("UTF-8"));
        
        
        
        String requete = "INSERT INTO `Gendle` (`typeGendle`) VALUES ('Aventure'), ('Science-fiction'), ('Documentaire');";
        AccesBD.executerUpdate(requete);

        
        
        GoogleBooks googleBooks = new GoogleBooks();

        
        
        String jsonTxt = IOUtils.toString(new URL(url), Charset.forName("UTF-8"));
        
        JSONObject json = new JSONObject(jsonTxt);
        
        JSONArray items = null;
        JSONObject item = null;
        JSONObject searchInfo = null;

        try {
        items = json.getJSONArray("items");
        item = (JSONObject) items.get(5);
        
        } catch(JSONException e) {  
        }
        
    
        try {
            searchInfo = item.getJSONObject("searchInfo");
        } catch(JSONException e) {
        }
        
        
        
        JSONObject saleInfo = item.getJSONObject("saleInfo");
        JSONObject volumeInfo = item.getJSONObject("volumeInfo");
        JSONObject imageLink = volumeInfo.getJSONObject("imageLinks");
        JSONArray industryIdentifiers = volumeInfo.getJSONArray("industryIdentifiers");
        JSONObject ISBN_1010 = (JSONObject) industryIdentifiers.get(0);
    
            
/*****************************************************************
**************************** ID **********************************
******************************************************************/
        String id = item.getString("id");
        
        System.out.println(id);

/*****************************************************************
************************** TITLE *********************************
******************************************************************/
        String title = volumeInfo.getString("title");
        
        System.out.println(title);


/*****************************************************************
************************* AUTHORS ********************************
******************************************************************/
        JSONArray authors = null;
        
        try {
            authors = volumeInfo.getJSONArray("authors"); 
            
        } catch(JSONException e) {
            authors = null;
            
        }finally {
            System.out.println(authors);
        }

/*****************************************************************
************************* PUBLISHER ******************************
******************************************************************/
        String publisher = "";
        
        try {
            publisher = volumeInfo.getString("publisher");
            
        } catch(JSONException e) {
            publisher = "unknown";
            
        }finally {
            System.out.println(publisher);
        }


/*****************************************************************
*********************** PUBLISHED DATE ***************************
******************************************************************/ 
        String publishedDate = "";
        
        try {
            publishedDate = volumeInfo.getString("publishedDate");
            
        } catch (JSONException e) {
            publishedDate = "unknown";
            
        } finally {
            System.out.println(publishedDate );
        }
        
/*****************************************************************
************************ ISBN_10 *********************************
******************************************************************/
        String ISBN_10 = "";
        
        try {
            ISBN_10 = ISBN_1010.getString("identifier");
            ISBN_10 = ISBN_10.substring(ISBN_10.indexOf(":")+1);
            
            
        }catch(JSONException e) {
            ISBN_10 = "unknown";
            
        }finally {
            System.out.println(ISBN_10);
        }

/*****************************************************************
************************* PAGE COUNT *****************************
******************************************************************/
        int pageCount = 0;
        
        try {
            pageCount = volumeInfo.getInt("pageCount");
            
        }catch(JSONException e) {
            pageCount = 0;
            
        }finally {
            System.out.println(pageCount);
        }

/*****************************************************************
************************** THUMBNAIL *****************************
******************************************************************/
        String imgThumbnail = "";
        
        try {
            imgThumbnail = imageLink.getString("smallThumbnail");
            
        }catch(JSONException e) {
            imgThumbnail = "can't find thumbnail";
            
        }finally {
            System.out.println(imgThumbnail);
        }

        
/*****************************************************************
**************************** PRICE *******************************
******************************************************************/
        double price = 0;
        
        try {
            JSONObject listPrice = saleInfo.getJSONObject("listPrice");
            price = listPrice.getDouble("amount");

        } catch(JSONException e) {
            price =0;
            
        } finally {
            System.out.println(price);
        }
        
/*****************************************************************
*************************** SNIPPET ******************************
******************************************************************/
        String snippet = "";
        
        try {
            snippet = searchInfo.getString("textSnippet");
        } catch (JSONException e) {
            
            snippet = "can't find snippet";
        }catch(NullPointerException n) {
            snippet = "can't find snippet";
        }
        finally {
        
        System.out.println(snippet);
        }
        
        
/*****************************************************************
************************* DESCRIPTION ****************************
******************************************************************/
        String description = "";

        try {
            description = volumeInfo.getString("description");
        } catch (JSONException e) {
            description = "can't find description";
            
        } catch(NullPointerException n) {
            description = "can't find description";
            
        }
        finally {
            System.out.println(description);
        }
/*****************************************************************
*************************** eBOOK ********************************
******************************************************************/
        boolean isEbook = true;
        
        try {
            isEbook = saleInfo.getBoolean("isEbook");
        
        } catch(JSONException e) {
            isEbook = false;
            
        } finally {
            System.out.println(isEbook);
        }
        
/*****************************************************************
************************** RATING ********************************
******************************************************************/
        int averageRating = 0;
        
        try {
            averageRating = volumeInfo.getInt("averageRating");
            
        } catch (JSONException e) {
            averageRating = 0;
            
        } finally {
        System.out.println(averageRating);
        }
        
    }

}
