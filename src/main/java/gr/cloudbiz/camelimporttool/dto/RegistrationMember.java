package gr.cloudbiz.camelimporttool.dto;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@XmlRootElement(name = "RegistrationMember")
@XmlAccessorType(XmlAccessType.FIELD)
@CsvRecord(separator = ",")
public class RegistrationMember implements Serializable {

    private static final long serialVersionUID = 28L;
    @DataField(pos = 1)
//    @XmlElement(name = "Country", required = true)
    private final String countryCode;
    @XmlElement(name = "AddressCountry")
    private String addressCountryCode;
//    @XmlElement(name = "LastName", required = true)
    @DataField(pos = 3)
    private String lastName;
    @DataField(pos = 2)
//    @XmlElement(name = "FirstName", required = true)
    private String firstName;
    @DataField(pos = 4)
//    @XmlElement(name = "Mobile")
    private String mobileTelephone;
//    @XmlElement(name = "LandLine")
    private String landlineTelephone;
    @DataField(pos = 5)
//    @XmlElement(name = "Email")
    private String emailAddress;
    @XmlElement(name = "Region", required = true)
    private String regionCode;
    @DataField(pos = 6)
//    @XmlElement(name = "Address", required = true)
    private String addressLine;
    @DataField(pos = 7)
//    @XmlElement(name = "Town", required = true)
    private String town;
    @XmlElement(name = "PostCode")
    private String postCode;
    @XmlElement(name = "PoBox")
    private String poBox;
    @XmlElement(name = "BirthDate")
    private Date dateOfBirth;
    @XmlElement(name = "MaritalStatusId")
    private Integer maritalStatusId;
    @XmlElement(name = "PersonTitleId")
    private Integer personTitleId;
    @XmlElement(name = "PersonSalutationId")
    private Integer personSalutationId;
    @XmlElement(name = "Language")
    private String languageCode;
    @XmlElement(name = "Store")
    private String registrationStoreCode;
//    @XmlElement(name = "RegistrationCode")
    private String registrationCode;
    private String loyaltyCardNumber;
    @XmlElement(name = "RegistrationDate", required = true)
    private Date registrationDate;
    @DataField(pos = 8)
//    @XmlElement(name = "Schema")
    private String schemaCode;
//    @XmlElement(name = "Gender")
    protected GenderEnum gender;
    @XmlElement(name = "RegistrationSourceCode")
    private String registrationSourceCode;

    private Integer pointBalance;
//    @XmlElement(name = "DeleteFlag")
    private boolean deleteFlag;
    private Integer memberId;
    private static final String DEFAULT_COUNTRY_CODE = "gr";

    public RegistrationMember() {
        this.countryCode = DEFAULT_COUNTRY_CODE;
    }

    public RegistrationMember(String countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * Don't be confused with the addressCountry which is the address/home
     * country
     *
     * @return the registration country code
     */
    public String getCountryCode() {
        return countryCode;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMobileTelephone() {
        return mobileTelephone;
    }

    public void setMobileTelephone(String mobileTelephone) {
        this.mobileTelephone = mobileTelephone;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPoBox() {
        return poBox;
    }

    public void setPoBox(String poBox) {
        this.poBox = poBox;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getMaritalStatusId() {
        return maritalStatusId;
    }

    public void setMaritalStatusId(Integer maritalStatusId) {
        this.maritalStatusId = maritalStatusId;
    }

    public Integer getPersonTitleId() {
        return personTitleId;
    }

    public void setPersonTitleId(Integer personTitleId) {
        this.personTitleId = personTitleId;
    }

    public Integer getPersonSalutationId() {
        return personSalutationId;
    }

    public void setPersonSalutationId(Integer personSalutationId) {
        this.personSalutationId = personSalutationId;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getRegistrationStoreCode() {
        return registrationStoreCode;
    }

    public void setRegistrationStoreCode(String registrationStoreCode) {
        this.registrationStoreCode = registrationStoreCode;
    }

    public String getRegistrationCode() {
        return registrationCode;
    }

    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
    }

    public String getLoyaltyCardNumber() {
        return loyaltyCardNumber;
    }

    public void setLoyaltyCardNumber(String loyaltyCardNumber) {
        this.loyaltyCardNumber = loyaltyCardNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Integer getPointBalance() {
        return pointBalance;
    }

    public void setPointBalance(Integer pointBalance) {
        this.pointBalance = pointBalance;
    }

    public String getLandlineTelephone() {
        return landlineTelephone;
    }

    public void setLandlineTelephone(String landlineTelephone) {
        this.landlineTelephone = landlineTelephone;
    }

    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getSchemaCode() {
        return schemaCode;
    }

    public void setSchemaCode(String schemaCode) {
        this.schemaCode = schemaCode;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public String getRegistrationSourceCode() {
        return registrationSourceCode;
    }

    public void setRegistrationSourceCode(String registrationSourceCode) {
        this.registrationSourceCode = registrationSourceCode;
    }

    /**
     * Don't be confused with the CountryCode which is the registration Country
     *
     * @return the address Country code
     */
    public String getAddressCountryCode() {
        return addressCountryCode;
    }

    /**
     *
     *
     * @param addressCountryCode
     */
    public void setAddressCountryCode(String addressCountryCode) {
        this.addressCountryCode = addressCountryCode;
    }

}
