package com.sun.content.server.operator.security.adaptor; 
import com.sun.content.server.service.security.User; 
import java.util.Date; 
import java.util.Hashtable; 
 
public class SampleUserImpl implements User 
{ 
 
    private Hashtable fInfo; 
 
    public SampleUserImpl() { 
 
        fInfo = new Hashtable(); 
 
        setLoginId("guest"); 
        setFirstName("guest"); 
        setLastName("guest"); 
        setPassword ("guest"); 
        setCreateDate(new Date()); 
        setActivateDate(new Date()); 
        fInfo.put("enabled", String.valueOf(true)); 
        setMiddleName("guest"); 
        setEmail("guest@email.com"); 
        setUniqueDeviceId("1231231233"); 
    } 
 
    public SampleUserImpl(String uid, String pwd, String fname, String lname,String mname,String gender, 
       String street1, String street2,String city, String state,String postalcode, 
       String country,String email,String phone,Date actdate,Date deactdate, 
       String salutation, boolean enabled, String uniqueDeviceId, boolean isprepay) { 
 
        fInfo = new Hashtable(); 
 
        setLoginId(uid); 
        setPassword(pwd); 
        setFirstName(fname); 
        setLastName(lname); 
        setMiddleName(mname); 
        setGender(gender); 
        setStreet1(street1); 
        setStreet2(street2); 
        setCity(city); 
        setState(state); 
        setPostalCode(postalcode); 
        setCountry(country); 
        setEmail(email); 
        setPhone(phone); 
        setFixedPhone(phone); 
         
        // It is safe to check the activation date and use current date if null 
        if ( actdate == null ) { 
            setCreateDate(new Date()); 
            setActivateDate(new Date()); 
        } 
        else { 
            setCreateDate(actdate); 
            setActivateDate(actdate); 
        } 
         
	   	setDeActivateDate(deactdate); 
        setSalutation(salutation); 
        setIsEnabled(enabled); 
        setUniqueDeviceId(uniqueDeviceId); 
        setIsPrepay(isprepay); 
    } 
 
    public SampleUserImpl(User inUser) { 
     
        fInfo = new Hashtable(); 
         
        setLoginId(inUser.getLoginId()); 
        setFirstName(inUser.getFirstName()); 
        setLastName(inUser.getLastName()); 
        setMiddleName(inUser.getMiddleName()); 
        setGender(inUser.getGender()); 
        setStreet1(inUser.getStreet1()); 
        setStreet2(inUser.getStreet2()); 
        setCity(inUser.getCity()); 
        setState(inUser.getState()); 
        setPostalCode(inUser.getPostalCode()); 
        setCountry(inUser.getCountry()); 
        setEmail(inUser.getEmail()); 
        setPhone(inUser.getPhone()); 
        setSalutation(inUser.getSalutation()); 
        setIsEnabled(inUser.isEnabled()); 
        setPassword(inUser.getPassword()); 
        setUniqueDeviceId(inUser.getUniqueDeviceId()); 
    } 
 
 
	// It is sometime useful to have the corresponding external user data as a 
  // hashtable 
    public Hashtable getExternalUserData()  
    { 
    	// Create a hash table  
		Hashtable externalData = new Hashtable(); 
		// Get all the external data from fInfo and update the external data 
		// externalData = parserUser(fInfo); 
        return externalData; 
    } 
 
    public Date getLastLogin() { 
        /**@todo:Implement this com.sun.content.server.service.security.User method*/ 
        throw new java.lang.UnsupportedOperationException("Method getLastLogin() not yet implemented."); 
  	} 
 
    public Object getAttribute(String param1) { 
    /**@todo:Implement this com.sun.content.server.service.security.User method*/ 
    throw new java.lang.UnsupportedOperationException("Method getAttribute() not yet implemented."); 
    } 
 
    public Object getAttribute(String param1, Object parm2) { 
        /**@todo:Implement this com.sun.content.server.service.security.User method*/ 
        throw new java.lang.UnsupportedOperationException("Method getAttribute() not yet implemented."); 
    } 
 
    public Hashtable getAttributes() { 
    /**@todo:Implement this com.sun.content.server.service.security.User method*/ 
    throw new java.lang.UnsupportedOperationException("Method getAttributes() not yet implemented."); 
    } 
 
    public void setHasLoggedIn(boolean param1) { 
		/**@todo:Implement this com.sun.content.server.service.security.User method*/ 
		throw new java.lang.UnsupportedOperationException("Method setAttribute() not yet implemented."); 
    } 
	public boolean hasLoggedIn() { 
		/**@todo:Implement this com.sun.content.server.service.security.User method*/ 
		throw new java.lang.UnsupportedOperationException("Method isConfirmed() not yet implemented."); 
    } 
 
    public void setAttribute(String param1, Object parm2) { 
        /**@todo:Implement this com.sun.content.server.service.security.User method*/ 
        throw new java.lang.UnsupportedOperationException("Method setAttribute() not yet implemented."); 
    } 
 
    public void setAttributes(Hashtable param1) { 
        /**@todo:Implement this com.sun.content.server.service.security.User method*/ 
        throw new java.lang.UnsupportedOperationException("Method setAttributes() not yet implemented."); 
    } 
 
 
    public String getLoginId() { 
        return (String)fInfo.get("loginId"); 
    } 
    public void setLoginId(String param1) { 
        if (param1 != null) 
        fInfo.put("loginId", param1); 
    } 
 
