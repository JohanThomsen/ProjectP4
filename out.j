.class public Out
.super java/lang/Object
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
new class java/util/Scanner
dup
getstatic java/lang/System.in Ljava/io/InputStream;
invokespecial java/util/Scanner.<init>(Ljava/io/InputStream;)V
astore 1
aload 1
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String;
astore 0
getstatic java/lang/System/out Ljava/io/PrintStream;
astore 2
aload 2
aload 0
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
.limit locals 3
.limit stack 10
return
.end method
