PetShop.class: PetShop.java Pet.class Dog.class Cat.class
	javac -g PetShop.java
Dog.class: Dog.java Pet.class
	javac -g Dog.java
Cat.class: Cat.java Pet.class
	javac -g Cat.java
Pet.class: Pet.java Pleasant.class PetAtribute.class
	javac -g Pet.java
Pleasant.class: Pleasant.java PetAtribute.class
	javac -g Pleasant.java
PetAtribute.class: PetAtribute.java
	javac -g PetAtribute.java
clean:
	rm *.class
run:	PetShop.class
	java PetShop
update:
	jar uf petjar.jar *
runjar:	petjar.jar
	java -jar  petjar.jar 
degbug:
