package activities

class Exercise1 {
	
	static void main(args) {
	//Un-initialized variables
	def x //In Groovy
	int y //In Java
	
	//Array
	def arr = [1, 2.0, "Saahil", true, x, y]
	
	println arr
	
	arr.each { println "ValueIs: "+it+ ". Data type is: "+ it.getClass() }
	}
}
