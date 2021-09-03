javac -cp info/kgeorgiy/ja/kosogorov/hello/* info/kgeorgiy/ja/kosogorov/hello/*.java -d out
java -cp out info.kgeorgiy.ja.kosogorov.hello."$1" "${@:2}"