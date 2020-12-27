package com.stepDefination;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class E_commerceApp002 {
	String userName;
	String password;
	
	
	@When("enters the given data")
	public void enters_the_given_data(DataTable loginTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

	// How can I  implement this table information
		List<List<String>> list=loginTable.asLists(String.class); // this line must be 
		
		// Then what I have to do 
		System.out.println("-------------------------------------------------------");
		for(List<String> li:list)
		{
			int i=0;
			for(String str:li)
			{
				if(i==0)
				{	System.out.println("UserName :: "+str);this.userName=str; i++;} // Yes I am getting the as per my expectation then what I have to do 
				else
				{   System.out.println("Password :: "+str); this.password=str;}
			}
			System.out.println("-------------------------------------------------");
		}
		
	
	// How to pass these values into the application and How to do the operation from this class 
	
	}


}
