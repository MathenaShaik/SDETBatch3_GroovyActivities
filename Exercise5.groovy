package activities

class Exercise5 {
	
	static void main(args) {
	def listNew = [11, 2, 19, 5, "Mango", "Apple", "Watermelon"]
	
	def strList = listNew.minus([11,2,19,5])
	
	def intList = listNew.minus(["Mango","Apple","Watermelon"])
	
	println "Original String - ${listNew}"
	
	println "Integer list : ${intList.sort()}"
	
	println "String list : ${strList.sort()}"	
	
	}
	
}
