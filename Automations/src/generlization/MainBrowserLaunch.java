package generlization;  

public class MainBrowserLaunch extends NavigateTo{

	public static void main(String[] args) throws InterruptedException {
			
		NavigateTo ip = new NavigateTo();
		
		ip.chrome();
	
		ip.edge();
		
		ip.firefox();
		
	}

}
