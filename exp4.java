
public class exp4 {
    public static void main (String[] args) {

        String firstname = System.getenv("Firstname");
        String lastname = System.getenv("Lastname");

        if(firstname == null || lastname == null) {
            System.out.println("Firstname or Lastname parameter is missing");
        } else {
            System.out.println("Firstname " + firstname);
            System.out.println("Lastname  " + lastname);
        }
    }
}