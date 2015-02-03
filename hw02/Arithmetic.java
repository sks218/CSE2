/*
Sahib Singh
sks218
2/2/15
hw02
Arithmetic.java
*/

import java.text.DecimalFormat;

public class Arithmetic{
    
    public static void main(String[] args){
        
        DecimalFormat df = new DecimalFormat("##.##"); // allows me to return a double with 2 placeholds to the right of the decimal point
        
        int nSocks = 3; //number of socks
        double sockCost = 2.58; //price per sock
        int nGlasses = 6; //number of glasses
        double glassCost = 2.29; //price per glass
        
        int nEnvelopes = 1; //number of envelope
        double envelopeCost = 3.25; //price per envelopes
        
        double taxPercent = 0.06; //tax percent in PA
        
        double totalSockCost = (nSocks*sockCost); //total sock cost before tax
        double totalTaxSockCost = (totalSockCost*taxPercent) + totalSockCost; //total sock cost after tax
    
        double totalGlassCost = nGlasses*glassCost; //total glass cost before tax
        double totalTaxGlassCost = (totalGlassCost*taxPercent) + totalGlassCost; //total glass cost after tax
        
        double totalEnvelopeCost = nEnvelopes*envelopeCost; //total envelope cost before tax
        double totalTaxEnvelopeCost = (totalEnvelopeCost*taxPercent) + totalEnvelopeCost; //total envelope cost after tax
        
        double totalPurchaseCost = totalSockCost + totalGlassCost + totalEnvelopeCost; //total cost of items before tax
        double totalTaxPurchaseCost = totalTaxSockCost + totalTaxGlassCost + totalTaxEnvelopeCost; //total cost of items after tax
        
        System.out.println("Total cost BEFORE tax for " + nSocks + " socks when price per sock is $" + sockCost + ": $" + df.format(totalSockCost));
        System.out.println("");
        System.out.println("Total cost AFTER tax for " + nSocks + " socks when price per sock is $" + sockCost + ": $" + df.format(totalTaxSockCost));
        System.out.println("");
        System.out.println("Total cost BEFORE tax for " + nGlasses + " glasss when price per glass is $" + glassCost + ": $" + df.format(totalGlassCost));
        System.out.println("");
        System.out.println("Total cost AFTER tax for " + nGlasses + " glasses when price per glass is $" + glassCost + ": $" + df.format(totalTaxGlassCost));
        System.out.println("");
        System.out.println("Total cost BEFORE tax for " + nEnvelopes + " envelopes when price per envelope is $" + envelopeCost + ": $" + df.format(totalEnvelopeCost));
        System.out.println("");
        System.out.println("Total cost AFTER tax for " + nEnvelopes + " envelopes when price per envelope is $" + envelopeCost + ": $" + df.format(totalTaxEnvelopeCost));
        System.out.println("");
        System.out.println("The total cost for " + nSocks + " socks, " + nGlasses + " glasses, and " + nEnvelopes + "envelopes BEFORE tax is: $" + df.format(totalPurchaseCost));
        System.out.println("");
        System.out.println("The total cost for " + nSocks + " socks, " + nGlasses + " glasses, and " + nEnvelopes + "envelopes AFTER tax is: $" + df.format(totalTaxPurchaseCost));
       
       
    }
}