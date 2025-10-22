package com.testkotlin.visibilityExample

// public visible everywhere
class Company(val name: String, val salary: Double)

// internal only this project
internal class InternalProject(val name: String)

// Private - visible only in this file
private class SecretFormula(val formula: String)

fun companyOperation() {
    var company = Company("Jhon", 1300.0)
    val project = InternalProject("some project")
    val formula = SecretFormula("C8H10N4O2")
    println("Company operating normally")
}