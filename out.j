.class public Out
.super java/lang/Object
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
ldc 1.0
fstore 5
LoopStart0:
fload 5
ldc 5.0
fcmpl
ifle truelabel0
iconst_0
goto endlabel0
truelabel0:
iconst_1
endlabel0:
ifeq BranchEnd0
fload 6
fstore 7
fconst_1
fload 5
fadd
fstore 5
goto LoopStart0
BranchEnd0:
.limit locals 35
.limit stack 10
return
.end method
