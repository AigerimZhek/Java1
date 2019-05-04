package com.class32;

public abstract class CreditCard {
	
		
	public String creditCardName;
	    
	    public CreditCard(String creditCardName) {
	        
	        this.creditCardName = creditCardName;
	    }

	    
	    public void openAccount() {
	        
	        System.out.println("Open "+creditCardName+" credit card");
	    }
	    
	    
	    public abstract void interestRate();
	    public abstract void annualFee();
	}
	class Visa extends CreditCard {
	    
	    public Visa(String creditCardName) {
	        super(creditCardName);
	    }


	    @Override
	    public void interestRate() {
	        System.out.println(creditCardName +" card has interst rate of 25%");
	        
	    }

	    @Override
	    public void annualFee() {
	        // TODO Auto-generated method stub
	        System.out.println(creditCardName +" card has annual fee of $250");
	    }
	    
	}
	    class PNC extends CreditCard {
	        
	        public PNC(String creditCardName) {
	            super(creditCardName);
	        }


	        @Override
	        public void interestRate() {
	            System.out.println(creditCardName +" card has interst rate of 15%");
	            
	        }

	        @Override
	        public void annualFee() {
	            // TODO Auto-generated method stub
	            System.out.println(creditCardName +" card has annual fee of $150");
	        }
	    }
	    class AX extends CreditCard {
	        
	        public AX(String creditCardName) {
	            super(creditCardName);
	        }


	        @Override
	        public void interestRate() {
	            System.out.println(creditCardName +" card has interst rate of 25%");
	            
	        }

	        @Override
	        public void annualFee() {
	            // TODO Auto-generated method stub
	            System.out.println(creditCardName +" card has annual fee of $250");
	        }
	    }
