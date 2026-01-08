package com.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "C:\\Users\\athig\\eclipse-workspace\\AugJavaBatch3\\Selenium\\SecCucumber\\src\\test\\java\\com\\test\\runner\\Runner.java",
	glue = "com.app.stepdefinition",
	tags = "@test1_list",
	dryRun = false,
	publish = true,
	monochrome = true)
	public class Runner {

	}

