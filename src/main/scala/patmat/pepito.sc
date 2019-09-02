val luis=List(1,2)
val pepe=List('a','b','c','a','c','a','a','a','a')

pepe.sorted.span(_=='a')
pepe.sorted.takeWhile(_=='a')
pepe.sorted.dropWhile(_=='a')
Nil.head