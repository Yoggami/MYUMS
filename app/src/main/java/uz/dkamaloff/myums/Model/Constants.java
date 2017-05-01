package uz.dkamaloff.myums.Model;

import android.net.Uri;

public class Constants {

	private final String allMyNumbers;
	private final String balanceUssdRu;
	private final String callCentre;
	private final String encodedHash;
	private final String latePayment;
	private final String myNumber;
	private final String myPayments;
	private final String dealerId;
	private final String intentId;

	public Constants() {
		this.intentId = "android.intent.action.CALL";
		this.encodedHash = Uri.encode("#");
		this.callCentre = "0890";
		this.balanceUssdRu = "*171*1*1*2";
		this.latePayment = "*171*1*2";
		this.myPayments = "*171*1*3";
		this.myNumber = "*150";
		this.allMyNumbers = "*151";
		this.dealerId = "123456";
	}

	public String getEncodeHash() {
		return this.encodedHash;
	}

	public String getCallCentre() {
		return "0890";
	}

	public String getLatePayment() {
		return "*171*1*2";
	}

	public String getMyPayments() {
		return "*171*1*3";
	}

	public String getMyNumber() {
		return "*150";
	}

	public String getAllMyNumbers() {
		return "*151";
	}

	public String getBalanceUssdRu() {
		return "*171*1*1*2";
	}

	public String getDealerId() {
		return dealerId;
	}

	public String getIntentId() {
		return intentId;
	}
}
