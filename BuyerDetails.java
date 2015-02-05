

import java.io.Serializable;
 

/**
 * @version 1.0
 * @author Jegan This bean is to set and get Advertisement buyer details
 * 
 */
public class BuyerDetails implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    private String buyerFirstName;

    private String buyerMiddleName;

    private String buyerLastName;
    
    private int mobileNumber;
    
    private int homeNumber;
    
    private String email;
    
    private String country;
    
    private String state;
    
    private String place;

    public String getBuyerFirstName()
    {
        return buyerFirstName;
    }

    public void setBuyerFirstName(String buyerFirstName)
    {
        this.buyerFirstName = buyerFirstName;
    }

    public String getBuyerMiddleName()
    {
        return buyerMiddleName;
    }

    public void setBuyerMiddleName(String buyerMiddleName)
    {
        this.buyerMiddleName = buyerMiddleName;
    }

    public String getBuyerLastName()
    {
        return buyerLastName;
    }

    public void setBuyerLastName(String buyerLastName)
    {
        this.buyerLastName = buyerLastName;
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
