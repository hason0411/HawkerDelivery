package com.colon3.cz2006.hawkerdelivery.Entity;

/**
 * Created by Hippo on 02/04/2016.
 */
public class VendorAccount extends Account{


    public VendorAccount(String password, String username) {

        super(password, username);
        this.setDomain("Vendor");
    }
}
