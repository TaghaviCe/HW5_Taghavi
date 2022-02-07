//- Determine complexity of following piece of codes:
//1
//int n = 5;                       1
//println("Your input is: " + n);  1
//                  complexity:1+1=2

//2
//  for (int i = 0; i < n; i++) {         n+1
//    println("Your output is " + i);      n
//   }
//                       complexity:n+1+n=2n+1


//3
//    for (int i = 1; i <= n; i++) {                           n
//       for(int j = 1; j <= n; j++) {                         n
//          println("Your output is " + i + " and " + j);     n*n=n^2
//       }
//     }
//    for (int i = 1; i <= factorial(n); i++){               factorial(n)
//      println("Your output is " + i);                      factorial(n)
//     }
//                                                complexity:n+n+n^2+2*factorial(n)