.class public Out
.super java/lang/Object
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
ldc 5.0
fstore 0
ldc 12.0
fstore 1
fload 1
fload 0
fcmpl
ifgt truelabel0
iconst_0
goto endlabel0
truelabel0:
iconst_1
endlabel0:
ifeq BranchEnd0
ldc 5.0
ldc 4.0
fadd
fstore 3
BranchEnd0:
fstore 2
LoopStart0:
fload 0
fload 1
fcmpl
iflt truelabel1
iconst_0
goto endlabel1
truelabel1:
iconst_1
endlabel1:
ifeq BranchEnd1
fload 0
ldc 1.0
fadd
fstore 0
ldc 8.0
fstore 4
goto LoopStart0
BranchEnd1:
fstore 2
ldc 1.0
fstore 6
LoopStart1:
fload 6
ldc 5.0
fcmpl
ifle truelabel2
iconst_0
goto endlabel2
truelabel2:
iconst_1
endlabel2:
ifeq BranchEnd2
fload 2
fstore 7
fconst_1
fload 6
fadd
fstore 6
goto LoopStart1
BranchEnd2:
fstore 2
.limit locals 50
.limit stack 10
return
.end method
