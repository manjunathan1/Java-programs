class Theaters{
int total;
public static void main(String[]args){
Theaters raja=new Theaters();
int balance=raja.bookTicket(200);
System.out.println(balance);
}
int bookTicket(int total){
this.total=total;
int ticket_price=120;
int balance=total-ticket_price;
return balance;
}
}




