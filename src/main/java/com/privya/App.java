package com.privya;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

//pii_set = {'email_id','confirm_ip_address','optin_ip_address','subscriber','email_name','usernamesmanager','usernames_manager', 
//'profilesmanager','accountprofile','full_name','shipping_address','billing_address','shipping_address_final','billing_address_final','billing_profile','user_id','receipt', 'user','contact', 'email', 'phone', 'password','username','firstname','lastname','first_name','last_name','gender','credit_card','crypto','email_address','salary',\
//               'iban_code','ip_address','nrp','phone_number','bank_number','driver_licens','eus_itin','us_passport','us_ssn','vmsg','birthday','payment-info'}

	private String email_id;
	

	private String confirm_ip_address;

	private String optin_ip_address;

	private String subscriber;
	
	private String usernamesmanager;

	private String phone_number;

	private String driver_licens;


	private String email_name = "John!";

	public void checkVarsInScope(){
		String  billing_address_final= "aa";
		String full_name = "Dug Cutting";
	}
	


}