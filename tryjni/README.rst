
JNI
===============================

1. Compile the java code with::

        mvn compile

    This will create header files

2. Compile the C code with something like on Windows::

        gcc -c -I/usr/lib/jvm/java-11-openjdk-amd64/include -I/usr/lib/jvm/java-11-openjdk-amd64/include/linux -Itarget/headers/ -o target/tryjni_App.o src/c/tryjni_App.c
        gcc -shared -o target/libApp.dll target/tryjni_App.o

    Or this on Linux::

        gcc -fPIC -I/usr/lib/jvm/java-11-openjdk-amd64/include -I/usr/lib/jvm/java-11-openjdk-amd64/include/linux -Itarget/headers/ -shared -o target/libApp.so src/c/tryjni_App.c

    Where the usr directories are ``$JAVA_HOME``.

3. Run using::

        java -Djava.library.path=target/ -cp target/classes/ tryjni.App



Main source: https://www3.ntu.edu.sg/home/ehchua/programming/java/JavaNativeInterface.html
