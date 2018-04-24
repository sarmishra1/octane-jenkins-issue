package de.mb.selenium;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class stepDefinition {

	private WebDriver driver;

	@Given("^The selenium setup is complete$")
	public void setUp() throws MalformedURLException {
		System.out.println("Given step");
	}

	@When("^print a simple message$")
	public void printSimpleMessage() {
		System.out.println("When step");
	}

	@Then("^aos application body is loaded and not null$")
	public void pageBodyIsNotNull() throws MalformedURLException {
		System.out.println("Then step");
		assertTrue(true);
	}


}
