package com.account.validation.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Accounts")
public class AccountValidation {
	
	private String messageId;
	private String endToEndID;
	@Id
	private  String debtorAccountNumber;
	private String debtorAccountName;
	private String debtorAddress;
	private String creditorAccountNumber;
	private String creditorAccountName;
	private String creditorAddress;
	private String debitorAgentIdentifier;
	private String creditorAgentIdentifier;
	private String paymentCurrency;
	private int paymentAmount;
	private Date valueDate;
	private String remittanceinfo;
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getEndToEndID() {
		return endToEndID;
	}
	public void setEndToEndID(String endToEndID) {
		this.endToEndID = endToEndID;
	}
	public String getDebtorAccountNumber() {
		return debtorAccountNumber;
	}
	public void setDebtorAccountNumber(String debtorAccountNumber) {
		this.debtorAccountNumber = debtorAccountNumber;
	}
	public String getDebtorAccountName() {
		return debtorAccountName;
	}
	public void setDebtorAccountName(String debtorAccountName) {
		this.debtorAccountName = debtorAccountName;
	}
	public String getDebtorAddress() {
		return debtorAddress;
	}
	public void setDebtorAddress(String debtorAddress) {
		this.debtorAddress = debtorAddress;
	}
	public String getCreditorAccountNumber() {
		return creditorAccountNumber;
	}
	public void setCreditorAccountNumber(String creditorAccountNumber) {
		this.creditorAccountNumber = creditorAccountNumber;
	}
	public String getCreditorAccountName() {
		return creditorAccountName;
	}
	public void setCreditorAccountName(String creditorAccountName) {
		this.creditorAccountName = creditorAccountName;
	}
	public String getCreditorAddress() {
		return creditorAddress;
	}
	public void setCreditorAddress(String creditorAddress) {
		this.creditorAddress = creditorAddress;
	}
	public String getDebitorAgentIdentifier() {
		return debitorAgentIdentifier;
	}
	public void setDebitorAgentIdentifier(String debitorAgentIdentifier) {
		this.debitorAgentIdentifier = debitorAgentIdentifier;
	}
	public String getCreditorAgentIdentifier() {
		return creditorAgentIdentifier;
	}
	public void setCreditorAgentIdentifier(String creditorAgentIdentifier) {
		this.creditorAgentIdentifier = creditorAgentIdentifier;
	}
	public String getPaymentCurrency() {
		return paymentCurrency;
	}
	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}
	public int getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public Date getValueDate() {
		return valueDate;
	}
	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}
	public String getRemittanceinfo() {
		return remittanceinfo;
	}
	public void setRemittanceinfo(String remittanceinfo) {
		this.remittanceinfo = remittanceinfo;
	}
	@Override
	public String toString() {
		return "AccountValidation [messageId=" + messageId + ", endToEndID=" + endToEndID + ", debtorAccountNumber="
				+ debtorAccountNumber + ", debtorAccountName=" + debtorAccountName + ", debtorAddress=" + debtorAddress
				+ ", creditorAccountNumber=" + creditorAccountNumber + ", creditorAccountName=" + creditorAccountName
				+ ", creditorAddress=" + creditorAddress + ", debitorAgentIdentifier=" + debitorAgentIdentifier
				+ ", creditorAgentIdentifier=" + creditorAgentIdentifier + ", paymentCurrency=" + paymentCurrency
				+ ", paymentAmount=" + paymentAmount + ", valueDate=" + valueDate + ", remittanceinfo=" + remittanceinfo
				+ "]";
	}
	
	 
	
	
}
