package com.class32;
import java.util.ArrayList;
import java.util.Iterator;
public class CreditCardTest {
	    
	    public static void main(String[] args) {
	        
	        
	        Visa visa = new Visa("Visa Platinum");
	        
	        PNC pnc = new PNC("PNC Rewards");
	        
	        AX ax = new AX("AX basic");
	        
	        // different classes so it means they are hetrogenous
	        // always go for parent class, if we are going with hetrogenous
	        
	        ArrayList<CreditCard>alist = new ArrayList<>();
	        
	        alist.add(visa);
	        alist.add(pnc);
	        alist.add(ax);
	        // how can i get a name of each card?
	        for (CreditCard card:alist) {
	            
	            System.out.println(card.creditCardName);
	            //card.annualFee();
	            System.out.println("---------------------------");
	        }
	        //how can we print an interest rate of each card
	        Iterator<CreditCard> myIterator=alist.iterator();
	        while(myIterator.hasNext()) {
	        	CreditCard obj = myIterator.next();
	        	obj.interestRate();
	        	
	        }System.out.println("--------------------------");
	        
	        //how to print an annual fee of each card 
	        for (int i=0; i<alist.size(); i++) {
	        	CreditCard obj = alist.get(i);
	        	obj.annualFee();
	        }
	        
	        
	    }
	}
