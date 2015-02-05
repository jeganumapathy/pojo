
import java.io.Serializable;
import java.util.Date;


/**
 * @version 1.0
 * @author Jegan This bean is to set and get Advertisement details
 * 
 */
public class AdvertisementDetails implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    private int advtID;
    
    private String advtOwnerName;
    
    private String advtCategory;
    
    private String advtContent;
    
    private Date advtPostedDate;
    
    private Date advtExpiryDate;
    
    private String advtVerified;
    
    private String advtPostedVia;

    
    public int getAdvtID()
    {
        return advtID;
    }

    public void setAdvtID(int advtID)
    {
        this.advtID = advtID;
    }

    public String getAdvtOwnerName()
    {
        return advtOwnerName;
    }

    public void setAdvtOwnerName(String advtOwnerName)
    {
        this.advtOwnerName = advtOwnerName;
    }

    public String getAdvtCategory()
    {
        return advtCategory;
    }

    public void setAdvtCategory(String advtCategory)
    {
        this.advtCategory = advtCategory;
    }

    public String getAdvtContent()
    {
        return advtContent;
    }

    public void setAdvtContent(String advtContent)
    {
        this.advtContent = advtContent;
    }

    public Date getAdvtPostedDate()
    {
        return advtPostedDate;
    }

    public void setAdvtPostedDate(Date advtPostedDate)
    {
        this.advtPostedDate = advtPostedDate;
    }

    public Date getAdvtExpiryDate()
    {
        return advtExpiryDate;
    }

    public void setAdvtExpiryDate(Date advtExpiryDate)
    {
        this.advtExpiryDate = advtExpiryDate;
    }

    public String getAdvtVerified()
    {
        return advtVerified;
    }

    public void setAdvtVerified(String advtVerified)
    {
        this.advtVerified = advtVerified;
    }
    
    public String getAdvtPostedVia()
    {
        return advtPostedVia;
    }

    public void setAdvtPostedVia(String advtPostedVia)
    {
        this.advtPostedVia = advtPostedVia;
    }


}
