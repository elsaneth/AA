# n-s arv Fibonacci jadas

Rekursiivne funktsioon tähendab, et funktsioon kutsub esile iseennast.

On teada:
Fibonacci(0) = 0
Fibonacci(1) = 1
Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)

1. Kui n on 0, tagastatakse 0, kuna Fibonacci jada esimene element on alati 0.
2. Kui n on 1, tagastatakse 1, kuna Fibonacci jada teine element on alati 1.
3. Kui n ei ole 0 ega 1, siis rakendatakse rekursiooni, et leida Fibonacci jada element kohal n. 

Funktsioon teeb kaks rekursiooni:
- recursiveFibonacci(n - 1) - kutsub esile iseenda funktsiooni nii kaua kuni saavutab baasväärtused (0 või 1), mille korral rekursioon lõpeb
- recursiveFibonacci(n - 2) - kutsub esile iseenda funktsiooni nii kaua kuni saavutab baasväärtused (0 või 1), mille korral rekursioon lõpeb
  Tekib nö kaks haru. Liidetakse väärtused "1" harus 1 (recursiveFibonacci(n - 1)) ning harus 2 (recursiveFibonacci(n - 2)). Kahe haru summa on Fibonacci jada elemendi väärtus positsioonil n.

Näide Fibonacci jada 4. liikme leidmisest:

![image](https://github.com/elsaneth/AA/assets/106624129/29f9782b-7f84-4885-b307-c66279fb20c3)

