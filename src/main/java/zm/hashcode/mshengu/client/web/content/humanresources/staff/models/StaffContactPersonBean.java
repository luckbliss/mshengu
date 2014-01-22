/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.hashcode.mshengu.client.web.content.humanresources.staff.models;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
/**
 *
 * @author Ferox
 */
public final class StaffContactPersonBean implements Serializable {

    private String id;
    private String parentId;
    
    
    private String contactPersonId;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String mainNumber;
    private String otherNumber;
    private String emailAddress;
    private String address;
    private String position;
    


    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the parentId
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * @param parentId the parentId to set
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * @return the contactPersonId
     */
    public String getContactPersonId() {
        return contactPersonId;
    }

    /**
     * @param contactPersonId the contactPersonId to set
     */
    public void setContactPersonId(String contactPersonId) {
        this.contactPersonId = contactPersonId;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the mainNumber
     */
    public String getMainNumber() {
        return mainNumber;
    }

    /**
     * @param mainNumber the mainNumber to set
     */
    public void setMainNumber(String mainNumber) {
        this.mainNumber = mainNumber;
    }

    /**
     * @return the otherNumber
     */
    public String getOtherNumber() {
        return otherNumber;
    }

    /**
     * @param otherNumber the otherNumber to set
     */
    public void setOtherNumber(String otherNumber) {
        this.otherNumber = otherNumber;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    

  }
