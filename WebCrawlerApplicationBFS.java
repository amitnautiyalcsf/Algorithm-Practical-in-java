import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.net.URL;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException;
import java.io.InputStreamReader;
public class WebCrawler
{
    private Queue<String> queue;
    private List<String>discoveredWebsiteList;
    
    public WebCrawler()
    {
        this.queue= new LinkedList<>();
        this.discoveredWebsiteList= new LinkedList<>();
        
        
    }
    public void discoverWeb(String root)
    {
        this.queue.add(root);
        this.discoveredWebsiteList.add(root);
        
        while(!queue.isEmpty())
        {
            String v =this.queue.remove();
            String rawHtml= readURL(v);
            String regexp="http://(\\w+\\.)*(\\w+)";
            Pattern pattern = Pattern.compile(regexp);
            Matcher matcher=pattern.matcher(rawHtml);
            
            while(matcher.find())
            {
                String actualUrl= matcher.group();
                
                if(!discoveredWebsiteList.contains(actualUrl))
                {
                    discoveredWebsiteList.add(actualUrl);
                    System.out.println("website has been found with URL:" + actualUrl);
                    queue.add(actualUrl);
                    
                }
                
            }
        }
        
    }
    public String readURL(String v)
    {
        
        String rawHtml = "";
        try{
            URL url= new URL(v);
            BufferedReader in= new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine= "";
            while((inputLine= in.readLine()) != null)
            {
                rawHtml+=inputLine;
                
            }
            in.close();
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            
        }
        return rawHtml;
    }
}
