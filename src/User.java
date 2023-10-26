abstract class User {
    private String fullName;
    private long iin;
    private String contactNumber;

    public User(String fullName, long iin, String contactNumber) {
        this.fullName = fullName;
        this.iin = iin;
        this.contactNumber = contactNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public long getIIN() {
        return iin;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    abstract void changeNumber(String number);
    abstract void changeFullName(String data);
}





