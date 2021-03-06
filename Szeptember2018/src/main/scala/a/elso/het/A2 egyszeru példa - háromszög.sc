// http://learnyouahaskell.com/starting-out#an-intro-to-lists
// Haskell kód:
// let rightTriangles' =
// [ (a,b,c) | c <- [1..10], b <- [1..c], a <- [1..b], a^2 + b^2 == c^2, a+b+c == 24]

val háromszög = for {
  c <- 1 to 10
  b <- 1 to c
  a <- 1 to b

  if a * a + b * b == c * c // ez egy háromszög
  if a + b + c == 24 // és kerülete 24 egység
}
  yield (a, b, c)

println(háromszög)