package commonGenerlization;

public interface CommonPropertys {


	String chromeKey = "webdriver.chrome.driver";
	String chromePath = "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe ";
	
	String edgeKey = "webdriver.edge.driver";
	String edgePath = "E:\\E Drive\\software testing\\Selenium server\\msedgebrowser\\msedgedriver.exe";
	
	String firefoxkey = "webdriver.gecko.driver";
	String FirefoxPath = "E:\\E Drive\\software testing\\Selenium server\\geckodriver.exe";
	
	
	public void chrome() throws InterruptedException;
	
	public void edge() throws InterruptedException;
	
	public void firefox() throws InterruptedException;
	
	
}
