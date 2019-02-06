public class Main
{
	public static void main(String[] args) {
		WebCrawler crawler = new WebCrawler();
		String rootUrl= "http://www.facebook.com";
		crawler.discoverWeb(rootUrl);
	}
}
