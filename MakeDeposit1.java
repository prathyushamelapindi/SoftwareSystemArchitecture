package prathyu;

public class MakeDeposit1 extends MakeDepositAbstract {

	@Override
	public void process(DatastoreAbstract dataStore) {
		
		dataStore.deposit();
		
	}

}
