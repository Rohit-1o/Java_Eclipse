package share.market.entities;

public class StockHolder {
	private int dematAccountNo;
    private String name;
    private String emailAddress;

    public StockHolder(int dematAccountNo, String name, String emailAddress) {
        this.dematAccountNo = dematAccountNo;
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public int getDematAccountNo() {
        return dematAccountNo;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void displayDetails() {
        System.out.println("Account No: " + dematAccountNo + ", Name: " + name + ", Email: " + emailAddress);
    }

    public String buildDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Holder ID: ").append(dematAccountNo).append(", Name: ").append(name);
        return sb.toString();
    }
}
