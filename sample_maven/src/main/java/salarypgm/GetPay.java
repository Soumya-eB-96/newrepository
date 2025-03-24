package salarypgm;

public class GetPay extends BasicPay {// parent B
	
	int HRA;
	int pf;
	
	
	public void Allowance()
	{
		HRA = (int) (0.05*Basic);
		pf = (int) (0.2*Basic);
		
	}
	
}
