package activities

class Exercise6 {
	
	static void main(args) {
		
		//Empty Map
		def firstMap = [:]
		
		firstMap = ["1":"Wolves", "2":"Dogs", "3":"Cats"]
		
		println(firstMap.get("1"))
		println(firstMap.get("2"))
		println(firstMap.get("3"))
		
		firstMap.put("4", "Deers")
		firstMap.put("5", "Monkeys")
		
		println(firstMap)
		
		for(def item: firstMap)
			println item
			
		def newMap = firstMap.minus("4": "Deers")
		println newMap
		
		//ascending order
		println newMap.values().sort()
		println newMap.values().sort{it.length()}
	}
}
