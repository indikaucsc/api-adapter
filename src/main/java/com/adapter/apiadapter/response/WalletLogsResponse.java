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
public class WalletLogsResponse {
    
    private int walletid;
    private String msisdn;
    private int service_code;
    private String service_name;
    private BigDecimal amount;
    private Date datetime;
    private String comment;
    private String wallet_name;

    /**
     * @return the walletid
     */
    public int getWalletid() {
        return walletid;
    }

    /**
     * @param walletid the walletid to set
     */
    public void setWalletid(int walletid) {
        this.walletid = walletid;
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
     * @return the service_code
     */
    public int getService_code() {
        return service_code;
    }

    /**
     * @param service_code the service_code to set
     */
    public void setService_code(int service_code) {
        this.service_code = service_code;
    }

    /**
     * @return the service_name
     */
    public String getService_name() {
        return service_name;
    }

    /**
     * @param service_name the service_name to set
     */
    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    /**
     * @return the amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * @return the datetime
     */
    public Date getDatetime() {
        return datetime;
    }

    /**
     * @param datetime the datetime to set
     */
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return the wallet_name
     */
    public String getWallet_name() {
        return wallet_name;
    }

    /**
     * @param wallet_name the wallet_name to set
     */
    public void setWallet_name(String wallet_name) {
        this.wallet_name = wallet_name;
    }
    
}
