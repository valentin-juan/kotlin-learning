package org.example

fun main() {

    val accountType = AccountType.CORRENTE

    println(accountType.accountName)

}

enum class AccountType(var accountName: String) {
    CORRENTE("Corrente"),
    POUPANCA("Poupança"),
    SALARIO("Salário")
}