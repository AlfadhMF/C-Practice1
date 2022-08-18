package Steps;


import Pages.DashBoardPage;
import Pages.RegisterPage;

public class PageInitializer {

    public static   RegisterPage registerPage;

    public static DashBoardPage dashBoardPage;

    public static void InitializePageObject(){

        registerPage=new RegisterPage();
        dashBoardPage= new DashBoardPage();




    }
}
