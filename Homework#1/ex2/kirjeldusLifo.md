# LIFO andmestruktuur

1. Defineerin tühja listi, millega hakkab tegevus

2. FUNKTSIOONID

2.1. Push
Pythoni append funktsioon lisab elemendi listi lõppu

2.2. Pop
Pythoni slicing meetodi abil eemaldan indeksi põhjal viimase elemendi

2.3. Peek
Tagastab viimase elemendi listist indeksi abil

2.4. Size
Tagastab len funktsiooni abil listi pikkuse (mitu elementi on listis)

3. AJALINE KEERUKUS:

3.1. **push(element)**: See operatsioon lisab kindla elemendi _stack'i_. _list.append()_ operatsioon on tavaliselt ajalise keerukusega O(1), mis tähendab, et selle aja kulutamine ei sõltu _stack'i_ suurusest. Seega on ajaline keerukus **O(1)**.

3.2. **pop()**: See operatsioon eemaldab viimati lisatud elemendi stack'ist. Kood kasutab lõikamist (_slicing_), et eemaldada viimane element. Lõikamise ajaline keerukus sõltub listi suurusest, nii et see on **O(n)**, kus n on _stack'i_ praegune suurus - 1.

Kasutades teeki _time_, näitasid ka mõõtetulemused, et _pop()_ funktsiooni jaoks kulus rohkem aega, kui teiste (ligi 8 korda rohkem):

![image](https://github.com/elsaneth/AA/assets/106624129/85a48bab-8b17-43df-879f-5c2797c0cdce)

3.3. **peek()**: See operatsioon lihtsalt tagastab viimati lisatud elemendi _stack'ist_. Selle ajaline keerukus on **O(1)**, kuna see ei muutu _stack'i_ suurusest.

3.4. **size()**: See operatsioon tagastab _stack'i_ suuruse, mis on lihtsalt listi pikkus. Selle ajaline keerukus on **O(1)**, kuna see ei sõltu _stack'i_ sisu suurusest.

Seega kogu koodi ajaline keerukus on O(n), kuna _pop()_ funtksiooni ajaline keerukus on **O(n)**. Võimalus on kasutada _slicing_ meetodi asemel Pythoni _pop_ funktsiooni, mis eemaldab listist viimase elemendi, sellisel juhul oleks ajaline keerukus O(1).
