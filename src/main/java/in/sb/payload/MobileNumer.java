package in.sb.payload;

public class MobileNumer {
    private String mobileNumber;

    public MobileNumer(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "MobileNumer{" +
                "mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
