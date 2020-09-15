package activities

class Exercise4 {
	
	static void main(args) {
	
	def myString = "This is Groovy Language"
	
	def revString = myString.reverse();
	println "Reversed String : "+revString
	
	def subStrMyString = myString.substring(8,23)
	println "Substring : "+subStrMyString
	
	def splitString = myString.split(" ")
	println "Splitted String :"+splitString
	
	def remMyString = myString.minus("Groovy")
	println "Removed String : "+remMyString
	
	def lowerCaseString = myString.toLowerCase();
	println "Lower Case String :"+lowerCaseString
	
	def upperCaseString = myString.toUpperCase();
	println "Upper Case String : "+upperCaseString
	
	//matches()	
	def matchStatus = myString.matches("(.*)Groovy(.*)")	
	if(matchStatus) { 
		println "String matches" 
		}
	
	//replaceAll()	
	def replaceWith = "very Groovy"	
	println(myString.replaceAll("Groovy", replaceWith))	
	
	//Notice that the original string is not changed	
	println myString
	
	}
}
