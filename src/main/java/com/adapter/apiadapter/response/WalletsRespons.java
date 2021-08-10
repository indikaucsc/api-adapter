/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adapter.apiadapter.response;

/**
 *
 * @author Viraj
 */
public class WalletsRespons {
   
	private int wallet_id;
	private String wallet_name;

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
