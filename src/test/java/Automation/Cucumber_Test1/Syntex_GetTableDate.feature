Feature: To Test the Nexgen Register Page

  Scenario: Enter all mandetory fields
    Given launch the application
    When enter registeration deatils
      | FirstName | LastName | Gender | Email      | Code |
      | pavan     | kumar    | Mail   | pavan4331@gmail.com |   99 |
    Then click on submite button
    And close the application

    ##public void enter_registeration_deatils(io.cucumber.datatable.DataTable dataTable) {
#	    
#	    // For automatic transformation, change DataTable to one of
#	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
#	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
#	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
#	    //
#	    // For other transformations you can register a DataTableType.
#		List<List<String>> data=dataTable.asLists();
#		
#		System.out.println(data.get(1).get(0));  o/p:pavan
#		System.out.println(data.get(1).get(1));  o/p:kumar
#		System.out.println(data.get(1).get(2));  o/p:mail
#		System.out.println(data.get(1).get(3));		o/p:pavan@gmail.com
#		System.out.println(data.get(1).get(4));   o/p:99
#	    
#	}
    