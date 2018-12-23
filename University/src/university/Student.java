/*
 Creating objects from xml document/ Storing individual entires of the XML file
 */
package university;

/**
 *
 * @author China Moxey 
 */
public class Student {
    
    private String FirstName;
    private String LastName;
    private String age;
    private String gender;
    private String SSN;
    private String major;
    private String startDate;
    private String expectedGraduation;
    
    /**
     * getting the first name tag
     * @return FirstName
     */
    public String getFirstName()
    {
        return FirstName;
    }
    /**
     * setting the first name 
     * @param fname 
     */
    public void setFirstName(String fname)
    {
        this.FirstName = fname;
    }
    /**
     * getting the last name tag
     * @return LastName
     */
    public String getLastName()
    {
        return LastName;
    }
    /**
     * setting the last name 
     * @param lname 
     */
    public void setLastName(String lname)
    {
        this.LastName = lname;
    }
    /**
     * getting the age tag
     * @return age
     */
    public String getAge()
    {
        return age;
    }
    /**
     * setting the age 
     * @param Age 
     */
    public void setAge(String Age)
    {
        this.age = Age;
    }
    /**
     * getting the gender tag
     * @return gender 
     */
    public String getGender()
    {
        return gender;
    }
    /**
     * setting the gender 
     * @param Gender 
     */
    public void setGender(String Gender)
    {
        this.gender = Gender;
    }
    /**
     * getting the social security number tag
     * @return SSN
     */
    public String getSSN()
    {
        return SSN;
    }
    /**
     * setting the social security number 
     * @param ssn 
     */
    public void setSSN(String ssn)
    {
        this.SSN = ssn;
    }
    /**
     * getting the major tag
     * @return major 
     */
    public String getMajor()
    {
        return major;
    }
    /**
     * setting the major 
     * @param Major 
     */
    public void setMajor(String Major)
    {
        this.major = Major;
    }
    /**
     * getting the start date tag
     * @return startDate
     */
    public String getStartDate()
    {
        return startDate;
    }
    /**
     * setting the start date 
     * @param SD 
     */
    public void setStartDate(String SD)
    {
        this.startDate = SD;
    }
    /**
     * getting the excepted graduation tag
     * @return expectedGradution
     */
    public String getExpectedGraduation()
    {
        return expectedGraduation;
    }
    /**
     * setting expected graduation 
     * @param EG 
     */
    public void setExpectedGraduation(String EG)
    {
        this.expectedGraduation = EG;
    }
    @Override
    public String toString()
    {
        String str;
        str = "Student [First Name = "+this.FirstName+" Last Name = "+this.LastName+" Age = "
                +this.age+"Gender = "
                +this.gender+" Social Security Number = "+this.SSN+" Major = "+this.major+" Start Date = "
                +this.startDate+" ExcpectedGraduation = "+this.expectedGraduation+"]";
        return str;
    }
}
