#Инструкция (объяснение):
Создаем лист, в котором содержатся случайные слова:

List<String> words=Arrays.asList("This","is","a","list","of","random","words");

Затем при помощи StreamAPI и метода reduce() мы объединяем слова в одно предложение.

String oneLine=words.stream().reduce((word1, word2)->word1+" "+word2).orElse("");

Посмотрим, что вывелось в консоль.
##Результат:
List of words: [This, is, a, list, of, random, words]

A sentence of these words: This is a list of random words.

Вторая цель выполнена, программа запустилась как надо, без ошибок.