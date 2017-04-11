package abc;

import abc.Admin.AdminLogin_Page;
import abc.User.CustomerLogin_Page;

public class GUI_Frame{

  public static void main(String[] args) {
    javax.swing.JFrame AdminPage = new AdminLogin_Page();
    javax.swing.JFrame LoginPage = new CustomerLogin_Page();
  }
}