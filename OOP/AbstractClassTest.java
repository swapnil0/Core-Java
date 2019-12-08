import edu.met.banking.*;

class AbstractClassTest{

	public static void main(String[] args){
		Account jack = Banker.openCurrentAccount();
		jack.deposit(20000);
		Account jill = Banker.openSavingsAccount();
		jill.deposit(15000);
		try{
			double amt = Double.parseDouble(args[0]);
			jill.transfer(amt, jack);
		}catch(InsufficientFundsException e){
			System.out.println("Transfer failed due to lack of funds!");
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.printf("Jack's Account ID is %d and Balance is %.2f%n", jack.getId(), jack.getBalance());
		System.out.printf("Jill's Account ID is %d and Balance is %.2f%n", jill.getId(), jill.getBalance());
	}

}