    public String getFirstName() { 
        return (String)fInfo.get("firstName"); 
    } 
    public void setFirstName(String param1) { 
        if (param1 != null) 
        fInfo.put("firstName", param1); 
    } 
 
    public String getLastName() { 
        return (String)fInfo.get("lastName"); 
    } 
    public void setLastName(String param1) { 
        if (param1 != null) 
            fInfo.put("lastName", param1); 
    } 
 
    public Date getCreateDate() { 
            return (Date)fInfo.get("createDate"); 
    } 
    public void setCreateDate(Date param1) { 
        if (param1 != null) 
            fInfo.put("createDate", param1); 
    } 
 
    public String getEmail() { 
            return (String)fInfo.get("email"); 
    } 
    public void setEmail(String param1) { 
        if (param1 != null) 
            fInfo.put("email", param1); 
    } 
 
    public boolean isConfirmed() { 
        /**@todo:Implement this com.sun.content.server.service.security.User method*/ 
        throw new java.lang.UnsupportedOperationException("Method isConfirmed() not yet implemented."); 
    } 
 
    public void updateLastLogin() throws java.lang.Exception { 
        /**@todo:Implement this com.sun.content.server.service.security.User method*/ 
        throw new java.lang.UnsupportedOperationException("Method updateLastLogin() not yet implemented."); 
    } 
 
    public String getMiddleName() { 
        return (String)fInfo.get("middleName"); 
    } 
    public void setMiddleName(String param1) { 
        if (param1 != null) 
            fInfo.put("middleName", param1); 
    } 
 
    public String getGender() { 
        return (String)fInfo.get("gender"); 
    } 
    public void setGender(String param1) { 
        if (param1 != null) 
            fInfo.put("gender", param1); 
    } 
 
    public String getStreet1() { 
        return (String)fInfo.get("street1"); 
    } 
    public void setStreet1(String param1) { 
        if (param1 != null) 
            fInfo.put("street1", param1); 
    } 
 
	public String getStreet2() { 
	    return (String)fInfo.get("street2"); 
	} 
	public void setStreet2(String param1) { 
	    if (param1 != null) 
	        fInfo.put("street2", param1); 
	} 
 
    public String getPostalCode() { 
        return (String)fInfo.get("postalCode"); 
    } 
    public void setPostalCode(String param1) { 
        if (param1 != null) 
            fInfo.put("postalCode", param1); 
    } 
 
    public String getCity() { 
        return (String)fInfo.get("city"); 
    } 
    public void setCity(String param1) { 
    if (param1 != null) 
        fInfo.put("city", param1); 
    } 
 
 
    public String getState() { 
        return (String)fInfo.get("state"); 
    } 
    public void setState(String param1) { 
        if (param1 != null) 
            fInfo.put("state", param1); 
    } 
 
	public String getCountry() { 
	        return (String)fInfo.get("country"); 
	} 
	public void setCountry(String param1) { 
		if (param1 != null) 
	    	fInfo.put("country", param1); 
	} 
 
    public String getPhone() { 
        return (String)fInfo.get("phone"); 
    } 
    public void setPhone(String param1) { 
        if (param1 != null) 
            fInfo.put("phone", param1); 
    } 
 
    public Date getActivateDate() { 
        return (Date)fInfo.get("activateDate"); 
    } 
    public void setActivateDate(Date param1) { 
        if (param1 != null) 
            fInfo.put("activateDate", param1); 
    } 
 
    public Date getDeActivateDate() { 
        return (Date)fInfo.get("deactivateDate"); 
    } 
    public void setDeActivateDate(Date param1) { 
        if (param1 != null) 
            fInfo.put("deactivateDate", param1); 
    } 
 
	public String getSalutation() { 
	    return (String)fInfo.get("salutation"); 
	} 
	public void setSalutation(String param1) { 
	if (param1 != null) 
	    fInfo.put("salutation", param1); 
	} 
 
    public boolean isEnabled() { 
        return Boolean.valueOf((String)fInfo.get("enabled")).booleanValue(); 
    } 
    public void setIsEnabled(boolean param1) { 
        fInfo.put("enabled", String.valueOf(param1)); 
    } 
 
    public String getPassword() { 
        return (String)fInfo.get("password"); 
    } 
    public void setPassword(String param1) { 
        if (param1 != null) 
            fInfo.put("password", param1); 
    } 
 
   public String getUniqueDeviceId(){ 
            return (String)fInfo.get("UniqueDeviceId"); 
   } 
   public void setUniqueDeviceId(String uniqueId){ 
            if (uniqueId != null)  
                fInfo.put("UniqueDeviceId", uniqueId); 
   } 
  
	public String getMobileId(){ 
	        return (String)fInfo.get("MobileId"); 
	}  
	public void setMobileId(String mobileId) { 
	        if (mobileId != null)  
	            fInfo.put("MobileId", mobileId); 
	} 
     
    public boolean isPrepay() { 
		Boolean isprepay = (Boolean)fInfo.get("isPrepay"); 
		return isprepay.booleanValue(); 
    }  
	public void setIsPrepay(boolean param1) { 
		fInfo.put("isPrepay", new Boolean(param1)); 
	} 
     
} 
