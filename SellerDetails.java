

import java.io.Serializable;
 

/**
 * @version 1.0
 * @author Jegan This bean is to set and get Advertisement seller details
 * 
 */
public class SellerDetails implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    private String sellerFirstName;

    private String sellerMiddleName;

    private String sellerLastName;
    
    private int mobileNumber;
    
    private int homeNumber;
    
    private String email;
    
    private String country;
    
    private String state;
    
    private String place;

    public String getSellerFirstName()
    {
        return sellerFirstName;
    }

    public void setSellerFirstName(String sellerFirstName)
    {
        this.sellerFirstName = sellerFirstName;
    }

    public String getSellerMiddleName()
    {
        return sellerMiddleName;
    }

    public void setSellerMiddleName(String sellerMiddleName)
    {
        this.sellerMiddleName = sellerMiddleName;
    }

    public String getSellerLastName()
    {
        return sellerLastName;
    }

    public void setSellerLastName(String sellerLastName)
    {
        this.sellerLastName = sellerLastName;
    }

    public int getMobileNumber()
    {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber)
    {
        this.mobileNumber = mobileNumber;
    }

    public int getHomeNumber()
    {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber)
    {
        this.homeNumber = homeNumber;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getPlace()
    {
        return place;
    }

    public void setPlace(String place)
    {
        this.place = place;
    }
    
    

}
