.class public Out
.super java/lang/Object
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
astore 0
aload 0
ldc "Hej Johan"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 0
ldc 5.0
ldc 5.0
fadd
invokevirtual java/io/PrintStream/println(F)V
.limit locals 50
.limit stack 10
return
.end method
