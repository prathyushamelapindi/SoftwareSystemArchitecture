package prathyu;

public class MakeWithdrawBelowMinBalance1 extends MakeWithdrawBelowMinBalanceAbstract {

	@Override
	public boolean process(DatastoreAbstract dataStore){

		dataStore.withdrawWithPenalty();
		return true;
	}

}
