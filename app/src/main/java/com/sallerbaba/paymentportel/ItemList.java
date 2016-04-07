package com.sallerbaba.paymentportel;

/**
 * Created by Choudhary on 07-Apr-16.
 */
public class ItemList {
    String i_name;
    String rate;
    String discription;
    String size;

    public ItemList(String i_name, String rate, String discription, String size) {
        this.i_name = i_name;
        this.rate = rate;
        this.discription = discription;
        this.size = size;

    }

    public String getI_name() {
        return i_name;
    }

    public void setI_name(String i_name) {
        this.i_name = i_name;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


}
