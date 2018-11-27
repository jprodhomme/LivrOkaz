package livrOkaz;

import java.sql.Date;

public class GoogleBooks {
    private String bookId;
    private String title;
    private int[] authorsId;
    private int publisherId;
    private Date publishReleased;
    private String codeISBN;
    private int pageCount;
    private String categorie; //en dur
    private String imgThumbnail;
    private String langage; //en dur
    private double price;
    private double discountPrice;
    private String textSnippet;
    private String description;
    private boolean isEbook;
    private int averageRating;
    private int gendleId; //en dur
    private int availableQuantity; //somme des 2 premiers caractères du bookId
    private int books_gendle_id;
    private int books_publisher_id;
    private int gendleId_R_GoogleBooks_Gendle;
    private int publisherId_R_GoogleBooks_Publisher;
}
