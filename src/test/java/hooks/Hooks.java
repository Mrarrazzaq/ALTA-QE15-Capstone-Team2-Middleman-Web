package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static WebDriver driver;

    public static ChromeOptions GenerateDriverChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox",
//                "--single-process", -> Bikin error di windows
                "--ignore-ssl-errors=yes",
                "--ignore-certificate-errors",
                "--window-size=1280,800",
                "--remote-allow-origins=*"
//                            , "headless"
        );
        return options;
    }

    @Before
    public void openBrowser(){
        //inisiasi library selenium
//        driver = new ChromeDriver(GenerateDriverChrome());

//        String appUrl = "https://www.saucedemo.com/";
//        String appUrl = "https://middleman-fe.vercel.app/";
//        driver.get(appUrl);//fungsi untuk ngebuka link html
//        driver.manage().window().maximize();//fungsi untuk maximize browser
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);

        String appUrl = "https://middleman-fe.vercel.app/auth/welcome";
        driver.get(appUrl);
        driver.manage().window().maximize();
    }

    @After
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
}

