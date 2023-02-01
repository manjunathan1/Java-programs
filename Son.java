class Son extends Father{
String name="udhayanidhi";
public static void main(String[]args){
Son son_obj=new Son();
System.out.println(son_obj.name);
son_obj.producer();
son_obj.do_politics();
son_obj.do_exercise();
son_obj.direct();
}
public void producer(){
System.out.println("Producer");
}
public void do_politics(){
super.do_politics();.
System.out.println("social media");
}
}
