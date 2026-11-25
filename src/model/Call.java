package model;

public class Call {
    private int id;
    private String customer;
    private String transcript;

    public Call(int id, String customer, String transcript) {
        this.id = id;
        this.customer = customer;
        this.transcript = transcript;
    }

    public int getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public String getTranscript() {
        return transcript;
    }
}
