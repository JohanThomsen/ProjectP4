.class public Out
.super java/lang/Object
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
astore 5
new java/util/Scanner
dup
getstatic java/lang/System.in Ljava/io/InputStream;
invokespecial java/util/Scanner.<init>(Ljava/io/InputStream;)V
astore 6
ldc 5.0
fstore 7
ldc 12.0
fstore 8
aload 5
ldc 6.0
invokevirtual java/io/PrintStream/println(F)V
fload 7
fload 8
invokestatic Out/plus(FF)V
.limit locals 9
.limit stack 10
return
.end method


.method public static plus(FF)V
getstatic java/lang/System/out Ljava/io/PrintStream;
astore 11
fstore 9
fstore 10
ldc 1.0
ldc 1.0
fadd
.limit locals 12
.limit stack 10
return
.end method
