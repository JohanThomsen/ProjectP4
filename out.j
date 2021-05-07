.class public Out
.super java/lang/Object
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
ldc 5.0
fstore 5
ldc 12.0
fstore 6
aload null
invokestatic plus()V
.limit locals 2
.limit stack 10
return
.end method
.method public plus(FF)V
fload 7
fload 8
fadd
return
.end method
