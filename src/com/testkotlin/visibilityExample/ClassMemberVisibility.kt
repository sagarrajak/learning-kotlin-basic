package com.testkotlin.visibilityExample

open class ClassMemberVisibility(private val accountNumber: String) {
    var balance: Double = 30000.0
        private set;

    protected var interestRate: Double = 0.05

    internal val bankCode: String = "BANK123"

    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance+=amount;
            transactionHistory.add("Deposit# $amount")
        }
    }

    fun withDraw(amount: Double): Boolean {
        if (amount >= 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdraw $amount")
            return true;
        }
        return false;
    }

    internal fun getFormattedAccountNumber(): String {
        return "****${accountNumber.takeLast(4)}"
    }

    // Protected method
    protected fun calculateInterest(): Double {
        return balance * interestRate
    }
}

class SavingAccount(accountNumber: String): ClassMemberVisibility(accountNumber) {
    constructor(accountNumber: String, interestRate: Double) : this(accountNumber) {
        this.interestRate = interestRate;
    }

    fun applyInterest() {
        val interest = calculateInterest()
        deposit(balance)
    }
}