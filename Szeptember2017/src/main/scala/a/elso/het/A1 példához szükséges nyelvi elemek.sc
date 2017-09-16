// konstans definiálása (immutable)

val méret = 150



// nem kötelező a zárójel
// függvény, illetve metódus hívásakor ha nincs paramétere
// lásd a sor végén a sorted nevű függvény hívását

val összesVödör = List(47, 11, 30).sorted



// A lista elejére fűzés. List(45, 11, 30) az eredmény

45 :: List(11, 30)



// def kulcsszóval kezdődik a függvény definíciója
// : List[Int] - paraméter illetve visszatérési érték
// típusának definiálása

// függvény definíciójának elején (most a  { -jel előtt)
// kötelező az = -jel

def töltsd(vödrök: List[Int]): List[Int] = {

  // ...

  List()
 }
