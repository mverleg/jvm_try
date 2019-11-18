
JNI
===============================

1. Compile the java code with::

        mvn compile

    This will create header files

2. Compile the C code with something like on Windows::

        gcc -c -I/usr/lib/jvm/java-11-openjdk-amd64/include -I/usr/lib/jvm/java-11-openjdk-amd64/include/linux -Itarget/headers/ -o target/mul.o src/c/mul.c
        gcc -shared -o target/mul.dll target/mul.o

    Or this on Linux::

        gcc -fPIC  -c -I/usr/lib/jvm/java-11-openjdk-amd64/include -I/usr/lib/jvm/java-11-openjdk-amd64/include/linux -Itarget/headers/ -shared -o target/mul.so src/c/mul.c

    Where the usr directories are ``$JAVA_HOME``.

3. Run using::

        java -Djava.library.path=target/ -cp target/classes/ tryjni.App
