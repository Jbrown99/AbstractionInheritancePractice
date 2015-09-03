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
public class Dragon extends LegendaryCreature {
    
    private String name;
    private String specialAbility;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }
    
    
    
    
    
    
    public void eat(){
        System.out.println("The dragon is eating");
        
    }
    
}
