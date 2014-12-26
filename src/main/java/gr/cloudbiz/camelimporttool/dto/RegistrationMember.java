package gr.cloudbiz.camelimporttool.dto;

import java.io.Serializable;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",")
public class RegistrationMember implements Serializable {

    private static final long serialVersionUID = 28L;
    @DataField(pos = 1)
    private final String countryCode;
    @DataField(pos = 3)
    private String lastName;
    @DataField(pos = 2)
    private String firstName;
    @DataField(pos = 4)
    private String mobileTelephone;
    private String landlineTelephone;
    @DataField(pos = 5)
    private String emailAddress;
    @DataField(pos = 6)
    private String addressLine;
    @DataField(pos = 7)
    private String town;
    private String registrationCode;
    @DataField(pos = 8)
    private String schemaCode;
    protected GenderEnum gender;
    private boolean deleteFlag;

    private static final String DEFAULT_COUNTRY_CODE = "gr";

    public RegistrationMember() {
        this.countryCode = DEFAULT_COUNTRY_CODE;
    }

    public RegistrationMember(String countryCode) {
        this.countryCode = countryCode;
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

    public String getLandlineTelephone() {
        return landlineTelephone;
    }

    public void setLandlineTelephone(String landlineTelephone) {
        this.landlineTelephone = landlineTelephone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getRegistrationCode() {
        return registrationCode;
    }

    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
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

    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getCountryCode() {
        return countryCode;
    }

}
