#Auto generated Octane revision tag
@TID20087REV0.1.0
Feature: Run basic functional test
	Scenario: Check to see if aos application body is not null
		Given The selenium setup is complete
		When aos application body is loaded and not null
		Then close the web browser