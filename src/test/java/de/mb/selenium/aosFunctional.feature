#Auto generated Octane revision tag
@TID53002REV0.1.0
Feature: Run basic functional test
	Scenario: Check to see if aos application body is not null
		Given The selenium setup is complete
		When print a simple message
		Then aos application body is loaded and not null
