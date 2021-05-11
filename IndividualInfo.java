package com.tts;

public class IndividualInfo {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

    public IndividualInfo(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public IndividualInfo() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName +
                "; Last Name: " + lastName +
                "; Phone Number: " + phoneNumberCorrector(phoneNumber) +
                "; Email Address: " + emailAddress + ";"
                ;
    }

    public boolean isValid(String emailAddress) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return emailAddress.matches(regex);
    }

    public String phoneNumberCorrector(String aPhoneNumber) {
        StringBuilder sb = new StringBuilder(10);
        StringBuilder temp = new StringBuilder(aPhoneNumber);
        char[] chars = temp.toString().toCharArray();

        sb.append("(");
        for (int i = 0; i < chars.length; i++) {
            if (i == 3)
                sb.append(") ");
            else if (i == 6)
                sb.append("-");
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}