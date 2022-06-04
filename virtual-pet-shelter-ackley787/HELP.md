# Virtual Pet Shelter

## Required Tasks to be completed in the order you feel is necessary

### Setup
- [ ] Update the README.md file in your project folder to describe what you've done with your project. No fancy formatting is necessary. Just separate paragraphs with an empty line. (If you'd like to learn more about Markdown formatting, check out the [Github Markdown Guide](https://guides.github.com/features/mastering-markdown/).)

### VirtualPetShelterApp class

- Create a `main` method that…
	- [ ] implements a *game loop*.
	- [ ] asks for user input.
	- [ ] writes output to the console.
	- [ ] calls `VirtualPetShelter`'s `tick` method after each interaction

- Available user interface actions should include (at minimum)…
	- [ ] feeding all the pets
	- [ ] watering all the pets
	- [ ] playing with an individual pet, which should display a list of pet names and descriptions, allowing a user to select one
	- [ ] allow adoption of a pet, which should display a list of pet names and descriptions, allowing a user to select one.  _NOTE: In the past this has been a bit confusing.  Keep in mind you are playing the role of a shelter worker, if a pet is adopted it will be removed from the shelter._
	- [ ] allow intake of a pet, prompting the user for the pet's information, requiring the user to (at minimum) specify name and description

	(*Hint: you can use tab characters ("\t") to align console output in columns.*)

### VirtualPetShelter class

- [ ] include appropriate instance variable(s) to store the pets who reside at the shelter
- [ ] include methods that:
	- [ ] return a `Collection` of all of the pets in the shelter
	- [ ] return a specific `VirtualPet` given its name
	- [ ] allow intake of a homeless pet (adding a pet to the shelter)
	- [ ] allow adoption of a homeless pet (removing a pet from the shelter)
	- [ ] feed all of the pets in the shelter
	- [ ] water all of the pets in the shelter
	- [ ] plays (or performs some other interaction(s)) with an individual pet in the shelter
- [ ] include a `tick` method that calls the `tick` method for each of the pets in the shelter, updating their needs

### VirtualPet class
	
In addition to the requirements from [last week's project](./virtual-pet):
- [ ] include instance variables representing:
	- [ ] name (from the above example, this might be "Tommy")
	- [ ] description (from the above example, this might be "smells like a Stargazer lily fresh with morning dew")
- [ ] include a constructor that accepts a name and description
- [ ] include a constructor that, in addition to name and description, accepts default values for the pet's attributes (hunger, boredom, etc)
- [ ] Do **not** include a default (zero arguments) constructor.
 
### Grading
Your grading will be based on three areas:
- Working Software
- Clean Code
- Test Driven Development (will be assessed but will not required to pass) 

#### Working Software
Working software consists of does the application run and how well you met the requirements.  Of the 30 required tasks above, we need to see 25 complete for this category to be considered PASSING.

#### Clean Code
Clean code deals with how your code is written.  Is it readable, easy to understand, formatted, and not littered with commented out code?   These are the things we will be looking for:

- Keep method chains to a minimum. (Three chained methods in the entire project are permissable.)
- Formatted code - This is the simplest task, use _CTRL + ALT + L_ to have IntelliJ format your code for you.
- Variable and Method Names - Variables and method names should inform the reader what the purpose of the variable or method is.  A `feed()` method that affects the `hunger` field variable in your `VirtualPet` class is an example of good naming.
- If you use descriptive method and variable names, your reliance on comments can be reduced.  And you should never leave blocks of commented out code in your committed code. 


We are looking for adherence to all four of the above principles for this category to be considered PASSING.

#### Test Driven Development 
Should you decide to go with full TDD approach, write your code by writing tests first.  Each public method you write should have a unit test that covers its behavior.  Try to apply the principles of clean code to your test classes. 

## Stretch Tasks

- [ ] Consider any stretch tasks from last week's project that you did not attempt.
- [ ] Keep track of the cleanliness of individual pets' cages and offer an option in the user interface to clean pet cages
- [ ] DNA! In order to give your pets individual character, include as part of each pet's state one or more multipliers for needs so that one pet may become hungrier/thirstier/more bored slower/faster than another pet. (*Tip: you could create a class to encapsulate this.*)
