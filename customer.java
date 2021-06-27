@Path("regCustomer")
@POST
@Consumes(MediaType.APPLICATION_JSON)
public String regCustomer(Customer customer) {
System.out.println("Data Recieved in Register : " + customer);
CustomerDAO custDao = new CustomerDAO();
custDao.register(customer);
String msg = "Hello " + customer.getCustName() + "! Your Registration is Successful." ;
String sub = "Pick-A-Book";
SendMail.sendMail(customer.getEmail(), msg, sub);
return null;
}
