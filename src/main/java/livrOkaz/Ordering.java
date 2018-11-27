package livrOkaz;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class Ordering {
    private int orderingId;
    private Date dateOrdering;
    private Date dateDelivery;
    private double shippingFees;
    private int customerId;

    private double HT_Price;
    private double TVA; //5.5%
    private double TTC;
}
