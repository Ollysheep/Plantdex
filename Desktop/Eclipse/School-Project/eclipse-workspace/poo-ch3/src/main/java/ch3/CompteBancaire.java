package ch3;

public class CompteBancaire {
	public String owner;  
    public Double sold; 
    public TypeDeCompte accountType;
    
    public CompteBancaire (String owner, Double sold, TypeDeCompte accountType) {
    	this.owner = owner;
        this.sold = sold;
        this.accountType = accountType;
    }
    
    public TypeDeCompte getAccountType() {
        return accountType;
    }
}
