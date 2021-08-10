/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adapter.apiadapter.response;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Viraj
 */
public class walletSummaryMsisdnResponse {
    
    private int wallet_id;
	private String msisdn;
	private BigDecimal available_balance;
        private Date created_date,updated_date;

    /**
     * @return the wallet_id
     */
    public int getWallet_id() {
        return wallet_id;
    }

    /**
     * @param wallet_id the wallet_id to set
     */
    public void setWallet_id(int wallet_id) {
        this.wallet_id = wallet_id;
    }

    /**
     * @return the msisdn
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * @param msisdn the msisdn to set
     */
    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    /**
     * @return the available_balance
     */
    public BigDecimal getAvailable_balance() {
        return available_balance;
    }

    /**
     * @param available_balance the available_balance to set
     */
    public void setAvailable_balance(BigDecimal available_balance) {
        this.available_balance = available_balance;
    }

    /**
     * @return the created_date
     */
    public Date getCreated_date() {
        return created_date;
    }

    /**
     * @param created_date the created_date to set
     */
    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    /**
     * @return the updated_date
     */
    public Date getUpdated_date() {
        return updated_date;
    }

    /**
     * @param updated_date the updated_date to set
     */
    public void setUpdated_date(Date updated_date) {
        this.updated_date = updated_date;
    }
    
    
    
}
