package com.example.expensemanager;

public class expenseModel {
    private String expenseId;
    private String note;
    private String type;
    private String category;
    private long amount;
    private long time;
    private String Uid;

    public expenseModel() {

    }

    public expenseModel(String expenseId, String note, String type, String category, long amount, long time, String uid) {
        this.expenseId = expenseId;
        this.note = note;
        this.type = type;
        this.category = category;
        this.amount = amount;
        this.time = time;
        Uid = uid;
    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String uid) {
        Uid = uid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(String expenseId) {
        this.expenseId = expenseId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
