
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class co {
    
    public static void main(String[] args) throws InterruptedException, IOException
    {
        int times = 1;
        int tests = 5;
        double start = System.currentTimeMillis();
        int success = 0;
        
            while (times <= tests)
            {
                String url = "";
                System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get("http://www.youtube.com");
                driver.findElement(By.id("search")).sendKeys("well hello there");
                driver.findElement(By.id("search-icon-legacy")).click();
                url = driver.getCurrentUrl();
                driver.close();
                times++;
                if(url.indexOf("well")!=-1)
                {
                    success++;
                }
            }
        
        double finish = System.currentTimeMillis();
        double totalTime = finish - start;
        System.out.println("Combined loading time for 5 pages - "+totalTime);
        System.out.println("Avrage loading time - "+totalTime/5);
        System.out.println(success + " Correct serches out of " + tests + " tests");
        
        
        File file = new File("C:\\Save.txt");
        FileWriter fr = new FileWriter(file, true);
        fr.write("Combined loading time for "+tests+" pages - "+totalTime+"\r\n"+"Avrage loading time - "+totalTime/5+"\r\n"+success + " Correct searches out of "+tests+" tests"+"\r\n"+"\r\n");
        fr.close();
        
        
            
    }

        
    

    
}