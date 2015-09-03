/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractioninheritancepractice;

/**
 *
 * @author joshuabrown
 */
public abstract class SmallAppliance implements Appliance {
    private String brandName;
    private String modelNumber;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }
    
    
    
    
    
}
