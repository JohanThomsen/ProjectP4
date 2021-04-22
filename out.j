.class public examples/out
.super java/lang/Object
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
.limit locals 10
.limit stack 10
ldc 4.0
ldc 1.0
ldc 2.0
fadd
fmul
getstatic java/lang/System/out Ljava/io/PrintStream;
astore 9
invokestatic java/lang/String/valueOf(F)Ljava/lang/String;
astore_3
aload 9
aload_3
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
