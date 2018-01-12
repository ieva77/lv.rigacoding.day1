/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day1;

/**
 *
 * @author user
 */
public class Address {
    public String country;
    
    public String city;
    
    // pilna adrese
    public String getFullAddress(){
        String fullAddress = "";
        
        if(country != null && country != ""){
            fullAddress += country + ", ";
            //fullAddress = fullAddress + country + ",";
        }
        
        if(city != null && city != ""){
            fullAddress += city + ", ";    
        }
        
        // "Latvia, Riga,"
        if(fullAddress.length() > 0){
            fullAddress = fullAddress.substring(0, fullAddress.length() - 2);
        }
        
        return fullAddress;
    }
    
}
